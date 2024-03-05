package main.vues;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import controleurInventaire.ControleurInventaire;
import modelInventaire.Inventaire;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class CreationBouquetFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldId;
    private JTextField textFieldQte;
    private JTable tableau;

    ControleurInventaire CtrI = ControleurInventaire.getControleurInventaire();
    int compteur = 0;
    Map<Integer, Integer> fleursBouquet = new HashMap<>();

    public CreationBouquetFrame() {
        setTitle("Création d'un bouquet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblIdReserver = new JLabel("Entrer le ID de la fleur à réserver pour le bouquet:");
        lblIdReserver.setForeground(new Color(182, 134, 111));
        lblIdReserver.setBounds(48, 92, 331, 16);
        contentPane.add(lblIdReserver);

        JLabel lblMQuantiteReserver = new JLabel("Entrer la quantité de la fleur souhaitée:");
        lblMQuantiteReserver.setForeground(new Color(182, 134, 111));
        lblMQuantiteReserver.setBounds(48, 143, 310, 16);
        contentPane.add(lblMQuantiteReserver);

        JLabel lblCreation = new JLabel("Création d'un bouquet");
        lblCreation.setForeground(new Color(178, 114, 118));
        lblCreation.setFont(new Font("Arial", Font.BOLD, 24));
        lblCreation.setBounds(265, 31, 295, 29);
        contentPane.add(lblCreation);

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

        textFieldId = new JTextField();
        textFieldId.setBounds(403, 87, 105, 26);
        contentPane.add(textFieldId);
        textFieldId.setColumns(10);

        JButton btnAnnuler = new JButton("Annuler dernière fleur ajoutée");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(48, 475, 229, 29);
        contentPane.add(btnAnnuler);
        btnAnnuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object valeur = tableau.getValueAt(0, 0);
                if (valeur == null || valeur == "") {
                    JOptionPane.showMessageDialog(null, "Il n'y a aucune fleur à supprimer.", "ATTENTION",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    int valeurId = Integer.valueOf(tableau.getValueAt(compteur - 1, 0).toString());
                    Inventaire fleur = CtrI.CtrI_GetById(valeurId);
                    viderLigne(fleur);
                }
            }
        });

        JButton btnReserver = new JButton("Réserver le bouquet");
        btnReserver.setForeground(new Color(167, 116, 117));
        btnReserver.setBounds(577, 475, 165, 29);
        contentPane.add(btnReserver);
        btnReserver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object valeur = tableau.getValueAt(0, 0);
                if (valeur == null || valeur == "") {
                    JOptionPane.showMessageDialog(null, "Il n'y a aucune fleur dans l'espace bouquet.", "ATTENTION",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    reservation();
                    initialiserTable();
                }
            }
        });

        JButton btnAjouter = new JButton("Ajouter au bouquet");
        btnAjouter.setForeground(new Color(167, 116, 117));
        btnAjouter.setBounds(564, 113, 165, 29);
        contentPane.add(btnAjouter);
        btnAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textFieldId.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Vous devez obligatoirement entrer l'id.", "ATTENTION",
                            JOptionPane.WARNING_MESSAGE);
                } else if (textFieldQte.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Vous devez entrer le nombre de fleurs à ajouter au bouquet.",
                            "ATTENTION", JOptionPane.WARNING_MESSAGE);
                } else {
                    verificationBd();
                }
            }
        });

        textFieldQte = new JTextField();
        textFieldQte.setColumns(10);
        textFieldQte.setBounds(403, 138, 105, 26);
        contentPane.add(textFieldQte);

        tableau = new JTable(20, 5);

        String[] columnNames = { "Id", "Nom", "Couleur", "Prix", "Quantité" };
        for (int i = 0; i < tableau.getColumnCount(); i++) {
            TableColumn column1 = tableau.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(columnNames[i]);
        }
        tableau.getTableHeader().setBackground(new Color(243, 231, 230));
        tableau.getTableHeader().setForeground(new Color(178, 114, 118));

        JScrollPane scrollPane = new JScrollPane(tableau);
        scrollPane.setBounds(48, 244, 694, 230);
        contentPane.add(scrollPane);

        JLabel lblFleursBouquet = new JLabel("Fleur(s) pour le bouquet:");
        lblFleursBouquet.setBounds(48, 196, 165, 16);
        contentPane.add(lblFleursBouquet);
        lblFleursBouquet.setForeground(new Color(182, 134, 111));
    }

    public void verificationBd() {
        int id = Integer.valueOf(textFieldId.getText());
        int qte = Integer.valueOf(textFieldQte.getText());
        Inventaire fleur = CtrI.CtrI_GetById(id);

        if (fleur == null) {
            JOptionPane.showMessageDialog(null,
                    "Il n'y a aucune fleur associée à cet id dans l'inventaire.",
                    "ATTENTION", JOptionPane.WARNING_MESSAGE);
        } else {
            if (fleur.getQuantity() < qte) {
                JOptionPane.showMessageDialog(null,
                        "Il n'y a pas assez de fleurs dans l'inventaire. Seulement " + fleur.getQuantity()
                                + " fleurs restantes.",
                        "ATTENTION", JOptionPane.WARNING_MESSAGE);
                textFieldQte.setText("");
            } else {
                ajouterFleurBouquet(fleur, qte);

            }
        }

    }

    public void ajouterFleurBouquet(Inventaire fleur, int qte) {
        tableau.setValueAt(fleur.getId(), compteur, 0);
        tableau.setValueAt(fleur.getName(), compteur, 1);
        tableau.setValueAt(fleur.getColor(), compteur, 2);
        tableau.setValueAt(fleur.getPrice() + ".00 $", compteur, 3);
        tableau.setValueAt(qte, compteur, 4);
        compteur++;

        fleursBouquet.put(fleur.getId(), qte);
        textFieldId.setText("");
        textFieldQte.setText("");
    }

    public void viderLigne(Inventaire fleur) {
        tableau.setValueAt("", compteur - 1, 0);
        tableau.setValueAt("", compteur - 1, 1);
        tableau.setValueAt("", compteur - 1, 2);
        tableau.setValueAt("", compteur - 1, 3);
        tableau.setValueAt("", compteur - 1, 4);
        compteur--;
        fleursBouquet.remove(fleur.getId());
    }

    public void reservation() {
        int modif = 0;
        int nbFleurs = 0;
        String alerteQte = "Attention, stock faible:\n";

        for (int fleurId : fleursBouquet.keySet()) {
            Inventaire fleur = CtrI.CtrI_GetById(fleurId);
            int nouvQte = fleur.getQuantity() - fleursBouquet.get(fleurId);
            fleur.setQuantity(nouvQte);
            if (nouvQte <= 12) {
                alerteQte += "ID " + fleur.getId() + ": " + fleur.getName() + " "
                        + fleur.getColor() + ", " + nouvQte + " fleurs restantes" + "\n";
            }
            nbFleurs++;
            modif += CtrI.CtrI_MiseAJour(fleur); // renvoi nb de lignes modifiées
        }

        if (modif == nbFleurs) {
            JOptionPane.showMessageDialog(null, "Le bouquet a été réservé!", "CONFIRMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Problème lors de la réservation. Vérifier l'inventaire.", "ATTENTION",
                    JOptionPane.WARNING_MESSAGE);
        }
        if (alerteQte != "Attention, stock faible:\n") {
            JOptionPane.showMessageDialog(null, alerteQte, "ATTENTION", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void initialiserTable() {
        for (int i = 0; i < tableau.getRowCount(); i++) {
            tableau.setValueAt("", i, 0);
            tableau.setValueAt("", i, 1);
            tableau.setValueAt("", i, 2);
            tableau.setValueAt("", i, 3);
            tableau.setValueAt("", i, 4);
        }
    }

    public void mapToString() {// test pour voir contenu HashMap
        System.out.println("--------------------------");
        for (int fleurId : fleursBouquet.keySet()) {
            int key = fleurId;
            String value = fleursBouquet.get(fleurId).toString();
            System.out.println(key + " " + value);
        }
        System.out.println("--------------------------");
    }

}
