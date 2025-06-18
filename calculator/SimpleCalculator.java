import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator implements ActionListener {

    private final JTextField value1, value2, result;
    private final JLabel first, second;
    private final JButton add, subtract, multiply, divide, modulus;

    // Constructor
    public SimpleCalculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels and text fields for inputs
        first = new JLabel("First Value: ");
        first.setBounds(20, 20, 80, 20);
        frame.add(first);
        value1 = new JTextField();
        value1.setBounds(120, 20, 80, 20);
        frame.add(value1);

        second = new JLabel("Second Value: ");
        second.setBounds(20, 40, 100, 20);
        frame.add(second);
        value2 = new JTextField();
        value2.setBounds(120, 40, 80, 20);
        frame.add(value2);

        // Result text field
        result = new JTextField("Result: ");
        result.setBounds(40, 80, 80, 20);
        result.setEditable(false); // Make result field read-only
        frame.add(result);

        // Buttons for operations
        add = new JButton("+");
        add.setBounds(20, 120, 50, 20);
        frame.add(add);

        subtract = new JButton("-");
        subtract.setBounds(80, 120, 50, 20);
        frame.add(subtract);

        multiply = new JButton("*");
        multiply.setBounds(140, 120, 50, 20);
        frame.add(multiply);

        divide = new JButton("/");
        divide.setBounds(200, 120, 50, 20);
        frame.add(divide);

        modulus = new JButton("%");
        modulus.setBounds(260, 120, 50, 20);
        frame.add(modulus);

        // Add action listeners to buttons
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulus.addActionListener(this);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    // ActionPerformed method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int firstValue = Integer.parseInt(value1.getText());
            int secondValue = Integer.parseInt(value2.getText());
            int resultValue;

            if (e.getSource() == add) {
                resultValue = firstValue + secondValue;
            } else if (e.getSource() == subtract) {
                resultValue = firstValue - secondValue;
            } else if (e.getSource() == multiply) {
                resultValue = firstValue * secondValue;
            } else if (e.getSource() == divide) {
                if (secondValue != 0) {
                    resultValue = firstValue / secondValue;
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else { // modulus
                if (secondValue != 0) {
                    resultValue = firstValue % secondValue;
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            result.setText("Result: " + resultValue);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}

