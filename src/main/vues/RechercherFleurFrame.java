package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RechercherFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;


    public RechercherFleurFrame() {
    	setTitle("Rechercher une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNom = new JLabel("NOM");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(173, 294, 38, 16);
        contentPane.add(lblNom);
        
        JLabel lblCouleur = new JLabel("COULEUR");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(292, 294, 69, 16);
        contentPane.add(lblCouleur);
        
        JLabel lblPrix = new JLabel("PRIX");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(472, 294, 30, 16);
        contentPane.add(lblPrix);
        
        JLabel lblQuantite = new JLabel("QUANTITÉ");
        lblQuantite.setForeground(new Color(182, 134, 111));
        lblQuantite.setBounds(612, 294, 69, 16);
        contentPane.add(lblQuantite);
        
        JLabel lblRechercher = new JLabel("Rechercher une fleur");
        lblRechercher.setForeground(new Color(178, 114, 118));
        lblRechercher.setFont(new Font("Arial", Font.BOLD, 24));
        lblRechercher.setBounds(272, 24, 255, 29);
        contentPane.add(lblRechercher);
        
        JButton btnRetour = new JButton("Retour au menu");
        btnRetour.setForeground(new Color(167, 116, 117));
        btnRetour.setBounds(25, 516, 143, 29);
        contentPane.add(btnRetour);
        btnRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                FleuristeTitaniaMenu menu = new FleuristeTitaniaMenu();
                menu.setVisible(true);
            }
        });
        
        textField = new JTextField();
        textField.setBounds(304, 96, 210, 26);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(596, 214, 143, 29);
        contentPane.add(btnAnnuler);
        
        JButton btnRechercherSelonID = new JButton("Rechercher selon ID");
        btnRechercherSelonID.setForeground(new Color(167, 116, 117));
        btnRechercherSelonID.setBounds(538, 96, 170, 29);
        contentPane.add(btnRechercherSelonID);
        
        JLabel lblInformations = new JLabel("Informations sur la fleur recherché :");
        lblInformations.setForeground(new Color(182, 134, 111));
        lblInformations.setBounds(266, 253, 248, 16);
        contentPane.add(lblInformations);
        
        JLabel lblId = new JLabel("ID");
        lblId.setForeground(new Color(182, 134, 111));
        lblId.setBounds(68, 294, 30, 16);
        contentPane.add(lblId);
        
        JCheckBox iDCheckBox = new JCheckBox("Rechercher avec le ID:");
        iDCheckBox.setForeground(new Color(180, 143, 124));
        iDCheckBox.setBounds(101, 97, 170, 23);
        contentPane.add(iDCheckBox);
        
        JCheckBox nomCheckBox = new JCheckBox("Rechercher avec le NOM:");
        nomCheckBox.setForeground(new Color(180, 143, 124));
        nomCheckBox.setBounds(101, 151, 187, 23);
        contentPane.add(nomCheckBox);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(304, 150, 210, 26);
        contentPane.add(textField_1);
        
        JButton btnRechercherSelonNom = new JButton("Rechercher selon NOM");
        btnRechercherSelonNom.setForeground(new Color(167, 116, 117));
        btnRechercherSelonNom.setBounds(538, 150, 170, 29);
        contentPane.add(btnRechercherSelonNom);
    }
}
