import accounts.CreditAccount;
import accounts.SavingsAccount;
import accounts.CheckingAccount;
import accounts.Account;
import clients.Client;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        SavingsAccount savingsAccount = new SavingsAccount(20000, "Накопительный счёт", 10);
        System.out.println("Накопительный счет");
        System.out.println(savingsAccount.getBalance());
        savingsAccount.pay(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.add(5500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.pay(100000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.pay(24001);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.pay(24000);
        System.out.println(savingsAccount.getBalance());

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        CheckingAccount checkingAccount = new CheckingAccount(100000, "Рассчётный счёт");
        System.out.println("Расчетный счёт");
        System.out.println(checkingAccount.getBalance());
        checkingAccount.pay(50000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.add(5000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.pay(55001);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.pay(55000);
        System.out.println(checkingAccount.getBalance());


        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        CreditAccount creditAccount = new CreditAccount(-50000, "Кредитный счёт");
        System.out.println("Кредитный счёт");
        System.out.println(creditAccount.getBalance());
        creditAccount.pay(50000);
        System.out.println(creditAccount.getBalance());
        creditAccount.add(25000);
        System.out.println(creditAccount.getBalance());
        creditAccount.add(25000);
        System.out.println(creditAccount.getBalance());
        creditAccount.add(25000);
        System.out.println(creditAccount.getBalance());


        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        Account[] accounts = {new CheckingAccount(1000, "Рассчётный счёт"), new CreditAccount(-100, "Кредитный счёт"), new SavingsAccount(3000, "Накопительный счёт", 100)};

        Client client = new Client("Скрудж МакДак", 3);
        client.add(new CheckingAccount(1000, "Рассчётный счёт"));
        client.add(new CreditAccount(-100, "Кредитный счёт"));
        client.add(new SavingsAccount(3000, "Накопительный счёт", 100));
        client.add(new Account(3000, "Лицевой чёт"));

        System.out.println(Arrays.toString(accounts));

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");


        client.pay(30000);
        client.pay(1000);


    }
}