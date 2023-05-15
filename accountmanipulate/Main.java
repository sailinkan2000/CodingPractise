package accountmanipulate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(102, "Sai", "sailinkan29a@gmail.com");
        SavingsAccount savingsAccount = new SavingsAccount(1221, customer, 20000, 700);

        if (savingsAccount.withdraw(5000)) {
            System.out.println(savingsAccount.getBalance());
        }
    }
}