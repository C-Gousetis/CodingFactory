package gr.aueb.cf.ch11;

public class AccountApp {

    public static void main(String[] args) {
        Account alice = new Account(1, "GR123456", "Alice", "B.", "F12345", 350.00);

        try {
            alice.deposit(100);
            System.out.println("Successful deposit");
            System.out.println("The new balance is: " + alice.getBalance());

            alice.withdraw(50, "F12345");
            System.out.println(alice.accountToString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
