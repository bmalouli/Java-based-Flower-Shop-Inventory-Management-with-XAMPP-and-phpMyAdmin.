package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controleurInventaire.*;
import modelInventaire.*;

public class ModifierFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldID;
    private JTextField textFieldName;
    private JTextField textFieldColor;
    private JTextField textFieldPrice;
    private JTextField textFieldQty;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ModifierFleurFrame frame = new ModifierFleurFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    ControleurInventaire CtrI = ControleurInventaire.getControleurInventaire();
    Inventaire fleur =null;

    public ModifierFleurFrame() {
    	setTitle("Modifier une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblModifierLabel = new JLabel("Entrer le ID de la fleur à modifier:");
        lblModifierLabel.setForeground(new Color(182, 134, 111));
        lblModifierLabel.setBounds(72, 92, 224, 16);
        contentPane.add(lblModifierLabel);
        
        JLabel lblModifierNom = new JLabel("Modifier le NOM:");
        lblModifierNom.setForeground(new Color(182, 134, 111));
        lblModifierNom.setBounds(158, 170, 112, 16);
        contentPane.add(lblModifierNom);
        
        JLabel lblModifierCouleur = new JLabel("Modifier la COULEUR:");
        lblModifierCouleur.setForeground(new Color(182, 134, 111));
        lblModifierCouleur.setBounds(158, 217, 150, 16);
        contentPane.add(lblModifierCouleur);
        
        JLabel lblModifierPrix = new JLabel("Modifier le PRIX:");
        lblModifierPrix.setForeground(new Color(182, 134, 111));
        lblModifierPrix.setBounds(158, 265, 112, 16);
        contentPane.add(lblModifierPrix);
        
        JLabel lblModifierQuantite = new JLabel("Modifier la QUANTITÉ:");
        lblModifierQuantite.setForeground(new Color(182, 134, 111));
        lblModifierQuantite.setBounds(162, 312, 146, 16);
        contentPane.add(lblModifierQuantite);
        
        JLabel lblFleursModifier = new JLabel("Modification d'une fleur");
        lblFleursModifier.setForeground(new Color(178, 114, 118));
        lblFleursModifier.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursModifier.setBounds(265, 31, 295, 29);
        contentPane.add(lblFleursModifier);
        
        textFieldID = new JTextField();
        textFieldID.setBounds(308, 87, 210, 26);
        contentPane.add(textFieldID);
        textFieldID.setColumns(10);
        
        textFieldName = new JTextField();
        textFieldName.setColumns(10);
        textFieldName.setBounds(367, 165, 210, 26);
        contentPane.add(textFieldName);
        
        textFieldColor = new JTextField();
        textFieldColor.setColumns(10);
        textFieldColor.setBounds(367, 212, 210, 26);
        contentPane.add(textFieldColor);
        
        textFieldPrice = new JTextField();
        textFieldPrice.setColumns(10);
        textFieldPrice.setBounds(367, 260, 210, 26);
        contentPane.add(textFieldPrice);
        
        textFieldQty = new JTextField();
        textFieldQty.setColumns(10);
        textFieldQty.setBounds(367, 307, 210, 26);
        contentPane.add(textFieldQty);
        
        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(229, 415, 143, 29);
        contentPane.add(btnAnnuler);
        
        JButton btnAccepter = new JButton("Accepter");
        btnAccepter.setForeground(new Color(167, 116, 117));
        btnAccepter.setBounds(434, 415, 143, 29);
        contentPane.add(btnAccepter);
        btnAccepter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //int id = Integer.valueOf(textFieldID.getText());
                String name = textFieldName.getText();
                fleur.setName(name);
                String color = textFieldColor.getText();
                fleur.setColor(color);
                int price = Integer.valueOf(textFieldPrice.getText());
                fleur.setPrice(price);
                int quantity = Integer.valueOf(textFieldQty.getText());
                fleur.setQuantity(quantity);
                //ControleurInventaire CtrI = ControleurInventaire.getControleurInventaire();
                int modif = CtrI.CtrI_MiseAJour(fleur);
                if (modif == 1) {System.out.println("fleur modifiée!");}

            }
        });
        
        JButton btnModifier = new JButton("Modifier");
        btnModifier.setForeground(new Color(167, 116, 117));
        btnModifier.setBounds(565, 87, 143, 29);
        contentPane.add(btnModifier);
        btnModifier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.valueOf(textFieldID.getText());
                //ControleurInventaire CtrI = ControleurInventaire.getControleurInventaire();
                fleur = CtrI.CtrI_GetById(id);
                textFieldName.setText(fleur.getName());
                textFieldColor.setText(fleur.getColor());
                textFieldPrice.setText(String.valueOf(fleur.getPrice()));
                textFieldQty.setText(String.valueOf(fleur.getQuantity()));

            }
        });

        JButton btnRetour = new JButton("Retour au menu");
        btnRetour.setForeground(new Color(167, 116, 117));
        btnRetour.setBounds(19, 537, 143, 29);
        contentPane.add(btnRetour);
        btnRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                FleuristeTitaniaMenu menu = new FleuristeTitaniaMenu();
                menu.setVisible(true);
            }
        });
    }
}
