package main.vues;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleurInventaire.ControleurInventaire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FleuristeTitaniaMenu extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FleuristeTitaniaMenu frame = new FleuristeTitaniaMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FleuristeTitaniaMenu() {
        
    	setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Ajouter le titre
        JLabel lblTitre = new JLabel("Fleuriste Titania");
        lblTitre.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitre.setForeground(new Color(178, 114, 118));
        lblTitre.setBounds(123, 8, 194, 29);
        contentPane.add(lblTitre);

        JButton btnLister = new JButton("Lister l'inventaire");
        btnLister.setForeground(new Color(178, 114, 118));
        btnLister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ListeFleursFrame listeFleursFrame = new ListeFleursFrame();
                listeFleursFrame.setVisible(true);
            }
        });
        btnLister.setBounds(134, 49, 165, 29);
        contentPane.add(btnLister);
        btnLister.setBounds(134, 49, 165, 29);
        contentPane.add(btnLister);

        JButton btnRechercherUneFleur = new JButton("Rechercher une fleur");
        btnRechercherUneFleur.setForeground(new Color(178, 114, 118));
        btnRechercherUneFleur.setBounds(134, 78, 165, 29);
        contentPane.add(btnRechercherUneFleur);

        JButton btnModifierUneFleur = new JButton("Modifier une fleur");
        btnModifierUneFleur.setForeground(new Color(178, 114, 118));
        btnModifierUneFleur.setBounds(134, 108, 165, 29);
        contentPane.add(btnModifierUneFleur);

        JButton btnAjouterUneFleur = new JButton("Ajouter une fleur");
        btnAjouterUneFleur.setForeground(new Color(178, 114, 118));
        btnAjouterUneFleur.setBounds(134, 138, 165, 29);
        contentPane.add(btnAjouterUneFleur);

        JButton btnSupprimerUneFleur = new JButton("Supprimer une fleur");
        btnSupprimerUneFleur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnSupprimerUneFleur.setForeground(new Color(178, 114, 118));
        btnSupprimerUneFleur.setBounds(134, 168, 165, 29);
        contentPane.add(btnSupprimerUneFleur);

        JButton btnQuitter = new JButton("Quitter");
        btnQuitter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                dispose();
                ControleurInventaire cont = ControleurInventaire.getControleurInventaire();
                cont.CtrI_Fermer();
        	}
        });
        btnQuitter.setForeground(new Color(178, 114, 118));
        btnQuitter.setBounds(134, 226, 165, 29);
        contentPane.add(btnQuitter);
    }
}

