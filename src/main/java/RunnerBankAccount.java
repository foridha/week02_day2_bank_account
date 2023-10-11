import java.time.LocalDate;

public class RunnerBankAccount {

    // Define the main method, which serves as the entry point for running the program.
    public static void main(String[] args) {
        // Create a BankAccount object with initial values.
        BankAccount account1 = new BankAccount("John", "Doe", LocalDate.of(1990, 5, 15), "123456789");

        // Test the deposit and withdrawal methods.
        account1.deposit(1000);  // Deposit 1000 into the account.
        System.out.println("Balance after deposit: " + account1.getBalance());

        account1.withdrawal(500);  // Withdraw 500 from the account.
        System.out.println("Balance after withdrawal: " + account1.getBalance());

        // Test the payInterest method.
        account1.payInterest();  // Add 5% interest to the account balance.
        System.out.println("Balance after interest: " + account1.getBalance());

        account1.setFirstName("Dave");
        System.out.println(account1.getFirstName()); //Use of a setter and getter adjusting private parameter
    }
}

