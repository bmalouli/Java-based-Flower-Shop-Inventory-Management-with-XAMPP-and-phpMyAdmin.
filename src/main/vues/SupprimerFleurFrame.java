package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import controleurInventaire.ControleurInventaire;
import modelInventaire.Inventaire;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SupprimerFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    private JLabel lblID;
    private JLabel lblNom;
    private JLabel lblCouleur;
    private JLabel lblPrix;
    private JLabel lblQuantite;

    private Inventaire fleur;
    private ControleurInventaire CtrI = ControleurInventaire.getControleurInventaire();

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
        btnRetourButton.setBounds(25, 516, 143, 29);
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
        
        JLabel lblInformations = new JLabel("Les informations sur la fleur à supprimer:");
        lblInformations.setForeground(new Color(182, 134, 111));
        lblInformations.setBounds(117, 167, 270, 16);
        contentPane.add(lblInformations);

        lblID = new JLabel("ID:");
        lblID.setForeground(new Color(182, 134, 111));
        lblID.setBounds(144, 209, 25, 16);
        contentPane.add(lblID);
        
        lblCouleur = new JLabel("COULEUR:");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(144, 288, 100, 16);
        contentPane.add(lblCouleur);

        
        lblNom = new JLabel("NOM:");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(144, 250, 100, 16);
        contentPane.add(lblNom);
        
        lblPrix = new JLabel("PRIX:");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(144, 324, 100, 16);
        contentPane.add(lblPrix);
        
        lblQuantite = new JLabel("QUANTITÉ:");
        lblQuantite.setForeground(new Color(182, 134, 111));
        lblQuantite.setBounds(144, 358, 100, 16);
        contentPane.add(lblQuantite);

        JButton btnSupprimer = new JButton("Rechercher fleur à supprimer");
        btnSupprimer.setForeground(new Color(167, 116, 117));
        btnSupprimer.setBounds(545, 87, 224, 29);
        contentPane.add(btnSupprimer);
        btnSupprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fleur = CtrI.CtrI_GetById(Integer.valueOf(textField.getText()));
                lblID.setText("ID: " + Integer.toString(fleur.getId()));
                lblNom.setText("NOM: " + fleur.getName());
                lblCouleur.setText("COULEUR: " + fleur.getColor());
                lblPrix.setText("PRIX: " + Integer.toString(fleur.getPrice()));
                lblQuantite.setText("QUANTITE: " + Integer.toString(fleur.getQuantity()));
                
            }
        });

        JButton btnAccepter = new JButton("Accepter");
        btnAccepter.setForeground(new Color(167, 116, 117));
        btnAccepter.setBounds(434, 451, 143, 29);
        contentPane.add(btnAccepter);
        btnAccepter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int idChoisi = Integer.parseInt(textField.getText());
                fleur = CtrI.CtrI_GetById(idChoisi);
                
                if(fleur != null) {
                    CtrI.CtrI_Supprimer(idChoisi);
                    JOptionPane.showMessageDialog(null, "La fleur avec l'Id " +idChoisi+ " a été supprimée avec succès.", "Suppression réussie", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Aucune fleur trouvée avec l'ID " +idChoisi, "Fleur introuvable", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }
}
