package accounts;

public class Account {
    protected long balance;
    protected String name;

    public Account(long balance, String name) {
        this.balance = balance; //может быть отрицательным или положительным
        this.name = name;
    }

    public void setBalance(long balance) {
        if (balance < 0) {
            return;
        }
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }


    //оплатить
    public boolean pay(long amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }


    //пополнить
    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}
