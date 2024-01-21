package michael.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String type;
    private String owner;
    private List<Transaction> transactions = new ArrayList<Transaction> ();
    
    public Account(String owner, String type) {
        super();
        this.type = type;
        this.owner = owner;
    }
    
    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }
    
    public List<Transaction> getTransactions() {
        return transactions;
    }
    
    public void addTransaction(Transaction tx) {
        this.transactions.add(tx);
    }

    public float getBalance() {
        float balance = 0;
        for (Transaction tx : this.transactions) {
            balance += tx.getAmount();
        }
        return balance;
    }

    @Override
    public String toString() {
        return "type is " + type + ", owner is " + owner;
    }
}
