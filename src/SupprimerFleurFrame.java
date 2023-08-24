import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SupprimerFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

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
        
        JLabel lblNom = new JLabel("ID:");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(144, 209, 25, 16);
        contentPane.add(lblNom);
        
        JLabel lblCouleur = new JLabel("COULEUR:");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(144, 288, 68, 16);
        contentPane.add(lblCouleur);
        
        JLabel lblPrix = new JLabel("Acceptez-vous de supprimer cette fleur?");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(265, 403, 261, 16);
        contentPane.add(lblPrix);
        
        JLabel lblFleursEnStock = new JLabel("Supprimer une fleur");
        lblFleursEnStock.setForeground(new Color(178, 114, 118));
        lblFleursEnStock.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursEnStock.setBounds(265, 31, 246, 29);
        contentPane.add(lblFleursEnStock);
        
        JButton btnNewButton = new JButton("Retour au menu");
        btnNewButton.setForeground(new Color(167, 116, 117));
        btnNewButton.setBounds(19, 537, 143, 29);
        contentPane.add(btnNewButton);
        
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
        
        JButton btnModifier = new JButton("Supprimer");
        btnModifier.setForeground(new Color(167, 116, 117));
        btnModifier.setBounds(565, 87, 143, 29);
        contentPane.add(btnModifier);
        
        JLabel lblNom_1 = new JLabel("Les informations sur la fleur à supprimer:");
        lblNom_1.setForeground(new Color(182, 134, 111));
        lblNom_1.setBounds(117, 167, 270, 16);
        contentPane.add(lblNom_1);
        
        JLabel lblNom_2 = new JLabel("NOM:");
        lblNom_2.setForeground(new Color(182, 134, 111));
        lblNom_2.setBounds(144, 250, 41, 16);
        contentPane.add(lblNom_2);
        
        JLabel lblPrix_1 = new JLabel("PRIX:");
        lblPrix_1.setForeground(new Color(182, 134, 111));
        lblPrix_1.setBounds(144, 324, 31, 16);
        contentPane.add(lblPrix_1);
        
        JLabel lblQuantit = new JLabel("QUANTITÉ:");
        lblQuantit.setForeground(new Color(182, 134, 111));
        lblQuantit.setBounds(144, 358, 74, 16);
        contentPane.add(lblQuantit);
    }
}
