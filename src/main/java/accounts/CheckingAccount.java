package accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(long balance, String name) {
        super(balance, name);
    }

    public boolean pay(long amount) {
        if (amount <= balance && (balance - amount) >= 0) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}


