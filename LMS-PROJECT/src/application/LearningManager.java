package application;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LearningManager {
    public static void main(String[] args) {
        System.out.println("Welcome to the learning platform!!!");
        System.out.println("Choose an option: ");
        System.out.println("1. New user \n" + "2. Log in");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input){
            case 1:
                UserRegistration newUser = new UserRegistration();
                break;
            case 2:
                UserLogin login = new UserLogin();
                break;
        }
        UserRegistration newUser;

        scanner.close();
    }
}
