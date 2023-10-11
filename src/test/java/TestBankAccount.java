/* STEPS
Add testing framework to pom.xml
Create class and object for testing
Test methods
 */


import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankAccount {

@Test
public void testDeposit() { // what is this line? instead of main(string[] args) {
    // Arrange: Create a BankAccount object for testing.
    BankAccount accountTest = new BankAccount("John", "Doe", LocalDate.of(1990, 5, 15), "123456789");
    accountTest.deposit(1000);

    // Act: Test deposit method.
    double actual = accountTest.getBalance();

    // Assert: Ensure the balance is updated correctly. (hit opt and enter key)
    assertThat(actual).isEqualTo(1000.0);
}

    @Test
    public void testWithdrawal() {
        // Arrange: Create a BankAccount object for testing.
        BankAccount accountTest2 = new BankAccount("John", "Doe", LocalDate.of(1990, 5, 15), "123456789");

        // Act: Deposit some initial amount for testing withdrawal.
        accountTest2.deposit(1000);

//      Withdrawal method with a valid amount.
        accountTest2.withdrawal(500);

        // Act: Test withdrawal method.
        double actual = accountTest2.getBalance();

        // Assert: Ensure the balance is updated correctly. (hit opt and enter key)
        assertThat(actual).isEqualTo(500.0);
    }
}
