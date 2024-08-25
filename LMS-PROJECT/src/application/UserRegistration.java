package application;

import controls.UserValidation;

import java.util.Scanner;

public class UserRegistration implements UserValidation {
    String username;
    String password;
    Scanner scanner = new Scanner(System.in);

    public UserRegistration() {
        System.out.println("Enter your username");
        setUsername(scanner.next());
        username = getUsername();
        System.out.println("Enter your password");
        setPassword(scanner.next());
        password = getPassword();
        this.feedbackMessage(username, password);

        scanner.close();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void feedbackMessage(String username, String password) {
        if (UserValidation.super.validateUsername(username) && UserValidation.super.validatePassword(password)) {
            System.out.println("Registration successful!");
            System.out.println(username);
            System.out.println(password);
        } else {
            System.out.println("Registration failed, check requirements again!!!");
            System.out.println(username);
            System.out.println(password);
        }
    }

}
