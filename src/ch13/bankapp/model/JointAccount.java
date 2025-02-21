package ch13.bankapp.model;

/**
 * Class representing a joint bank account
 */
public class JointAccount {
    private int id;
    private String iban;
    private String firstname1;
    private String lastname1;
    private String ssn1;
    private String firstname2;
    private String lastname2;
    private String ssn2;
    private double balance;

    public JointAccount() {
    }

    public JointAccount(int id, String iban, String firstname1, String lastname1, String ssn1, String firstname2, String lastname2, String ssn2, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.ssn1 = ssn1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.ssn2 = ssn2;
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

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getSsn2() {
        return ssn1;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits an amount to the account
     * @param amount to be deposited
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount Exception");
        }
        this.balance += amount;
        System.out.println("Successful Deposit");
    }

    /**
     * Withdraws an amount from the account
     * @param amount to be withdrawn
     * @param ssn of one of the two account owners
     */
    public void withdraw(double amount, String ssn) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount Exception");
        }
        if (!this.ssn1.equals(ssn) && !this.ssn2.equals(ssn)){
            throw new IllegalArgumentException("Invalid ssn");
        }
        balance -= amount;
        System.out.println("Successful Withdraw");
        if (balance < 0) {
            System.out.println("Overdraft Account perks triggered, a loan is to be issued");
        }
    }
}
