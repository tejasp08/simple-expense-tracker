import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fileName = "expenses.txt";

        String terminateChoice;
        String date;
        String type;
        int amount;
        String description;

        ArrayList<Transaction> transactions = new ArrayList<>();
        

        System.out.println("---Personal Expense Tracker:)---");

        do {
            System.out.println("What do you want to do ?");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transaction");
            System.out.println("3. View Summary");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                while (true) {
                    System.out.println("Adding Transaction");
                    System.out.println("Format: DD-MM-YYYY, Type, Amount, Description");
                    System.out.print("Enter Date: ");
                    date = sc.next();
                    System.out.print("Enter Type: ");
                    type = sc.next();
                    System.out.print("Enter Amount: ");
                    amount = sc.nextInt();
                    System.out.print("Enter Description: ");
                    description = sc.next();
                    
                    Transaction t = new Transaction(date, type, amount, description);
                    System.out.println("Transaction added: " + t);
                    //addTransaction(date, type, amount, description);
                    transactions.add(t);
                    System.out.println();
                    System.out.println("Do you want to add another transaction ? (yes/no)");
                    String choice2 = sc.next().toLowerCase();

                    if (choice2.equals("no")) {
                        break;
                    }
                }
                break;
                case 2:
                    System.out.println(transactions);
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

    //Methods
    private static void addTransaction() {

    }

    private static void viewTransaction() {
        
    }
}
