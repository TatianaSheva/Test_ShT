import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class AccountsTest {

    @Test
    public void testClientConstructor() {
        int[] size = {0, 1, 100};
        for (int i = 0; i < size.length; i++) {
            Client client = new Client("Имя клиента", size[i]);
            Assertions.assertNotNull(client);
        }
    }

    @Test
    public void testSavingsAccount() {
        SavingsAccount testSavingsAccount = new SavingsAccount(20000, "Накопительный счёт", 10);
        int[] testAmount1 = {1, 19989};
        for (int i = 0; i < testAmount1.length; i++) {
            Assertions.assertTrue(testSavingsAccount.pay(testAmount1[i]));
        }

        int[] testAmount2 = {20001, 20002, 20003};
        for (int i = 0; i < testAmount2.length; i++) {
            Assertions.assertFalse(testSavingsAccount.pay(testAmount2[i]));
        }
    }

    @Test
    public void balanceCannotBePositive() {
        int testPayment = 5;
        CreditAccount testCreditAccount = new CreditAccount(-4, "Кредитный счёт");
        // Аккаунт не может иметь положительный баланс
        Assertions.assertFalse(testCreditAccount.add(testPayment));
    }
}
