import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Take inputs from the user
        System.out.print("Enter your first input: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your second input: ");
        int num2 = scanner.nextInt();

//        Sum of user inputs
        System.out.println("The sum of your inputs is: " + (num1 + num2));

//        Difference
        System.out.println("The difference of your inputs is: " + (num1 - num2));

//        Product
        System.out.println("The product of your inputs is: " + (num1 * num2));

//        Average
        System.out.println("The average of your inputs is: " + ((num1 + num2) / 2.0));


//        Distance
        /*
        Distance:
        Formular --> d = √((x2 - x1)^2 + (y2 - y1)^2)
        x1 = 0, x2 = num1, y1 = 0, y2 = num2;
         */
        System.out.println("The distance between your inputs is: " + Math.sqrt(Math.pow((num1 - 0), 2) + Math.pow((num2 - 0), 2)));

//        Maximum
        System.out.println("The maximum of your inputs is: " + Math.max(num1, num2));

//        Minimum
        System.out.println("The minimum of your inputs is: " + Math.min(num1, num2));
    }
}