package bankAccountTestClient;

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
                case "Withdraw":
                    int id = Integer.parseInt(commands[1]);
                    double ammount = Double.parseDouble(commands[2]);
                    withdraw(id, ammount);
                    break;
                case "Deposit":
                    id = Integer.parseInt(commands[1]);
                    ammount = Double.parseDouble(commands[2]);
                    deposit(id, ammount);
                    break;
                case "Print":
                    id = Integer.parseInt(commands[1]);
                    printAccount(id);
                    break;
                case "Create":
                    id = Integer.parseInt(commands[1]);
                    createAccount(id);
                    break;
            }
        }
    }

    public static void printAccount(int id) {
        if (!accounts.containsKey(id)) {
            accountDoesntExist();
            return;
        }
        System.out.printf("Account ID%d, balance %.2f%n", accounts.get(id).getId(), accounts.get(id).getBalance());
    }

    public static void createAccount(int id) {
        if (accounts.containsKey(id)) {
            accountExist();
            return;
        }
        BankAccount newBankAccount = new BankAccount(id);
        accounts.put(id, newBankAccount);
    }

    public static void withdraw(int id, double amount) {
        if (!accounts.containsKey(id)) {
            accountDoesntExist();
            return;
        }
        accounts.get(id).withdraw(amount);
    }

    public static void deposit(int id, double amount) {
        if (!accounts.containsKey(id)) {
            accountDoesntExist();
            return;
        }
        accounts.get(id).deposit(amount);
    }

    private static void accountExist() {
        System.out.println("Account already exists");
    }

    private static void accountDoesntExist() {
        System.out.println("Account does not exist");
    }

}
