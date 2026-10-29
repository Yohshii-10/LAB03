package LAB03;
class Account {
    private String accountNumber;
    private String name;
    private double balance;
 
    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
 
    public String getAccountNumber() {
        return accountNumber;
    }
 
    
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }
 
 
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
 
    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name           : " + name);
        System.out.printf("Balance        : $%.2f%n", balance);
        System.out.println();
    }
}