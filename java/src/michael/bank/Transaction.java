package michael.bank;

import java.time.LocalDate; 

public class Transaction {
    // the date and time when this transaction occurred
    private LocalDate date;
    // negative amount means withdraw, and positive means deposit
    private float amount;
    
    public Transaction(LocalDate date, float amount) {
        this.date = date;
        this.amount = amount;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public float getAmount() {
        return amount;
    }
    
    public static void main(String[] args) {
        System.out.println(""+LocalDate.now());
    }
}
