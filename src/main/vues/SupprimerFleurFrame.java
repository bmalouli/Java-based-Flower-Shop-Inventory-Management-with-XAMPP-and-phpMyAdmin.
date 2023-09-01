package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SupprimerFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    public SupprimerFleurFrame() {
    	setTitle("Supprimer une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Entrer le ID de la fleur à supprimer:");
        lblNewLabel.setForeground(new Color(182, 134, 111));
        lblNewLabel.setBounds(72, 92, 224, 16);
        contentPane.add(lblNewLabel);
        
        JLabel lblID = new JLabel("ID:");
        lblID.setForeground(new Color(182, 134, 111));
        lblID.setBounds(144, 209, 25, 16);
        contentPane.add(lblID);
        
        JLabel lblCouleur = new JLabel("COULEUR:");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(144, 288, 68, 16);
        contentPane.add(lblCouleur);
        
        JLabel lblAccepter = new JLabel("Acceptez-vous de supprimer cette fleur?");
        lblAccepter.setForeground(new Color(182, 134, 111));
        lblAccepter.setBounds(265, 403, 261, 16);
        contentPane.add(lblAccepter);
        
        JLabel lblSupprimer = new JLabel("Supprimer une fleur");
        lblSupprimer.setForeground(new Color(178, 114, 118));
        lblSupprimer.setFont(new Font("Arial", Font.BOLD, 24));
        lblSupprimer.setBounds(265, 31, 246, 29);
        contentPane.add(lblSupprimer);
        
        JButton btnRetourButton = new JButton("Retour au menu");
        btnRetourButton.setForeground(new Color(167, 116, 117));
        btnRetourButton.setBounds(19, 537, 143, 29);
        contentPane.add(btnRetourButton);
        btnRetourButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                FleuristeTitaniaMenu menu = new FleuristeTitaniaMenu();
                menu.setVisible(true);
            }
        });
        
        textField = new JTextField();
        textField.setBounds(308, 87, 210, 26);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(230, 451, 143, 29);
        contentPane.add(btnAnnuler);
        
        JButton btnAccepter = new JButton("Accepter");
        btnAccepter.setForeground(new Color(167, 116, 117));
        btnAccepter.setBounds(434, 451, 143, 29);
        contentPane.add(btnAccepter);
        
        JButton btnSupprimer = new JButton("Rechercher fleur à supprimer");
        btnSupprimer.setForeground(new Color(167, 116, 117));
        btnSupprimer.setBounds(545, 87, 224, 29);
        contentPane.add(btnSupprimer);
        
        JLabel lblInformations = new JLabel("Les informations sur la fleur à supprimer:");
        lblInformations.setForeground(new Color(182, 134, 111));
        lblInformations.setBounds(117, 167, 270, 16);
        contentPane.add(lblInformations);
        
        JLabel lblNom = new JLabel("NOM:");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(144, 250, 41, 16);
        contentPane.add(lblNom);
        
        JLabel lblPrix = new JLabel("PRIX:");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(144, 324, 31, 16);
        contentPane.add(lblPrix);
        
        JLabel lblQuantite = new JLabel("QUANTITÉ:");
        lblQuantite.setForeground(new Color(182, 134, 111));
        lblQuantite.setBounds(144, 358, 74, 16);
        contentPane.add(lblQuantite);
    }
}
