package day8;

import java.util.*;

public class MainBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, BankAccount> accounts = new HashMap<>();
		while (true) {
			// TODO: split the command to extract its args
			String command = sc.nextLine();
			switch (command) {
			case "create: ":// TODO
			case "deposit: ":// TODO
			case "set interest: ":// TODO
			case "calc interest: ":// TODO
			case "end":// TODO
			}
		}
	}
}

class BankAccount {
	private static final double DEFAULT_INTEREST = 0.15;

	private static double interestRate = DEFAULT_INTEREST;
	private static int bankAccountCount = 0;
	private int id;
	private double balance;

	public BankAccount() {
		this.id = ++bankAccountCount;
	}

	public BankAccount(int id, double balance, double interestRate, int bankAccountCount) {
		this.id = ++bankAccountCount;
		this.balance = balance;
		this.interestRate = interestRate;
		this.bankAccountCount = bankAccountCount;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public int getBankAccountCount() {
		return this.bankAccountCount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setInterestRate(double rate) {
		interestRate = rate;
	}

	public String toString() {
		return String.format("Bank ID: %d%nBalance: %.2f%nInterest Rate: %.2f%nNumber of Bank Account: %d", this.id,
				this.balance, this.interestRate, this.bankAccountCount);
	}

}

/* package day8;

import java.util.*;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        while (true) {
            String command = sc.nextLine();
            String[] commandArgs = command.split(": ");

            switch (commandArgs[0]) {
                case "create":
                    BankAccount newAccount = new BankAccount();
                    accounts.put(newAccount.getId(), newAccount);
                    System.out.println("Account created. ID: " + newAccount.getId());
                    break;
                case "deposit":
                    int depositAccountId = Integer.parseInt(commandArgs[1]);
                    double depositAmount = Double.parseDouble(commandArgs[2]);

                    BankAccount depositAccount = accounts.get(depositAccountId);
                    if (depositAccount != null) {
                        depositAccount.deposit(depositAmount);
                        System.out.println("Deposit successful. Balance: " + depositAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "set interest":
                    double newInterestRate = Double.parseDouble(commandArgs[1]);
                    BankAccount.setInterestRate(newInterestRate);
                    System.out.println("Interest rate set to: " + newInterestRate);
                    break;
                case "calc interest":
                    int calcInterestAccountId = Integer.parseInt(commandArgs[1]);
                    BankAccount calcInterestAccount = accounts.get(calcInterestAccountId);
                    if (calcInterestAccount != null) {
                        calcInterestAccount.applyInterest();
                        System.out.println("Interest calculated. Balance: " + calcInterestAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "end":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}

class BankAccount {
    private static final double DEFAULT_INTEREST = 0.15;

    private static double interestRate = DEFAULT_INTEREST;
    private static int bankAccountCount = 0;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = ++bankAccountCount;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void applyInterest() {
        this.balance += this.balance * interestRate;
    }
}
*/