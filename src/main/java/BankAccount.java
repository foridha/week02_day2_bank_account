/* STEPS!
Create a BankAccount class
Define properties of the class
Create a constructor for the class and initialise properties
Create getters and setters for each property
Create methods to do stuff
*/


// Import a class from the Java Standard Library that provides date functionality.
import java.time.LocalDate;

// Define a class named BankAccount.
public class BankAccount {
    // Define properties (variables that belong to the class).
    // These are private and can only be accessed from within this class.
    private String firstName;        // Store the first name.
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;

    // Create a constructor method for the BankAccount class.
    // This constructor initializes the properties when a BankAccount object is created.
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber) {
        this.firstName = firstName;        // Initialize the firstName property with the provided value.
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0;  // Initialize the balance property to 0.0 e.g. start with a zero balance.
    }

    // Define getter and setter methods for each property.

    // Get the first name.
    public String getFirstName() {
        return firstName;
    }

    // Set the first name.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get the last name.
    public String getLastName() {
        return lastName;
    }

    // Set the last name.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Get the date of birth.
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Set the date of birth.
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Get the account number.
    public String getAccountNumber() {
        return accountNumber;
    }

    // Set the account number.
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Get the account balance.
    public double getBalance() {
        return balance;
    }

    // Set the account balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // METHOD 1: Define a method to deposit money into the account.
    public void deposit(double inputAmount) { //store input as 'deposit' and expect a number or decimal value
        if (inputAmount > 0) {
            balance += inputAmount;  // Increase the balance by the provided amount.
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    // METHOD 2: Define a method to withdraw money from the account.
    public void withdrawal(double inputAmount) {
        if (inputAmount > 0 && inputAmount <= balance) { //Can only withdraw if there is enough money
            balance -= inputAmount;  // Decrease the balance by the provided amount.
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // METHOD 3: Define a method to add interest to the account (5% of the current balance).
    public void payInterest() {
        balance += (0.05 * balance);  // Add 5% of the current balance to the balance.
    }

}



