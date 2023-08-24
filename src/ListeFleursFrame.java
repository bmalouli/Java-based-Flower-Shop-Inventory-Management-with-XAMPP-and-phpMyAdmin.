import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListeFleursFrame extends JFrame {

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
    	setTitle("Lister les fleurs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600); // Définir la taille du JFrame
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); // Vous pouvez également utiliser un autre gestionnaire de mise en page pour organiser les composants
        
        JLabel lblNewLabel = new JLabel("ID");
        lblNewLabel.setForeground(new Color(182, 134, 111));
        lblNewLabel.setBounds(63, 111, 22, 16);
        contentPane.add(lblNewLabel);
        
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
        
        JLabel lblQuantit = new JLabel("QUANTITÉ");
        lblQuantit.setForeground(new Color(182, 134, 111));
        lblQuantit.setBounds(660, 111, 71, 16);
        contentPane.add(lblQuantit);
        
        JLabel lblFleursEnStock = new JLabel("Inventaire des fleurs");
        lblFleursEnStock.setForeground(new Color(178, 114, 118));
        lblFleursEnStock.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursEnStock.setBounds(282, 25, 238, 29);
        contentPane.add(lblFleursEnStock);
        
        JButton btnNewButton = new JButton("Retour au menu");
        btnNewButton.setForeground(new Color(167, 116, 117));
        btnNewButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                FleuristeTitaniaMenu FleuristeTitaniaMenu = new FleuristeTitaniaMenu();
                FleuristeTitaniaMenu.setVisible(true);
            }
        });
        btnNewButton.setBounds(19, 537, 143, 29);
        contentPane.add(btnNewButton);

        
    }
}