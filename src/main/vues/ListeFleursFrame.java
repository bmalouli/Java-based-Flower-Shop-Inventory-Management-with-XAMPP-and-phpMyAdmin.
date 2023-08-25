package main.vues;
import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import modelInventaire.Inventaire;
import controleurInventaire.ControleurInventaire;

public class ListeFleursFrame extends JFrame {
    private List<Inventaire> listeInventaire;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ListeFleursFrame frame = new ListeFleursFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

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
        
        JLabel lblID = new JLabel("ID");
        lblID.setForeground(new Color(182, 134, 111));
        lblID.setBounds(63, 111, 22, 16);
        contentPane.add(lblID);
        
        JLabel lblNom = new JLabel("NOM");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(176, 111, 36, 16);
        contentPane.add(lblNom);
        
        JLabel lblCouleur = new JLabel("COULEUR");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(337, 111, 61, 16);
        contentPane.add(lblCouleur);
        
        JLabel lblPrix = new JLabel("PRIX");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(525, 111, 36, 16);
        contentPane.add(lblPrix);
        
        JLabel lblQuantite = new JLabel("QUANTITÉ");
        lblQuantite.setForeground(new Color(182, 134, 111));
        lblQuantite.setBounds(660, 111, 71, 16);
        contentPane.add(lblQuantite);
        
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
        for (int i = 0;i<listeInventaire.size();i++) {
        	Inventaire fleur =listeInventaire.get(i);
        	tableau.setValueAt(fleur.getId(), i, 0);
        	tableau.setValueAt(fleur.getName(), i, 1);
        	tableau.setValueAt(fleur.getColor(), i, 2);
        	tableau.setValueAt(fleur.getPrice(), i, 3);
        	tableau.setValueAt(fleur.getQuantity(), i, 4);
        }
        JScrollPane scrollPaneLister = new JScrollPane(tableau);
        scrollPaneLister.setBounds(52, 139, 687, 386);
        contentPane.add(scrollPaneLister);
    }
}
