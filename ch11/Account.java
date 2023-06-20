package gr.aueb.cf.ch11;

public class Account {

    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account () {}

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
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

    //Public API

    /**
     * Deposits a certain amount of money
     * @param amount            the amount of money
     * @throws Exception        if the amount is negative
     */

    public void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Negative amount exception");
            }

            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * Withdraws a certain amount of money
     * @param ssn
     * @param amount            the amount of money
     * @throws Exception        if the balance is insufficient
     */

    /**
     * Withdraws a certain amount of money
     * @param amount            the amount of money
     * @param Ssn               the given ssn
     * @throws Exception        if the balance is insufficient
     */
    public void withdraw (double amount, String Ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn is not valid exception");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the account's state in String format
     * @return
     *          the String representation of the state of the account
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", "
                + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
