package michael.bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO whenever you made a change to the bank, store the info in the file
// For example, creating an account or deposit/withdraw money
public class Bank {
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private List<Account> accounts = new ArrayList<Account>();
    private File bankFile = new File("/Users/michaelzhang/git/mz/java/src/michael/bank/bank.txt");

    /*
     * Loading the back information from a file
     */
    public Bank() {
        try {
            Scanner myReader = new Scanner(bankFile);
            Account current = null;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
                if (line.startsWith("\t")) {
                    // this is for transactions
                    String[] parts = line.split(" ");
                    String date = parts[0].trim();
                    Float amount = Float.parseFloat(parts[1].trim());
                    System.out.println("date:" + date + "  amount:" + amount);
                    if (amount >= 0) {
                        this.deposit(current.getOwner(), current.getType(), amount);
                    } else {
                        try {
                            this.withdraw(current.getOwner(), current.getType(), -amount);
                        } catch (OverDraftException e) {
                            // loading transaction from file would never have OverDraftException
                            // so just ignore it
                        }
                    }
                } else {
                    // this is for account
                    String[] parts = line.split(",");
                    String type = parts[0].trim();
                    String owner = parts[1].trim();
                    System.out.println("type:" + type + "  owner:" + owner);
                    current = new Account(owner, type);
                    accounts.add(current);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<Account> getAccountsForOwner(String owner) {
        List<Account> personsAccounts = new ArrayList<Account>();
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                personsAccounts.add(account);
            }
        }
        return personsAccounts;
    }

    public Account getAccount(String owner, String type) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner) && account.getType().equals(type)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account createAccount(String owner, String type) throws WrongTypeException, ExistingAccountException {
        if (!type.equals("c") && !type.equals("s")) {
            throw new WrongTypeException(type);
        }
        if (getAccount(owner, type) != null) {
            throw new ExistingAccountException(owner, type);
        }
        Account acct = new Account(owner, type);
        accounts.add(acct);
        saveBankFile();
        return acct;
    }

    public void withdraw(String owner, String type, float money) throws OverDraftException {
        Account acct = this.getAccount(owner, type);
        if (acct != null) {
            float balance = acct.getBalance();
            if (money > balance) {
                throw new OverDraftException(money - balance);
            }
            acct.addTransaction(new Transaction(LocalDate.now(), -money));
            saveBankFile();
        }
    }

    public void deposit(String owner, String type, float money) {
        Account acct = this.getAccount(owner, type);
        if (acct != null) {
            acct.addTransaction(new Transaction(LocalDate.now(), money));
            saveBankFile();
        }
    }

    /*
     * It will save all the accounts including all the transactions to a file
     */
    private void saveBankFile() {
        try {
            PrintWriter myWriter = new PrintWriter(bankFile);
            for (Account account : accounts) {
                myWriter.println(account.getType() + ", " + account.getOwner());
                for (Transaction tx : account.getTransactions()) {
                    myWriter.println("\t" + tx.getDate() + " " + tx.getAmount());
                }
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.print("Can not wirte the file due to error: " + e.getMessage());
        }
    }
}
