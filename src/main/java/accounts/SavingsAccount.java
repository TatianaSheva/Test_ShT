package accounts;

public class SavingsAccount extends Account {

    protected long minBalance;

    public SavingsAccount(long balance, String name, long minBalance) {
        super(balance, name);
        this.minBalance = 1000;
    }

    public boolean pay(long amount) {
        if (amount <= balance || (balance - amount) > minBalance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}
