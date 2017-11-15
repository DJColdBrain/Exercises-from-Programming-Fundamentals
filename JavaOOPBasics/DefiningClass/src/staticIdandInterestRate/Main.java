package staticIdandInterestRate;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] commands = reader.readLine().split("\\s+");

            if (commands[0].equals("End")) {
                break;
            }

            switch (commands[0]) {
                case "SetInterest":
                    double amount = Double.parseDouble(commands[1]);
                    BankAccount.setInterestRate(amount);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commands[1]);
                    amount = Double.parseDouble(commands[2]);
                    deposit(id, amount);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);
                    getInerest(id, years);
                    break;
                case "Create":
                    createAccount();
                    break;
            }
        }
    }

    private static void createAccount() {

        int n = accounts.size() + 1;
        BankAccount bankAccount = new BankAccount(n);
        accounts.put(n, bankAccount);
        System.out.println("Account ID"+n+" created");
    }

    public static void deposit(int id, double amount) {
        if (!accounts.containsKey(id)) {
            accountDoesntExist();
            return;
        }
        accounts.get(id).deposit(amount);
        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
    }
    public static void getInerest(int id,int years) {
        if (!accounts.containsKey(id)) {
            accountDoesntExist();
            return;
        }
        double interest = accounts.get(id).getInterest(years);
        System.out.printf("%.2f%n", interest);

    }

    private static void accountDoesntExist() {
        System.out.println("Account does not exist");
    }


}
