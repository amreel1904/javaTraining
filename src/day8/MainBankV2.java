package day8;

import java.util.HashMap;
import java.util.Scanner;

public class MainBankV2 {
    private static final double DEFAULT_INTEREST = 0.15;
    private static double interestRate = DEFAULT_INTEREST;
    private static int bankAccountsCount = 0;
    private int id;
    private double balance;

    public MainBankV2() {
        this.id = ++bankAccountsCount;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public int getId() {
        return id;
    }

    public double calcInterest(int months) {
        return balance * interestRate * months;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Bank Account [ID: " + id + ", Balance: " + balance + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, MainBank> accounts = new HashMap<>();

        while (true) {
            System.out.print("Enter command: ");
            String commandLine = scanner.nextLine();
            String[] commandArgs = commandLine.split(" ");
            String command = commandArgs[0];

            // if else statement for create command
            if (command.equals("create")) {
                MainBank account = new MainBank();
                accounts.put(account.getId(), account);
                System.out.println("Bank account created with ID: " + account.getId());
            }
            // if else statement for deposit command
            else if (command.equals("deposit")) {
                int accountId = Integer.parseInt(commandArgs[1]);
                double amount = Double.parseDouble(commandArgs[2]);
                MainBank targetAccount = accounts.get(accountId);
                if (targetAccount != null) {
                    targetAccount.deposit(amount);
                    System.out.println("Deposit successful. New balance: " + targetAccount.balance);
                } else {
                    System.out.println("Invalid account ID");
                }
            }
            // if else statement for set-interest command
            else if (command.equals("set-interest")) {
                double interest = Double.parseDouble(commandArgs[1]);
                if (interest > 0 && interest <= 1) {
                    MainBank.setInterestRate(interest);
                    System.out.println("Interest rate set to: " + interest);
                } else {
                    System.out.println("Interest rate must be between 0 and 1");
                }
            }
            // if else statement for calc-interest command
            else if (command.equals("calc-interest")) {
                int accountId = Integer.parseInt(commandArgs[1]);
                int months = Integer.parseInt(commandArgs[2]);
                MainBank targetAccount = accounts.get(accountId);
                if (targetAccount != null) {
                    double interestAmount = targetAccount.calcInterest(months);
                    System.out.println("Interest for " + months + " months: " + interestAmount);
                } else {
                    System.out.println("Invalid account ID");
                }
            }
            // if else statement for end command
            else if (command.equals("end")) {
                System.out.println("Exiting program");
                System.exit(0);
            }
            // default statement for invalid commands
            else {
                System.out.println("Invalid command");
            }
        }
    }
}
