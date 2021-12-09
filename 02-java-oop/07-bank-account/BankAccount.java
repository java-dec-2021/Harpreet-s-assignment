import java.util.Random;

public class BankAccount{
    // Attributes
    private String accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    private static double totalBalance;
    
    // Constructors
    public BankAccount(){
        this.accountNumber = this.randomAccountNumber();
        this.checkingsBalance = 0;
        this.savingsBalance = 0;
    }

    // Methods
    private String randomAccountNumber(){
        String accountNumber = "";
        // pull 1 random number and concate to to account number and repeat process 9 times
        Random r = new Random();
        for(int i=0; i<10; i++){
            accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
        }
        return accountNumber;
    }
    // Deposit money to checkings or savings account. Increase the amount of money in both accounts
    public void depositMoney(double amount, String account){
        if (account.equals("checkings"))
            this.checkingsBalance += amount;
        else if (account.equals("savings"))
            this.savingsBalance += amount;
        BankAccount.totalBalance +=amount;
    }
    // withdrawing money 
    public void withdrawMoney(double amount, String account){
        boolean successful = false;
        if(account.equals("checking")){
            if(this.checkingsBalance - amount >= 0) {
                successful = true;
                this.savingsBalance -= amount;
            }
        else if(account.equals("savings")){
            successful = true;
            this.savingsBalance -= amount;
        }
        }
        if (successful) {
            BankAccount.totalBalance -= amount;
        }
    }
    public void displayAccountBalance(){
        System.out.println(String.format("Savings: %.2f, Checkings: %2f", this.savingsBalance, this.checkingsBalance));
    }
    // getters and setters
    public double getCheckingsBalance(){
        return this.checkingsBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public static double getTotalBalance(){
        return totalBalance;
    }
    public static void setTotalBalance(double totalBalance){
        BankAccount.totalBalance = totalBalance;
    }
}