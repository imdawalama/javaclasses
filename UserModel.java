public class UserModel {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String collegename;
    private String year;
    private String semester;
    private String rollno;

    // Getters and setters
    public String getFirstName() {
        return firstname;
    }
      //firstname
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    //lastname
    public String getLastName() {
        return lastname;
    }
    public void setLastNmae(String lastname) {
        this.lastname = lastname;
    }
    //phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //collegename
    public String getCollegeName() {
        return collegename;
    }

    public void setCollegeName(String collegename) {
        this.collegename = collegename;
    }
    //year
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}