package LAB03;
import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
 
        System.out.print("Enter number of customers (N): ");
        int n = input.nextInt();
        input.nextLine(); 
 
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Customer " + (i + 1) + " ---");
 
            String accNo;
            while (true) {
                System.out.print("Account Number (14 digits): ");
                accNo = input.nextLine();
                if (!accNo.matches("\\d{14}")) {
                    System.out.println("Invalid! The account number must be exactly 14 digits.");
                } else if (bank.findAccount(accNo) != null) {
                    System.out.println("Invalid! That account number already exists.");
                } else {
                    break;
                }
            }
 
            System.out.print("Name                      : ");
            String name = input.nextLine();
            System.out.print("Balance                   : ");
            double balance = input.nextDouble();
            input.nextLine(); 
            bank.addAccount(new Account(accNo, name, balance));
        }
 
        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display all accounts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();
 
            if (choice == 1 || choice == 2) {
                System.out.print("Enter account number: ");
                String accNo = input.nextLine();
                Account acc = bank.findAccount(accNo);
 
                if (acc == null) {
                    System.out.println("Account not found.");
                } else {
                    System.out.print("Enter amount: ");
                    double amount = input.nextDouble();
                    input.nextLine(); 
 
                    if (choice == 1) {
                        if (acc.deposit(amount)) {
                            System.out.println("Deposit successful.");
                        } else {
                            System.out.println("Invalid amount.");
                        }
                    } else {
                        if (acc.withdraw(amount)) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Withdrawal failed: insufficient balance or invalid amount.");
                        }
                    }
 
                   
                    System.out.println("\nUpdated account details:");
                    acc.display();
                }
            } else if (choice == 3) {
                bank.displayAll();
            } else if (choice != 4) {
                System.out.println("Invalid option. Please choose 1-4.");
            }
        } while (choice != 4);
 
        System.out.println("Thank you for using the banking system.");
        input.close();
    }
}