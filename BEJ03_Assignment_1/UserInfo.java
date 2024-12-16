import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

//Declaring variables
        String title = "";
        String firstName = "";
        String lastName = "";
        String email = "";
        String phone = "";
        String country = "";
        String dateOfBirth = "";
        String placeOfBirth = "";
        String location = "";
        String gender = "";

//        Receive input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your title e.g Mr, Mrs");
        title = scanner.nextLine();

        System.out.println("Enter your first name");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name");
        lastName = scanner.nextLine();

        System.out.println("Enter your email");
        email = scanner.nextLine();

        System.out.println("Enter your phone number");
        phone = scanner.nextLine();

        System.out.println("Enter your country");
        country = scanner.nextLine();

        System.out.println("Enter your date of birth e.g dd/mm/yy");
        dateOfBirth = scanner.nextLine();

        System.out.println("Enter your place of birth");
        placeOfBirth = scanner.nextLine();

        System.out.println("Enter your location");
        location = scanner.nextLine();

        System.out.println("Enter your gender");
        gender = scanner.nextLine();

//        printing out user details
        System.out.println("Your details are:");
        System.out.println("Title:             " + title);
        System.out.println("First Name:        " + firstName);
        System.out.println("Last Name:         " + lastName);
        System.out.println("Email:             " + email);
        System.out.println("Phone Number:      " + phone);
        System.out.println("Country:           " + country);
        System.out.println("Date Of Birth:     " + dateOfBirth);
        System.out.println("Place Of Birth:    " + placeOfBirth);
        System.out.println("Location:          " + location);
        System.out.println("Gender:            " + gender);
    }}

// Team members names;
//Anulika Inyang-Tom, Adebayo Obafemi, Jerrison Okonoboh, Joy Eno Etim, Oke Olorunda, Olawale Awotoye