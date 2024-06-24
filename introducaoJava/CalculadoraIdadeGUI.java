import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class CalculadoraIdadeGUI extends JFrame{
    private JLabel txtLabel;
    private JTextField txtIdade;
    private JButton btnCalcular;
    private JLabel txtResposta;
    private JPanel panelMain;

    public CalculadoraIdadeGUI() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Calendar cal = Calendar.getInstance();
                int ano = cal.get(Calendar.YEAR);

                int anoNascimento = Integer.parseInt(txtIdade.getText());

                int idade = ano - anoNascimento;

                JOptionPane.showMessageDialog(btnCalcular, "Sua idade é " + idade);
                txtResposta.setText(String.valueOf(idade));

            }
        });
    }

    public static void main(String[] args) {
        CalculadoraIdadeGUI h = new CalculadoraIdadeGUI();
        h.setContentPane(h.panelMain);
        h.setVisible(true);
        h.setSize(400,300);
    }
}
