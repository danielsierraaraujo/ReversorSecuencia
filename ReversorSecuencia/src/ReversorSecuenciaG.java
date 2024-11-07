import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class ReversorSecuenciaG {
    private JPanel PanelGeneral;
    private JTextField inputField;
    private JTextField outputField;
    private JButton reverseButton;

    public ReversorSecuenciaG() {
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                invertirSecuencia();
            }
        });
    }

    private void invertirSecuencia() {
        String[] numeros = inputField.getText().split(" ");
        Stack<String> pila = new Stack<>();
        for (String numero : numeros) {
            pila.push(numero);
        }

        StringBuilder inverso = new StringBuilder();
        while (!pila.isEmpty()) {
            inverso.append(pila.pop()).append(" ");
        }

        outputField.setText(inverso.toString().trim());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ReversorSecuenciaG");
        frame.setContentPane(new ReversorSecuenciaG().PanelGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}