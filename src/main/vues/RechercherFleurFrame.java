package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controleurInventaire.ControleurInventaire;
import modelInventaire.Inventaire;

public class RechercherFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTable tableau;
    private JTextField textField;
    private JTextField textField_1;
    private JCheckBox iDCheckBox;
    private JCheckBox nomCheckBox;

    private ControleurInventaire CtrI = ControleurInventaire.getControleurInventaire();

    public RechercherFleurFrame() {
        setTitle("Rechercher une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 630);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblRechercher = new JLabel("Rechercher une fleur");
        lblRechercher.setForeground(new Color(178, 114, 118));
        lblRechercher.setFont(new Font("Arial", Font.BOLD, 24));
        lblRechercher.setBounds(272, 24, 255, 29);
        contentPane.add(lblRechercher);

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

        textField = new JTextField();
        textField.setBounds(304, 96, 210, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(596, 214, 143, 29);
        contentPane.add(btnAnnuler);
        btnAnnuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viderLigne();
            }
        });

        JLabel lblInformations = new JLabel("Informations sur la fleur recherché :");
        lblInformations.setForeground(new Color(182, 134, 111));
        lblInformations.setBounds(266, 253, 248, 10);
        contentPane.add(lblInformations);

        iDCheckBox = new JCheckBox("Rechercher avec le ID:");
        iDCheckBox.setForeground(new Color(180, 143, 124));
        iDCheckBox.setBounds(101, 97, 170, 23);
        contentPane.add(iDCheckBox);

        nomCheckBox = new JCheckBox("Rechercher avec le NOM:");
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
        btnRechercherSelonNom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (nomCheckBox.isSelected() && textField_1.getText().length() != 0) {
                    Inventaire fleur = CtrI.CtrI_GetByName(textField_1.getText());
                    afficher(fleur);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Il n'y a aucun mode de recherche sélectionné ou le nom n'a pas été entré.",
                            "ATTENTION", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JButton btnRechercherSelonID = new JButton("Rechercher selon ID");
        btnRechercherSelonID.setForeground(new Color(167, 116, 117));
        btnRechercherSelonID.setBounds(538, 96, 170, 29);
        contentPane.add(btnRechercherSelonID);
        btnRechercherSelonID.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (iDCheckBox.isSelected() && textField.getText().length() != 0) {
                    Inventaire fleur = CtrI.CtrI_GetById(Integer.valueOf(textField.getText()));
                    afficher(fleur);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Il n'y a aucun mode de recherche sélectionné ou l'id n'a pas été entré.",
                            "ATTENTION", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        tableau = new JTable(1, 5);
        String[] columnNames = { "Id", "Nom", "Couleur", "Prix", "Quantité" };
        for (int i = 0; i < tableau.getColumnCount(); i++) {
            TableColumn column1 = tableau.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(columnNames[i]);
        }
        tableau.getTableHeader().setBackground(new Color(243, 231, 230));
        tableau.getTableHeader().setForeground(new Color(178, 114, 118));

        JScrollPane scrollPane = new JScrollPane(tableau);
        scrollPane.setBounds(48, 290, 694, 40);
        contentPane.add(scrollPane);
    }

    public void afficher(Inventaire fleur) {
        tableau.setValueAt(fleur.getId(), 0, 0);
        tableau.setValueAt(fleur.getName(), 0, 1);
        tableau.setValueAt(fleur.getColor(), 0, 2);
        tableau.setValueAt(fleur.getPrice() + ".00 $", 0, 3);
        tableau.setValueAt(fleur.getQuantity(), 0, 4);
    }

    public void viderLigne() {
        tableau.setValueAt("", 0, 0);
        tableau.setValueAt("", 0, 1);
        tableau.setValueAt("", 0, 2);
        tableau.setValueAt("", 0, 3);
        tableau.setValueAt("", 0, 4);
        textField_1.setText("");
        textField.setText("");
        iDCheckBox.setSelected(false);
        nomCheckBox.setSelected(false);
    }
}