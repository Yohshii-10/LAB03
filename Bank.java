package LAB03;
import java.util.ArrayList;
class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
 
    public void addAccount(Account account) {
        accounts.add(account);
    }
 
  
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
 
    public void displayAll() {
        System.out.println("\n===== ALL ACCOUNTS =====");
        for (Account acc : accounts) {
            acc.display();
        }
    }
}