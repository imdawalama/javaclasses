import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UserController {
    private final UserModel model;
    private final Userview view;

    public UserController(UserModel model, Userview view) {
        this.model = model;
        this.view = view;

        // Add action listener to the submit button
        this.view.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSignup();
            }
        });
    }

    private void handleSignup() {
        // Get data from the view
        String firstname = view.getFirstName().getText();
        String lastname = view.getLastName().getText();
        String phone = view.getPhone().getText();  
        String email = view.getEmail().getText();
        String collegename = view.getCollegeName().getText();
        String year = view.getYear().getText();
        String semester = view.getSemester().getText();
        String rollno = view.getRollno().getText();

        // Update the model
        model.setFirstName(firstname);
        model.setLastNmae(lastname);
        model.setEmail(email);
        model.setPhone(phone);
        model.setCollegeName(collegename);
        model.setYear(year);
        model.setCollegeName(semester);
        model.setRollno(rollno);

        // Simple validation and message
        if (firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || phone.isEmpty() || collegename.isEmpty() || year.isEmpty() || semester.isEmpty() || rollno.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Registerup Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Create the model, view, and controller
        UserModel model = new UserModel();
        Userview view = new Userview();
        UserController controller = new UserController(model, view);
    }
}