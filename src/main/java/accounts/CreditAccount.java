package accounts;

public class CreditAccount extends Account {

    public CreditAccount(long balance, String name) {
        super(balance, name);
    }


    public void setBalance(long balance) {
        this.balance = balance;
    }


    public boolean add(long amount) {
        if ((balance + amount) <= 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    //оплатить
    public boolean pay(long amount) {
        if ((balance - amount) >= 0) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}