import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FoodOrderingSystem extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JCheckBox pizzaCheckBox, burgerCheckBox, teaCheckBox, mandaziCheckBox;
    private JButton orderButton;

    public FoodOrderingSystem() {
        // Title Label
        titleLabel = new JLabel("Food Ordering System");
        titleLabel.setBounds(50, 30, 300, 25);
        add(titleLabel);

        // Checkboxes for menu items
        pizzaCheckBox = new JCheckBox("Pizza @ 550");
        pizzaCheckBox.setBounds(100, 80, 200, 25);
        add(pizzaCheckBox);

        burgerCheckBox = new JCheckBox("Burger @ 130");
        burgerCheckBox.setBounds(100, 120, 200, 25);
        add(burgerCheckBox);

        teaCheckBox = new JCheckBox("Tea @ 70");
        teaCheckBox.setBounds(100, 160, 200, 25);
        add(teaCheckBox);

        mandaziCheckBox = new JCheckBox("Mandazi @ 30");
        mandaziCheckBox.setBounds(100, 200, 200, 25);
        add(mandaziCheckBox);

        // Order Button
        orderButton = new JButton("Order");
        orderButton.setBounds(100, 250, 100, 30);
        orderButton.addActionListener(this); // Register listener
        add(orderButton);

        // Frame properties
        setTitle("Food Ordering App");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float total = 0;
        StringBuilder message = new StringBuilder("You ordered:\n");

        if (pizzaCheckBox.isSelected()) {
            total += 550;
            message.append("Pizza: 550\n");
        }

        if (burgerCheckBox.isSelected()) {
            total += 130;
            message.append("Burger: 130\n");
        }

        if (teaCheckBox.isSelected()) {
            total += 70;
            message.append("Tea: 70\n");
        }

        if (mandaziCheckBox.isSelected()) {
            total += 30;
            message.append("Mandazi: 30\n");
        }

        message.append("------------------\n");
        message.append("Total: ").append(total);

        JOptionPane.showMessageDialog(this, message.toString(), "Order Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new FoodOrderingSystem();
    }
}
