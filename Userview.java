import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class Userview extends JFrame {
    private JLabel titleLabel, firstnameLabel,lastnamLabel,phonLabel,emaiLabel,collegenameLabel,yearLabel,semesterLabel,rollnoLabel;
    private JTextField firstname = new JTextField("enter the firstname");
    private JTextField lastname = new JTextField("enter the lastname");
    private JTextField phone = new JTextField("enter the phone number");
    private JTextField email = new JTextField("enter the valid email");
    private JTextField collegename = new JTextField("enter the college name");
    private JTextField year = new JTextField("enter the year");
    private JTextField semester = new JTextField("enter the semester");
    private JTextField rollno = new JTextField("enter the rollno");

    private JButton submitButton = new JButton("Register");

    public Userview() {
        // Set up the frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null); // Center the frame on screen


        // Create a panel for the form elements
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(200, 100)); // Set preferred size
        panel.setLayout(null);
        add(panel, BorderLayout.CENTER);

        titleLabel = new JLabel("Register Form");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        titleLabel.setBounds(150, 20, 100, 20);
        panel.add(titleLabel);

        // Add form elements to the panel
        firstnameLabel = new JLabel("FirstName:");
        firstnameLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        firstnameLabel.setBounds(50, 70, 80, 20);
        panel.add(firstnameLabel);

        firstname.setBounds(140, 70, 150, 20);
        panel.add(firstname);

        lastnamLabel = new JLabel("LastName:");
        lastnamLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        lastnamLabel.setBounds(50, 110, 80, 20);
        panel.add(lastnamLabel);

        lastname.setBounds(140, 110, 150, 20);
        panel.add(lastname);

        phonLabel = new JLabel("Phone:");
        phonLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        phonLabel.setBounds(50, 150, 80, 20);
        panel.add(phonLabel);
        
        phone.setBounds(140, 150, 150, 20);
        panel.add(phone);

        emaiLabel = new JLabel("Email");
        emaiLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emaiLabel.setBounds(50, 190, 80, 20 );
        panel.add(emaiLabel);

        email.setBounds(140, 190, 150, 20);
        panel.add(email);

       collegenameLabel = new JLabel("CollegeName:");
       collegenameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
       collegenameLabel.setBounds(50, 230, 80,20 );
       panel.add(collegenameLabel);

       collegename.setBounds(140, 230, 150, 20);
       panel.add(collegename);

       yearLabel = new JLabel("Year:");
       yearLabel.setFont(new Font("Arial", Font.PLAIN, 15));
       yearLabel.setBounds(50, 270, 80,20 );
       panel.add(yearLabel);

       year.setBounds(140, 270, 150, 20);
       panel.add(year);

       semesterLabel = new JLabel("Semester:");
       semesterLabel.setFont(new Font("Arial", Font.PLAIN, 15));
       semesterLabel.setBounds(50, 310, 80,20 );
       panel.add(semesterLabel);
              
       semester.setBounds(140, 310, 150, 20);
       panel.add(semester);

       rollnoLabel = new JLabel("RollNo:");
       rollnoLabel.setFont(new Font("Arial", Font.PLAIN, 15));

       rollnoLabel.setBounds(50, 350, 80,20 );
       panel.add(rollnoLabel);

       rollno.setBounds(140, 350, 150, 20);
        panel.add(rollno);

       submitButton.setBounds(150, 390, 100, 30);
       submitButton.setBackground(Color.cyan);
       panel.add(submitButton);

        // Add panel to the frame
        frame.add(panel);
        frame.setVisible(true);
        setMinimumSize(new Dimension(200, 300));
    }

    // Getters for the fields and button
    public JTextField getFirstName() {
        return firstname;
    }

    public JTextField getLastName() {
        return lastname;
    }

    public JTextField getPhone() {
        return phone;
    }
    public JTextField getEmail() {
        return email;
    }
    public JTextField getCollegeName() {
        return collegename;
    }

    public JTextField getYear() {
        return year;
    }
    public JTextField getSemester() {
        return semester;
    }
    public JTextField getRollno() {
        return rollno;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
}