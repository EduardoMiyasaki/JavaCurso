package olamundo.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends JFrame {

    // extends JFrame,
    //extends significa herança,
    //ou seja tudo que possui em JFrame vai pra minha classe app
    // Herdo as características JFrame

    private JPanel panelMain;
    private JButton btnClick;
    private JTextField txtName;

    // Tornar coisas privadas com o comando private,
    // se chama encapsulamento

    public app() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, "Olá " + txtName.getText());
            }
        });
    }

    public static void main(String[] args) {
        app h=new app();
        h.setContentPane(h.panelMain);
        h.setVisible(true);
        h.setSize(400,300);
 /*
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.setTitle("Hello");
*/
    }


}
