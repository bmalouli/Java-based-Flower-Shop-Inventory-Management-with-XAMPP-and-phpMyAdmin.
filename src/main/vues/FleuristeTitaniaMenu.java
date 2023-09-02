package main.vues;

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

    public FleuristeTitaniaMenu() {
        
    	setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 509, 384);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitania = new JLabel("Fleuriste Titania");
        lblTitania.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitania.setForeground(new Color(178, 114, 118));
        lblTitania.setBounds(161, 17, 194, 29);
        contentPane.add(lblTitania);

        JButton btnLister = new JButton("Lister l'inventaire");
        btnLister.setForeground(new Color(178, 114, 118));
        btnLister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ListeFleursFrame frame = new ListeFleursFrame();
                    frame.setVisible(true);
                } catch (Exception er) {
                    er.printStackTrace();
                } finally {
                    dispose();
                }
            }
        });
        btnLister.setBounds(173, 58, 165, 29);
        contentPane.add(btnLister);

        JButton btnRechercherUneFleur = new JButton("Rechercher une fleur");
        btnRechercherUneFleur.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try {
                    RechercherFleurFrame frame = new RechercherFleurFrame();
                    frame.setVisible(true);
                } catch (Exception er) {
                    er.printStackTrace();
                } finally {
                    dispose();
                }

        	}
        });
        btnRechercherUneFleur.setForeground(new Color(178, 114, 118));
        btnRechercherUneFleur.setBounds(173, 99, 165, 29);
        contentPane.add(btnRechercherUneFleur);

        JButton btnModifierUneFleur = new JButton("Modifier une fleur");
        btnModifierUneFleur.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try {
                    ModifierFleurFrame frame = new ModifierFleurFrame();
                    frame.setVisible(true);
                } catch (Exception er) {
                    er.printStackTrace();
                } finally {
                    dispose();
                }

        	}
        });
        btnModifierUneFleur.setForeground(new Color(178, 114, 118));
        btnModifierUneFleur.setBounds(173, 140, 165, 29);
        contentPane.add(btnModifierUneFleur);

        JButton btnAjouterUneFleur = new JButton("Ajouter une fleur");
        btnAjouterUneFleur.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try {
                    AjouterFleurFrame frame = new AjouterFleurFrame();
                    frame.setVisible(true);
                } catch (Exception er) {
                    er.printStackTrace();
                } finally {
                    dispose();
                }
        	}
        });
        btnAjouterUneFleur.setForeground(new Color(178, 114, 118));
        btnAjouterUneFleur.setBounds(173, 181, 165, 29);
        contentPane.add(btnAjouterUneFleur);

        JButton btnSupprimerUneFleur = new JButton("Supprimer une fleur");
        btnSupprimerUneFleur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    SupprimerFleurFrame frame = new SupprimerFleurFrame();
                    frame.setVisible(true);
                } catch (Exception er) {
                    er.printStackTrace();
                } finally {
                    dispose();
                }
            }
        });
        btnSupprimerUneFleur.setForeground(new Color(178, 114, 118));
        btnSupprimerUneFleur.setBounds(173, 260, 165, 29);
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
        btnQuitter.setBounds(173, 321, 165, 29);
        contentPane.add(btnQuitter);

        JButton btnCreer = new JButton("Créer un bouquet");
        btnCreer.setForeground(new Color(178, 114, 118));
        btnCreer.setBounds(173, 222, 165, 29);
        contentPane.add(btnCreer);
    }
}

