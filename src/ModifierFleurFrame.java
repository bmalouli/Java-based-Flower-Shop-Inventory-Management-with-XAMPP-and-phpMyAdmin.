import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ModifierFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

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

    public ModifierFleurFrame() {
    	setTitle("Modifier une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Entrer le ID de la fleur à modifier:");
        lblNewLabel.setForeground(new Color(182, 134, 111));
        lblNewLabel.setBounds(72, 92, 224, 16);
        contentPane.add(lblNewLabel);
        
        JLabel lblNom = new JLabel("Modifier le NOM:");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(158, 170, 112, 16);
        contentPane.add(lblNom);
        
        JLabel lblCouleur = new JLabel("Modifier la COULEUR:");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(158, 217, 150, 16);
        contentPane.add(lblCouleur);
        
        JLabel lblPrix = new JLabel("Modifier le PRIX:");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(158, 265, 112, 16);
        contentPane.add(lblPrix);
        
        JLabel lblQuantit = new JLabel("Modifier la QUANTITÉ:");
        lblQuantit.setForeground(new Color(182, 134, 111));
        lblQuantit.setBounds(162, 312, 146, 16);
        contentPane.add(lblQuantit);
        
        JLabel lblFleursEnStock = new JLabel("Modification d'une fleur");
        lblFleursEnStock.setForeground(new Color(178, 114, 118));
        lblFleursEnStock.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursEnStock.setBounds(265, 31, 295, 29);
        contentPane.add(lblFleursEnStock);
        
        JButton btnNewButton = new JButton("Retour au menu");
        btnNewButton.setForeground(new Color(167, 116, 117));
        btnNewButton.setBounds(19, 537, 143, 29);
        contentPane.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(308, 87, 210, 26);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(367, 165, 210, 26);
        contentPane.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(367, 212, 210, 26);
        contentPane.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(367, 260, 210, 26);
        contentPane.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(367, 307, 210, 26);
        contentPane.add(textField_4);
        
        JButton btnAnnuler = new JButton("Annuler");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(229, 415, 143, 29);
        contentPane.add(btnAnnuler);
        
        JButton btnAccepter = new JButton("Accepter");
        btnAccepter.setForeground(new Color(167, 116, 117));
        btnAccepter.setBounds(434, 415, 143, 29);
        contentPane.add(btnAccepter);
        
        JButton btnModifier = new JButton("Modifier");
        btnModifier.setForeground(new Color(167, 116, 117));
        btnModifier.setBounds(565, 87, 143, 29);
        contentPane.add(btnModifier);
    }
}
