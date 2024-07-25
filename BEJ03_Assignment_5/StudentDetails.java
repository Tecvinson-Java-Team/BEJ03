public class StudentDetails {
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    private String Gender;
    private String TheClass;
    SubjectDetails subject;

    //The Constructor
    public StudentDetails(String FirstName, String LastName, String DateOfBirth, String Gender, String TheClass, SubjectDetails subject){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender =Gender;
        this.TheClass = TheClass;
        this.subject =subject;

    }
    //The Getters and Setters
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getTheClass() {
        return TheClass;
    }

    public void setTheClass(String aClass) {
        TheClass = TheClass;
    }

    public SubjectDetails getSubject() {
        return subject;
    }

    public void setSubject(SubjectDetails subject) {
        this.subject = subject;
    }

    public String ShowStudentDetails(){
        System.out.println("FIRST NAME " + getFirstName());
        System.out.println("LAST NAME " + getLastName());
        System.out.println("Date Of Birth " + getDateOfBirth());
        System.out.println("Gender " + getGender());
        System.out.println("Class " + getTheClass());


        return "";
    }









}
