import java.util.Scanner;

abstract class BankAccount {
    protected double balance;
    protected int accountNumber;

    // Constructor to initialize account details
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods for deposit, withdraw, and interest calculation
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract double calculateInterest();

    // Method to display account details
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Savings Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount for Savings Account " + accountNumber);
        }
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Savings Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Savings Account " + accountNumber);
        }
    }

    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Current Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount for Current Account " + accountNumber);
        }
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Current Account " + accountNumber);
        }
    }

    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter Savings Account Number: ");
        int savingsAccNum = myScanner.nextInt();
        System.out.print("Enter Savings Account Initial Balance: ");
        double savingsBalance = myScanner.nextDouble();
        BankAccount savings = new SavingsAccount(savingsAccNum, savingsBalance);

        System.out.print("Enter Current Account Number: ");
        int currentAccNum = myScanner.nextInt();
        System.out.print("Enter Current Account Initial Balance: ");
        double currentBalance = myScanner.nextDouble();
        BankAccount current = new CurrentAccount(currentAccNum, currentBalance);

        System.out.print("Enter amount to deposit in Savings Account: ");
        double savingsDeposit = myScanner.nextDouble();
        savings.deposit(savingsDeposit);

        System.out.print("Enter amount to withdraw from Savings Account: ");
        double savingsWithdraw = myScanner.nextDouble();
        savings.withdraw(savingsWithdraw);

        System.out.print("Enter amount to deposit in Current Account: ");
        double currentDeposit = myScanner.nextDouble();
        current.deposit(currentDeposit);

        System.out.print("Enter amount to withdraw from Current Account: ");
        double currentWithdraw = myScanner.nextDouble();
        current.withdraw(currentWithdraw);

        // Displaying updated balances
        savings.displayBalance();
        current.displayBalance();

        // Displaying calculated interest
        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Current Interest: " + current.calculateInterest());

        myScanner.close();
    }
}
