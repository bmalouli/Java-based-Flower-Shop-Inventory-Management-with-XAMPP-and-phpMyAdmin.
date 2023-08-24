import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RechercherFleurFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

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

    public RechercherFleurFrame() {
    	setTitle("Rechercher une fleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600); // Définir la taille du JFrame
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
        
        JLabel lblQuantit = new JLabel("QUANTITÉ");
        lblQuantit.setForeground(new Color(182, 134, 111));
        lblQuantit.setBounds(612, 294, 69, 16);
        contentPane.add(lblQuantit);
        
        JLabel lblFleursEnStock = new JLabel("Rechercher une fleur");
        lblFleursEnStock.setForeground(new Color(178, 114, 118));
        lblFleursEnStock.setFont(new Font("Arial", Font.BOLD, 24));
        lblFleursEnStock.setBounds(272, 24, 255, 29);
        contentPane.add(lblFleursEnStock);
        
        JButton btnNewButton = new JButton("Retour au menu");
        btnNewButton.setForeground(new Color(167, 116, 117));
        btnNewButton.setBounds(19, 537, 143, 29);
        contentPane.add(btnNewButton);
        
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
        
        JButton btnRechercher = new JButton("Rechercher selon ID");
        btnRechercher.setForeground(new Color(167, 116, 117));
        btnRechercher.setBounds(538, 96, 170, 29);
        contentPane.add(btnRechercher);
        
        JLabel lblInformationsSurLa = new JLabel("Informations sur la fleur recherché :");
        lblInformationsSurLa.setForeground(new Color(182, 134, 111));
        lblInformationsSurLa.setBounds(266, 253, 248, 16);
        contentPane.add(lblInformationsSurLa);
        
        JLabel lblId = new JLabel("ID");
        lblId.setForeground(new Color(182, 134, 111));
        lblId.setBounds(68, 294, 30, 16);
        contentPane.add(lblId);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Rechercher avec le ID:");
        chckbxNewCheckBox.setForeground(new Color(180, 143, 124));
        chckbxNewCheckBox.setBounds(101, 97, 170, 23);
        contentPane.add(chckbxNewCheckBox);
        
        JCheckBox chckbxRechercherAvecLe = new JCheckBox("Rechercher avec le NOM:");
        chckbxRechercherAvecLe.setForeground(new Color(180, 143, 124));
        chckbxRechercherAvecLe.setBounds(101, 151, 187, 23);
        contentPane.add(chckbxRechercherAvecLe);
        
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
