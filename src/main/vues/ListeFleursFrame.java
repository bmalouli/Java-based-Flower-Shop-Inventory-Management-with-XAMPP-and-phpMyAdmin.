package main.vues;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import modelInventaire.Inventaire;
import controleurInventaire.ControleurInventaire;

public class ListeFleursFrame extends JFrame {
    private List<Inventaire> listeInventaire;
    private JPanel contentPane;

    public ListeFleursFrame() {
        ControleurInventaire cont = ControleurInventaire.getControleurInventaire();
        this.listeInventaire = cont.CtrI_GetAll();
        
    	setTitle("Lister les fleurs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblFleursEnStock = new JLabel("Inventaire des fleurs");
        lblFleursEnStock.setForeground(new Color(178, 114, 118));
        lblFleursEnStock.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursEnStock.setBounds(282, 25, 238, 29);
        contentPane.add(lblFleursEnStock);
        
        JButton btnNewButton = new JButton("Retour au menu");
        btnNewButton.setForeground(new Color(167, 116, 117));
        btnNewButton.setBounds(19, 537, 143, 29);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FleuristeTitaniaMenu menuTitanaiFrame = new FleuristeTitaniaMenu();
                menuTitanaiFrame.setVisible(true);
                dispose();
            }
        });
        contentPane.add(btnNewButton);
   
        JTable tableau = new JTable(listeInventaire.size(),5);
        
        String[] columnNames = { "Id", "Nom", "Couleur", "Prix", "Quantité" };
        for(int i=0;i<tableau.getColumnCount();i++)
        {
        TableColumn column1 = tableau.getTableHeader().getColumnModel().getColumn(i);
        column1.setHeaderValue(columnNames[i]);
        } 
        tableau.getTableHeader().setBackground(new Color(243, 231, 230));
        tableau.getTableHeader().setForeground(new Color(178, 114, 118));
        for (int i = 0;i<listeInventaire.size();i++) {
        	Inventaire fleur =listeInventaire.get(i);
        	tableau.setValueAt(fleur.getId(), i, 0);
        	tableau.setValueAt(fleur.getName(), i, 1);
        	tableau.setValueAt(fleur.getColor(), i, 2);
        	tableau.setValueAt(fleur.getPrice(), i, 3);
        	tableau.setValueAt(fleur.getQuantity(), i, 4);
        }
        
        JScrollPane scrollPaneLister = new JScrollPane(tableau);
        scrollPaneLister.setBounds(52, 100, 687, 386);
        contentPane.add(scrollPaneLister);
    }
}
