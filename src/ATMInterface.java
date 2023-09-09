import java.util.Scanner;

// Bank Account class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

// ATM class
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdrawing(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawing amount.");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient balance for withdrawing.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawing successful. Remaining balance: " + account.getBalance());
        }
    }

    public void depositing(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            account.deposit(amount);
            System.out.println("Deposit successful. New balance: " + account.getBalance());
        }
    }

    public void checkingTheBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}

// ATM Interface class
public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount userAccount = new BankAccount(initialBalance);

        ATM atm = new ATM(userAccount);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdrawing");
            System.out.println("2. Depositing");
            System.out.println("3. Checking The Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawing(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositing(depositAmount);
                    break;
                case 3:
                    atm.checkingTheBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye! See You Again!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select the option correctly again.");
            }
        }
    }
}/*
1.Create a class to represent the ATM machine.

2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.

3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().

4. Create a class to represent the user's bank account, which stores the account balance.

5. Connect the ATM class with the user's bank account class to access and modify the account
balance.

6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).

7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
*/