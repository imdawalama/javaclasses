import javax.swing.*;
import java.awt.event.*;

public class LoginPage {
    private JFrame frame;
    private JPanel panel;
    private JLabel titleLabel, usernameLabel, usernameLabel2, passwordLabel;
    private JTextField usernameField, usernameField2;
    private JPasswordField passwordField;
    private JButton loginButton, signupButton;

    public LoginPage() {
        frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        panel = new JPanel();
        panel.setLayout(null);

        titleLabel = new JLabel("Login Page");
        titleLabel.setBounds(150, 20, 100, 20);

        usernameLabel = new JLabel("FirstName: ");
        usernameLabel.setBounds(50, 70, 80, 20);

        usernameField = new JTextField();
        usernameField.setBounds(140, 70, 150, 20);

        usernameLabel2 = new JLabel("LastName: ");
        usernameLabel2.setBounds(50, 70, 80, 20);

        usernameField2 = new JTextField();
        usernameField2.setBounds(140, 70, 150, 20);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 80, 20);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 110, 150, 20);

        loginButton = new JButton("Login");
        loginButton.setBounds(80, 160, 80, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add login authentication logic here
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Example: Check credentials against stored data or database
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                    // Navigate to main application or dashboard
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password!");
                }
            }
        });

        signupButton = new JButton("Signup");
        signupButton.setBounds(200, 160, 80, 30);
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showSignupPage();
            }
        });

        panel.add(titleLabel);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(signupButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void showSignupPage() {
        JOptionPane.showMessageDialog(frame, "Signup Page Coming Soon!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage();
            }
        });
    }
}