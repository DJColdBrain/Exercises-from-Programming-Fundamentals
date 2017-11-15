package bankAccountTestClient;

class BankAccount {
    private int id ;
    private double balance;

    public BankAccount (int id){
        this.id = id;
        balance = 0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (this.balance - amount < 0){
            System.out.println("Insufficient balance");
            return;
        }
        this.balance -= amount;
    }



    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
