import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Income {
    private String category;
    private String month;
    private double amount;

    public Income() {
    }

    public Income(String category, String month, double amount) {
        this.category = category;
        this.month = month;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void displayIncomeDetails(Map<String, Map<String, Double>> entry) {
        double totalIncome = 0;
        for (Map.Entry<String, Map<String, Double>> incomeCategory : entry.entrySet()) {
            String category = incomeCategory.getKey();
            Map<String, Double> income = incomeCategory.getValue();

            System.out.println("1. Category: " + category);
            for (Map.Entry<String, Double> incomeAndAmount : (income.entrySet())) {
                System.out.println("2. Amount: " + incomeAndAmount.getValue());
                System.out.println("3. Month: " + incomeAndAmount.getKey());

                totalIncome += incomeAndAmount.getValue();
            }
        }
        System.out.println("Total Income: " + totalIncome);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many income entry do you want to make? ");
        int numberOfIncomeEntries = scanner.nextInt();
        Map<String, Map<String, Double>> incomeCategory = new HashMap<>();

        String[] categoryKeys = new String[numberOfIncomeEntries];
        String[] incomeKeys = new String[numberOfIncomeEntries];
        double[] incomeValues = new double[numberOfIncomeEntries];

        for (int i = 0; i < numberOfIncomeEntries; i++) {
            System.out.println("Enter income");
            System.out.print("Enter income category: ");
            String category = scanner.next();
            scanner.nextLine();
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the month: ");
            String month = scanner.nextLine();

            Income newIncome = new Income(category, month, amount);
            categoryKeys[i] = newIncome.getCategory();

            incomeKeys[i] = newIncome.getMonth();
            incomeValues[i] = newIncome.getAmount();

            Map<String, Double> income = new HashMap<>();
            for (int j = 0; j < numberOfIncomeEntries; j++) {
                income.put(incomeKeys[i], incomeValues[i]);
            }
            incomeCategory.put(categoryKeys[i], income);
        }
        displayIncomeDetails(incomeCategory);
        scanner.close();
    }
}
