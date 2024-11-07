import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class ReversorSecuencia extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton reverseButton;

    public ReversorSecuencia() {
        setTitle("Inversor de Secuencia");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel inputLabel = new JLabel("Secuencia:");
        inputLabel.setBounds(20, 20, 100, 30);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(100, 20, 200, 30);
        add(inputField);

        JLabel outputLabel = new JLabel("Inverso:");
        outputLabel.setBounds(20, 60, 100, 30);
        add(outputLabel);

        outputField = new JTextField();
        outputField.setBounds(100, 60, 200, 30);
        outputField.setEditable(false);
        add(outputField);

        reverseButton = new JButton("Invertir");
        reverseButton.setBounds(310, 20, 80, 30);
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                invertirSecuencia();
            }
        });
        add(reverseButton);

        setVisible(true);
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
        new ReversorSecuencia();
    }
}
