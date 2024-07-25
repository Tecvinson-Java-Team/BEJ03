import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Expense {
    private String category;
    private String month;
    private double amount;

    public Expense() {
    }

    public Expense(String category, String month, double amount) {
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

    public static void displayExpenseDetails(Map<String, Map<String, Double>> entry) {
        double totalExpense = 0;
        for (Map.Entry<String, Map<String, Double>> expenseCategory : entry.entrySet()) {
            String category = expenseCategory.getKey();
            Map<String, Double> expense = expenseCategory.getValue();

            System.out.println("1. Category: " + category);
            for (Map.Entry<String, Double> expenseAndAmount : (expense.entrySet())) {
                System.out.println("2. Amount: " + expenseAndAmount.getValue());
                System.out.println("3. Month: " + expenseAndAmount.getKey());

                totalExpense += expenseAndAmount.getValue();
            }
        }
        System.out.println("Total Expense: " + totalExpense);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many expense entry do you want to make? ");
        int numberOfExpenseEntries = scanner.nextInt();
        Map<String, Map<String, Double>> expenseCategory = new HashMap<>();

        String[] categoryKeys = new String[numberOfExpenseEntries];
        String[] expenseKeys = new String[numberOfExpenseEntries];
        double[] expenseValues = new double[numberOfExpenseEntries];

        for (int i = 0; i < numberOfExpenseEntries; i++) {
            System.out.println("Enter expense");
            System.out.print("Enter expense category: ");
            String category = scanner.next();
            scanner.nextLine();
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the month: ");
            String month = scanner.nextLine();

            Expense newExpense = new Expense(category, month, amount);
            categoryKeys[i] = newExpense.getCategory();

            expenseKeys[i] = newExpense.getMonth();
            expenseValues[i] = newExpense.getAmount();

            Map<String, Double> expense = new HashMap<>();
            for (int j = 0; j < numberOfExpenseEntries; j++) {
                expense.put(expenseKeys[i], expenseValues[i]);
            }
            expenseCategory.put(categoryKeys[i], expense);
        }
        displayExpenseDetails(expenseCategory);
        scanner.close();
    }
}