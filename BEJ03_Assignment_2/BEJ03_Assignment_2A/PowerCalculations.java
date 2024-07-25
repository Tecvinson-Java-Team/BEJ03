import java.util.Scanner;

public class PowerCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
//    Take input from user
        int input = scanner.nextInt();

//    Calculate the square
//        int squareOfInput = input * input;
        System.out.println("The square of your input is : " + Math.pow(input, 2));

//        Calculate the cube power
        System.out.println("The cube power of your input is: " + Math.pow(input, 3));

//        Calculate the fourth power
        System.out.println("The fourth power of your input is: " + Math.pow(input, 4));
    }
}
