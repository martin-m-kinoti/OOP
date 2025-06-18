import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;

public class LoginForm {
    public static void main(String[] args) {
        // Login form
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x007B99));
        
        // Panel for components
        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        panel.setLayout(null);
        panel.setBounds(150, 200, 300, 300);
        panel.setBackground(Color.white);

        // Panel components
        // Header
        JLabel header = new JLabel("Login");
        header.setBounds(130, 20, 100, 20);
        panel.add(header);
        
        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 50, 250, 20);
        panel.add(emailLabel);
        JTextField emailText = new JTextField();
        emailText.setBounds(20, 80, 250, 20);
        emailText.setText("Enter email");
        panel.add(emailText);

        // Password
        JLabel password = new JLabel("Password:");
        password.setBounds(20, 110, 250, 20);
        panel.add(password);
        JPasswordField passText = new JPasswordField();
        passText.setBounds(20, 140, 250, 20);
        passText.setText("Enter password");
        panel.add(passText);

        // Show password checkbox
        JCheckBox box = new JCheckBox("Show Password");
        box.setBounds(20, 170, 250, 20);
        panel.add(box);

        // Sign in button
        JButton signIn = new JButton("SIGN IN");
        signIn.setBackground(new Color(0x007B99));
        signIn.setBounds(20, 200, 250, 20);
        panel.add(signIn);

        // Forgot Password
        JLabel forgotPass = new JLabel(
            "<html>"
                +"<font color='#000000'>Forgot </font>"
                +"<font color='#007B99'><a>Username / Password?</a></font>"
            +"</html>"
        );
        forgotPass.setBounds(20, 240, 250, 20);
        panel.add(forgotPass);

        // Dont have an account
        JLabel newAccount = new JLabel(
            "<html>"
                +"<font color='#000000'>Don't have an account? </font>"
                +"<font color='#007B99'><a>Sign Up</a></font>"
            +"</html>"
        );
        newAccount.setBounds(20, 270, 250, 20);
        panel.add(newAccount);

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}