package michael.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Account> accounts = new ArrayList<Account>();

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

    public void addNewAccount(Account a) {
        accounts.add(a);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    //TODO type code so that user can't make a withdraw if the amount of money they want to withdraw is greater than the money they have in that specific account
    //TODOtype code so that user can only have two accounts, one checking and on saving.
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
                if (type.equals("c") || type.equals("s")) {
                    Account acct = new Account(type, name);
                    mz.addNewAccount(acct);
                    System.out.println("Account " + acct + ". How much money would you like to deposit in this account?");
                    float money = Float.parseFloat(scnr.nextLine());
                    mz.getAccount(name, type).deposit(money);
                    System.out.println("Money was deposited!  Your account is now: " + mz.getAccount(name, type));
                } else if (type.equals("n")) {
                    System.out.println("Would you like to make a deposit or withdraw to one of your existing accounts? (d/w/n)");
                    String x = scnr.nextLine();
                    if (mz.getAllPersonsAccounts(name).size() > 1) {
                        System.out.println("Which account? (c/s)");
                        type = scnr.nextLine();
                    }
                    for (int i = 0; i < mz.getAllPersonsAccounts(name).size(); i++) {
                        if (mz.getAllPersonsAccounts(name).get(i).getType().equals(type)) {
                            if (x.equals("d")) {
                                System.out.println("Account " + mz.getAllPersonsAccounts(name).get(i) + ". How much money would you like to deposit in this account?");
                                float money = Float.parseFloat(scnr.nextLine());
                                mz.getAllPersonsAccounts(name).get(i).deposit(money);
                                System.out.println("Money was deposited! Your account is now: " + mz.getAllPersonsAccounts(name).get(i));
                            } else if (x.equals("w")) {
                                System.out.println("Account" + mz.getAllPersonsAccounts(name).get(i) + ". How much money would you like to withdraw from this account?");
                                float money = Float.parseFloat(scnr.nextLine());
                                mz.getAllPersonsAccounts(name).get(i).withdraw(money);
                                System.out.println("Money was withdrawed! Your account is now: " + mz.getAllPersonsAccounts(name).get(i));
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println("Would you like to create an account? What type of account? (c/s/n)");
                String type = scnr.nextLine();
                if (type.equals("c") || type.equals("s")) {
                    Account acct = new Account(type, name);
                    mz.addNewAccount(acct);
                    System.out.println("Account " + acct + ". How much money would you like to deposit in this account?");
                    float money = Float.parseFloat(scnr.nextLine());
                    mz.getAccount(name, type).deposit(money);
                    System.out.println("Money was deposited!  Your account is now: " + mz.getAccount(name, type));
                } else if (type.equals("n")) {
                    break;
                }
            }
            System.out.println("Thank you for coming to the MZ bank! Have great day!" );
            System.out.println();
        }
    }
}
