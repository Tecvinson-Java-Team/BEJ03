public class Employee {

    // Declaring Attributes
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationality;
    Allowance allowance;
    Vacation vacation;

    // Constructor for employee
    public Employee(String title, String firstName, String lastName, String email, String phone, String nationality, Allowance allowance, Vacation vacation){
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.nationality = nationality;
        this.allowance = allowance;
        this.vacation = vacation;

    }


    // Generating getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Display employee personal info
    public void displayPersonalInfo(){
        System.out.println("Title:                    " + getTitle());
        System.out.println("First Name:               " + getFirstName());
        System.out.println("Last Name:                " + getLastName());
        System.out.println("Email:                    " + getEmail());
        System.out.println("Phone:                    " + getPhone());
        System.out.println("Nationality:              " + getNationality());
    }
}

