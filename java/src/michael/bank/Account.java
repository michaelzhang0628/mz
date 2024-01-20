package michael.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String type;
    private String owner;
    private float balance;
    private List<Transaction> transactions = new ArrayList<Transaction> ();
    
    public Account(String type, String name) {
        super();
        this.type = type;
        this.owner = name;
        this.balance = 0;
    }
    
    public void withdraw(float money) throws OverDraftException {
        if (money > this.balance) {
            throw new OverDraftException(money - this.balance);
        }
        balance -= money;
        transactions.add(new Transaction(LocalDate.now(), -money));
    }
    
    public void deposit(float money) {
        balance += money;
        transactions.add(new Transaction(LocalDate.now(), money));
    }

    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "type is " + type + ", owner is " + owner + ", balance is " + balance;
    }
}
