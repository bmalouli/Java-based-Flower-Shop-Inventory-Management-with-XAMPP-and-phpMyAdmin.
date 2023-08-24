import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CreationBouquetFrame extends JFrame {

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
        
        textField = new JTextField();
        textField.setBounds(403, 87, 105, 26);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnAnnuler = new JButton("Annuler dernière fleur ajoutée");
        btnAnnuler.setForeground(new Color(167, 116, 117));
        btnAnnuler.setBounds(48, 475, 229, 29);
        contentPane.add(btnAnnuler);
        
        JButton btnReserver = new JButton("Réserver le bouquet");
        btnReserver.setForeground(new Color(167, 116, 117));
        btnReserver.setBounds(577, 475, 165, 29);
        contentPane.add(btnReserver);
        
        JButton btnAjouter = new JButton("Ajouter au bouquet");
        btnAjouter.setForeground(new Color(167, 116, 117));
        btnAjouter.setBounds(564, 113, 165, 29);
        contentPane.add(btnAjouter);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(403, 138, 105, 26);
        contentPane.add(textField_1);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(48, 244, 694, 230);
        contentPane.add(scrollPane);
        
        JLabel lblID = new JLabel("ID");
        lblID.setForeground(new Color(182, 134, 111));
        lblID.setBounds(58, 224, 22, 16);
        contentPane.add(lblID);
        
        JLabel lblNom = new JLabel("NOM");
        lblNom.setForeground(new Color(182, 134, 111));
        lblNom.setBounds(177, 224, 36, 16);
        contentPane.add(lblNom);
        
        JLabel lblCouleur = new JLabel("COULEUR");
        lblCouleur.setForeground(new Color(182, 134, 111));
        lblCouleur.setBounds(351, 224, 61, 16);
        contentPane.add(lblCouleur);
        
        JLabel lblPrix = new JLabel("PRIX");
        lblPrix.setForeground(new Color(182, 134, 111));
        lblPrix.setBounds(511, 224, 36, 16);
        contentPane.add(lblPrix);
        
        JLabel lblQuantite = new JLabel("QUANTITÉ");
        lblQuantite.setForeground(new Color(182, 134, 111));
        lblQuantite.setBounds(658, 224, 71, 16);
        contentPane.add(lblQuantite);
        
        JLabel lblFleursBouquet = new JLabel("Fleur(s) pour le bouquet:");
        lblFleursBouquet.setBounds(48, 196, 165, 16);
        contentPane.add(lblFleursBouquet);
        lblFleursBouquet.setForeground(new Color(182, 134, 111));
    }
}
