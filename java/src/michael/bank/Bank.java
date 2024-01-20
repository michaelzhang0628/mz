package michael.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO whenever you made a change to the bank, store the info in the file
// For example, creating an account or deposit/withdraw money
public class Bank {
    private List<Account> accounts = new ArrayList<Account>();
    
    public Bank() {
        // TODO read bank.txt and populate accounts with the information
        
    }

    public List<Account> getAllPersonsAccounts(String owner) {
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
    
    public Account createAccount(String owner, String type) throws WrongTypeException, ExistingAccountException {
        if (!type.equals("c") && !type.equals("s")) {
            throw new WrongTypeException(type);
        }
        if (getAccount(owner, type)!=null) {
            throw new ExistingAccountException(owner, type);
        }
        Account acct = new Account(type, owner);
        accounts.add(acct);
        return acct;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    //TODO type code so that user can only have two accounts, one checking and one saving.
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Bank mz = new Bank();
        while (true) {
            System.out.println("Hello! Welcome to the MZ bank! What's your name?");
            String name = scnr.nextLine();
            boolean hasAnAccount = mz.getAllPersonsAccounts(name).size() != 0;
            if (hasAnAccount) {
                System.out.println("Would you like to create an account? What type of account? (c/s/n)");
                String type = scnr.nextLine();
                if (type.equals("n")) {
                    System.out.println("Would you like to make a deposit or withdraw to one of your existing accounts? (d/w/n)");
                    String action = scnr.nextLine();
                    if (mz.getAllPersonsAccounts(name).size() > 1) {
                        System.out.println("Which account? (c/s)");
                        type = scnr.nextLine();
                    } else {
                        type = mz.getAllPersonsAccounts(name).get(0).getType();
                    }
                    for (int i = 0; i < mz.getAllPersonsAccounts(name).size(); i++) {
                        if (mz.getAllPersonsAccounts(name).get(i).getType().equals(type)) {
                            if (action.equals("d")) {
                                System.out.println("Account " + mz.getAllPersonsAccounts(name).get(i) + ". How much money would you like to deposit in this account?");
                                float money = Float.parseFloat(scnr.nextLine());
                                mz.getAllPersonsAccounts(name).get(i).deposit(money);
                                System.out.println("Money was deposited! Your account is now: " + mz.getAllPersonsAccounts(name).get(i));
                            } else if (action.equals("w")) {
                                System.out.println("Account" + mz.getAllPersonsAccounts(name).get(i) + ". How much money would you like to withdraw from this account?");
                                float money = Float.parseFloat(scnr.nextLine());
                                try {
                                    mz.getAllPersonsAccounts(name).get(i).withdraw(money);
                                    System.out.println("Money was withdrawed! Your account is now: " + mz.getAllPersonsAccounts(name).get(i));
                                } catch (OverDraftException e) {
                                    System.out.println("Sorry could not make transaction because your account is short by " + e.getAmount());
                                }
                            } else {
                                break;
                            }
                        }
                    }
                
                } else {
                    try {
                        Account acct = mz.createAccount(name, type);
                        System.out.println("Account " + acct + ". How much money would you like to deposit in this account?");
                        float money = Float.parseFloat(scnr.nextLine());
                        mz.getAccount(name, type).deposit(money);
                        System.out.println("Money was deposited!  Your account is now: " + mz.getAccount(name, type));
                    } catch (WrongTypeException e) {
                        System.out.println("This type of bank account is not availible at the MZ bank");
                    } catch (ExistingAccountException e) {
                        System.out.println("You already have this account, " + e.getType() + ". Can't make anymore of this account at the MZ bank.");
                    }
                }
            } else {
                System.out.println("Would you like to create an account? What type of account? (c/s/n)");
                String type = scnr.nextLine();
                if (type.equals("n")) {
                    break;
                } else {
                    try {
                        Account acct = mz.createAccount(name, type);
                        System.out.println("Account " + acct + ". How much money would you like to deposit in this account?");
                        float money = Float.parseFloat(scnr.nextLine());
                        mz.getAccount(name, type).deposit(money);
                        System.out.println("Money was deposited!  Your account is now: " + mz.getAccount(name, type));
                    } catch (WrongTypeException e) {
                        System.out.println("This type of bank account is not availible at the MZ bank");
                    } catch (ExistingAccountException e) {
                        System.out.println("You already have this account, " + e.getType() + ". Can't make anymore of this account at the MZ bank.");
                    }
                } 
            }
            System.out.println("Thank you for coming to the MZ bank! Have great day!" );
            System.out.println();
        }
    }
}
