package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import controleurInventaire.ControleurInventaire;
import modelInventaire.Inventaire;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjouterFleurFrame extends JFrame {
    ControleurInventaire cont = ControleurInventaire.getControleurInventaire();

    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    public AjouterFleurFrame() {
        setTitle("Ajouter une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600); // Définir la taille du JFrame
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNom = new JLabel("Ajouter le NOM:");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(229, 134, 112, 16);
        contentPane.add(lblNom);

        JLabel lblCouleur = new JLabel("Ajouter la COULEUR:");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(229, 195, 134, 16);
        contentPane.add(lblCouleur);

        JLabel lblPrix = new JLabel("Ajouter le PRIX:");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(229, 265, 99, 16);
        contentPane.add(lblPrix);

        JLabel lblQuantite = new JLabel("Ajouter la QUANTITÉ:");
        lblQuantite.setForeground(new Color(182, 134, 111));
        lblQuantite.setBounds(229, 339, 134, 16);
        contentPane.add(lblQuantite);

        JLabel lblFleursEnStock = new JLabel("Ajouter une fleur");
        lblFleursEnStock.setForeground(new Color(178, 114, 118));
        lblFleursEnStock.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursEnStock.setBounds(282, 25, 238, 29);
        contentPane.add(lblFleursEnStock);

        JButton btnNewButton = new JButton("Retour au menu");
        btnNewButton.setForeground(new Color(167, 116, 117));
        btnNewButton.setBounds(25, 516, 143, 29);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FleuristeTitaniaMenu menuTitanaiFrame = new FleuristeTitaniaMenu();
                menuTitanaiFrame.setVisible(true);
                dispose();
            }
        });
        contentPane.add(btnNewButton);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(408, 129, 210, 26);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(408, 190, 210, 26);
        contentPane.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(408, 260, 210, 26);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(408, 334, 210, 26);
        contentPane.add(textField_4);

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(229, 415, 143, 29);
        contentPane.add(btnAnnuler);
        btnAnnuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viderChamps();
            }
        });

        JButton btnAccepter = new JButton("Accepter");
        btnAccepter.setForeground(new Color(167, 116, 117));
        btnAccepter.setBounds(475, 415, 143, 29);
        btnAccepter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Inventaire inventaire = new Inventaire();
                String name = textField_1.getText();
                inventaire.setName(name);
                String color = textField_2.getText();
                inventaire.setColor(color);
                int price = Integer.valueOf(textField_3.getText());
                inventaire.setPrice(price);
                int quantity = Integer.valueOf(textField_4.getText());
                inventaire.setQuantity(quantity);

                cont.CtrI_Ajouter(inventaire);
                JOptionPane.showMessageDialog(null, "Ajout avec succès.", "Ajout",
                        JOptionPane.INFORMATION_MESSAGE);
                viderChamps();
            }
        });
        contentPane.add(btnAccepter);

    }

    public void viderChamps() {
        textField_1.setText("");
        textField_2.setText("");
        textField_3.setText("");
        textField_4.setText("");
    }
}
