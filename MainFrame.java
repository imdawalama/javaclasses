import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener{
    JTextField textField;
    JLabel label;
    JButton button;
    JPasswordField passwordField;
    JCheckBox jCheckBox;
    int yoffset = 20;
    int labelHeight = 40;
    int fieldHeight = 30;
    int buttonHeight = 30;
    int gapHeight = 5;
    public void initialize() {
        setTitle("First Desktop App");
        //label text

        label = new JLabel();
        label.setText("Hello, Everyones");
        label.setBounds(20,yoffset, 200, labelHeight);
        yoffset = yoffset + labelHeight;
        //user name label
        JLabel userNameLabel = new JLabel();
        userNameLabel.setText("UserName");
        userNameLabel.setBounds(20, yoffset, 200, labelHeight);
        yoffset = yoffset +labelHeight +gapHeight;

        //text field
         textField = new JTextField();
        textField.setBounds(20, yoffset, 200,fieldHeight);
        yoffset = yoffset + fieldHeight + gapHeight;
        //password label
        JLabel jpasswordLabel = new JLabel();
        jpasswordLabel.setText("Password");
        jpasswordLabel.setBounds(20,yoffset, 200, labelHeight);
        yoffset = yoffset +labelHeight + gapHeight;

        //password field
        passwordField = new JPasswordField();
        passwordField.setBounds(20,yoffset, 200,fieldHeight);
        yoffset = yoffset +fieldHeight + gapHeight;
        //button
         button = new JButton("Click Me");
        button.setBounds(20, yoffset, 200, buttonHeight);
        button.addActionListener(this);
        yoffset = yoffset + buttonHeight + gapHeight;

         jCheckBox= new JCheckBox("agree terms and condition?",false);
        jCheckBox.setBounds(20, yoffset, 200, fieldHeight);
        
        add(label);
        add(textField);
        add(button);
        add(passwordField);
        add(userNameLabel);
        add(jpasswordLabel);
        add(jCheckBox);
        setSize(500, 600);
        setMinimumSize(new Dimension(200, 300));
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
        String textData = textField.getText();
        label.setText(textData);
    }
}