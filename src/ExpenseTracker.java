import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "expenses.txt";

        String terminateChoice;
        // String date;
        // String type;
        // int amount;
        // String description;

        // ArrayList<Transaction> transactions = new ArrayList<>();

        System.out.println("Personal Expense Tracker:)");

        do {
            System.out.println("---MENU---");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transaction");
            System.out.println("3. View Summary");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        addTransaction(fileName, sc);
                        //System.out.println();
                        System.out.println("Do you want to add another transaction ? (yes/no)");
                        String choice2 = sc.next();
                        choice2.toLowerCase();
                        if (choice2.equals("no")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    viewTransactions(fileName);
                    break;
                case 3:
                    System.out.println("summary");
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
    private static void addTransaction(String fileName, Scanner sc) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
                PrintWriter out = new PrintWriter(bw)) {

            System.out.println("Adding Transaction");
            System.out.println("Format: DD-MM-YYYY, Type, Amount, Description");
            System.out.print("Enter Date: ");
            String date = sc.next();
            System.out.print("Enter Type: ");
            String type = sc.next();
            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            System.out.print("Enter Description: ");
            String description = sc.next();
            // Transaction t = new Transaction(date, type, amount, description);
            System.out.println("\nTransaction added");
            out.println(date + ", " + type + ", " + amount + ", " + description);

        } catch (Exception e) {
            System.out.println("Error writing in file!");
        }
    }

    private static void viewTransactions(String fileName) {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("No data found yet. Add some values first!");
            return;
        }
        System.out.println("---Previous Transactions---");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            //System.out.println("Text in the file: ");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error in reading file");
        }
    }
}
