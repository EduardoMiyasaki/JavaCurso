import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaSoma extends JFrame{
    private JButton btnSoma;
    private JTextField txtN1;
    private JTextField txtN2;
    private javax.swing.JPanel panelMain;
    private JLabel lblSoma;

    public telaSoma() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int soma = n1 + n2;

                String textoSoma = String.valueOf(soma);
                
                JOptionPane.showMessageDialog(btnSoma,"A soma é " + textoSoma);
            }
        });
    }

    public static void main(String[] args) {
        telaSoma h=new telaSoma();
        h.setContentPane(h.panelMain);
        h.setVisible(true);
        h.setSize(400,100);

    }
}
