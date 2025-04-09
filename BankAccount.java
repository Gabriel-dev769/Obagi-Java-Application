<<<<<<< HEAD
import java.util.Scanner;

public class BankAccount {
    String accountName = "Fund Raiser";
    String accountNumber = "4590468934";
    double accountBalance = 10000000000000.00;

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to UBA Bank");
        System.out.println("Enter 1 to withdraw");
        System.out.println("Enter 2 to deposit");

        System.out.println("Enter your choice:");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter amount to withdraw:");
                int amount = input.nextInt();

                bank.withdrawal(amount);
                System.out.printf("Transaction successful!%n");
                System.out.printf("Account name: %s%n", bank.accountName);
                System.out.printf("Account number: %s%n", bank.accountNumber);
                System.out.printf("Account balance: %.2f%n", bank.accountBalance);
            }
            break;

            case 2: {
                System.out.println("Enter amount to deposit:");
                int amount = input.nextInt();

                bank.deposit(amount);
                System.out.printf("Transaction successful!%n");
                System.out.printf("Account name: %s%n", bank.accountName);
                System.out.printf("Account number: %s%n", bank.accountNumber);
                System.out.printf("Account balance: %.2f%n", bank.accountBalance);
            }
            break;

            default: {
                System.out.println("Invalid choice! Please select either 1 or 2.");
            }
            break;
        }

        
    }

    public double withdrawal(int amount) {
        accountBalance -= amount;
        return accountBalance;
    }

    public double deposit(int amount) {
        accountBalance += amount;
        return accountBalance;
    }
}
=======
import java.util.Scanner;

public class BankAccount {
    String accountName = "Fund Raiser";
    String accountNumber = "4590468934";
    double accountBalance = 10000000000000.00;

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to UBA Bank");
        System.out.println("Enter 1 to withdraw");
        System.out.println("Enter 2 to deposit");

        System.out.println("Enter your choice:");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter amount to withdraw:");
                int amount = input.nextInt();

                bank.withdrawal(amount);
                System.out.printf("Transaction successful!%n");
                System.out.printf("Account name: %s%n", bank.accountName);
                System.out.printf("Account number: %s%n", bank.accountNumber);
                System.out.printf("Account balance: %.2f%n", bank.accountBalance);
            }
            break;

            case 2: {
                System.out.println("Enter amount to deposit:");
                int amount = input.nextInt();

                bank.deposit(amount);
                System.out.printf("Transaction successful!%n");
                System.out.printf("Account name: %s%n", bank.accountName);
                System.out.printf("Account number: %s%n", bank.accountNumber);
                System.out.printf("Account balance: %.2f%n", bank.accountBalance);
            }
            break;

            default: {
                System.out.println("Invalid choice! Please select either 1 or 2.");
            }
            break;
        }

        
    }

    public double withdrawal(int amount) {
        accountBalance -= amount;
        return accountBalance;
    }

    public double deposit(int amount) {
        accountBalance += amount;
        return accountBalance;
    }
}
>>>>>>> ceff0811524af1db9ab589ac8ffb4f1ca8680f66
