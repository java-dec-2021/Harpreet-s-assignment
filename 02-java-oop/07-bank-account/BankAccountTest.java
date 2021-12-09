public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount chase = new BankAccount();
        chase.depositMoney(150, "checkings");
        chase.depositMoney(200, "savings");
        chase.displayAccountBalance();

        System.out.println(BankAccount.getTotalBalance());

        chase.withdrawMoney(20, "savings");
        chase.withdrawMoney(100, "checkings");

        System.out.println(BankAccount.getTotalBalance());
    }
}
