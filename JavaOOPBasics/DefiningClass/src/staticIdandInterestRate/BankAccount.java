package staticIdandInterestRate;

public class BankAccount {
    private static final double  DEFAULT_INTEREST = 0.02;

    private static double rate = DEFAULT_INTEREST;

    private int id ;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
    }

    public void deposit(double amount){
        balance += amount;
    }


    public double getInterest(int years) {
        return BankAccount.rate  * years * this.balance;
    }

    public static void setInterestRate(double interestRate) {
        rate = interestRate;
    }

}
