package application;

import controls.UserValidation;

public class UserLogin implements UserValidation {
    public void feedbackMessage(String username, String password){
        if (UserValidation.super.validateUsername(username) && UserValidation.super.validatePassword(password)){
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }
}
