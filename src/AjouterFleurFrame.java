import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AjouterFleurFrame extends JFrame {
    private JTextField idTextField;
    
    public AjouterFleurFrame() {
        setTitle("Ajouter une fleur");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(243, 231, 230)); // Couleur de fond
        contentPane.setLayout(new BorderLayout());

        JLabel lblId = new JLabel("ID de la fleur :");
        lblId.setForeground(new Color(178, 114, 118)); // Couleur du texte
        idTextField = new JTextField(10);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(240, 231, 230));
        JButton btnCancel = new JButton("Annuler");
        JButton btnOK = new JButton("OK");

        btnCancel.setForeground(new Color(178, 114, 118)); // Couleur du texte
        btnOK.setForeground(new Color(178, 114, 118)); // Couleur du texte

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Ferme la fenêtre AjouterFleurFrame
            }
        });

        // btnOK.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         // Récupérez l'ID de la fleur depuis le champ de texte
        //         String fleurId = idTextField.getText();

        //         // Ici, vous pouvez ajouter le code pour traiter l'ajout de la fleur avec l'ID
        //         // (par exemple, enregistrement dans une base de données ou une liste)

        //         // Fermez la fenêtre AjouterFleurFrame
        //         dispose();
        //     }
        // });

        buttonPanel.add(btnCancel);
        buttonPanel.add(btnOK);

        contentPane.add(lblId, BorderLayout.WEST);
        contentPane.add(idTextField, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(contentPane);
    }
}