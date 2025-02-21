package ch13.bankapp.model;

/**
 * Class representing a bank account which permits withdrawing more money than the current balance
 */
public class OverDraftAccount {

    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public OverDraftAccount() {}

    public OverDraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits an amount of money to the account
     * @param amount the amount to be deposited
     * @throws IllegalArgumentException when amount equal or less than zero
     */
    public void deposit(double amount) throws IllegalArgumentException{
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount Exception");
        }
        balance += amount;
        System.out.println("Successful Deposit");
    }

    /**
     * Withdraws an amount from the account
     * Permits ending with negative balance
     * @param amount to be withdrawn
     * @throws IllegalArgumentException when amount to be withdrawn is negative or zero
     */
    public void withdraw(double amount, String ssn) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount Exception");
        }
        if (!this.ssn.equals(ssn)){
            throw new IllegalArgumentException("Invalid ssn");
        }
        balance -= amount;
        System.out.println("Successful Withdraw");
        if (balance < 0) {
            System.out.println("Overdraft Account perks triggered, a loan is to be issued");
        }
    }
}
