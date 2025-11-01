import java.util.Scanner;

public class ExpenseTracker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String terminateChoice;

        System.out.println("Personal Expense Tracker:)");

        do {
            System.out.println("What do you want to do ?");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transaction");
            System.out.println("3. View Summary");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("add");
                    break;
                case 2:
                    System.out.println("view");
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
        
        System.out.println("Thanks:)");

    }
}
