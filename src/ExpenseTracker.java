import java.util.Scanner;
import java.util.ArrayList;

public class ExpenseTracker {
    private static ArrayList<Transaction> transactions = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String terminateChoice;

        System.out.println("--- Personal Expense Tracker:) ---");

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transaction");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addTransaction();
                    break;
                case 2:
                    viewTransactions();
                    break;
                case 3:
                    viewSummary();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Enter a valid choice!");
                    break;
            }

            System.out.println("Do you want to continue ? (Yes/No)");
            terminateChoice = sc.next().toLowerCase();

        } while (!terminateChoice.equals("no"));

        System.out.println("Exiting program. Goodbye!");

    }

    // Methods
    private static void addTransaction() {

        while (true) {
            System.out.println("Adding Transaction");
            System.out.println("Format: DD-MM-YYYY, Type, Amount, Description");
            System.out.print("Enter Date: ");
            String date = sc.next();
            System.out.print("Enter Type (Income/Expense): ");
            String type = sc.next();
            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Description: ");
            String description = sc.nextLine();

            Transaction t = new Transaction(date, type, amount, description);
            transactions.add(t);
            System.out.println("Transaction added: " + t);
            //out.println(date + " | " + type + " | " + amount + " | " + description);
            System.out.println("Add another? (yes/no)");
            String choice = sc.next().toLowerCase();
            if (choice.equals("no")) {
                sc.nextLine();
                break;
            }
        }
    }

    private static void viewTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions to show.");
            return;
        }
        System.out.println("\nDate | Type | Amount | Description");
        System.out.println("------------------------------------");
        for (Transaction t : transactions) {
            System.out.println(t.toString());
        }
    }

    private static void viewSummary(){
        if (transactions.isEmpty()) {
            System.out.println("No transactions to show.");
            return;
        }

        int totalIncome =0;
        int totalExpense = 0;

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Income")) {
                totalIncome += t.getAmount();
            } else if (t.getType().equalsIgnoreCase("Expense")) {
                totalExpense += t.getAmount();
            }
        }

        int balance = totalIncome - totalExpense;

        System.out.println("\n--- Summary ---");
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Balance: " + balance);
    }
}
