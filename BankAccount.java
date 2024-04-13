import java.util.Date;
import java.util.Arrays;

/**
 * The BankAccount class represents a bank account.
 * It includes details such as account number, account type, open status, open date,
 * account holders, current balance, balance history, interest rate, interest paid,
 * closed date, and closed balance.
 */
public class BankAccount {
    // Fields
    private String accountNumber; // Account number
    private String accountType; // Account type
    private boolean isOpen; // Indicates if the account is open
    private Date openDate; // Date when the account was opened
    private String[] accountHolders; // List of account holders
    private double currentBalance; // Current balance of the account
    private double[] balanceHistory; // History of balances over time
    private double interestRate; // Interest rate of the account
    private double interestPaid; // Amount of interest paid
    private Date closedDate; // Date when the account was closed
    private double closedBalance; // Balance at the time of account closure

    /**
     * Constructs a BankAccount object with the provided account details.
     * 
     * @param accountNumber   Account number
     * @param accountType     Account type
     * @param isOpen          Indicates if the account is open
     * @param openDate        Date when the account was opened
     * @param accountHolders  List of account holders
     * @param currentBalance  Current balance of the account
     * @param balanceHistory  History of balances over time
     * @param interestRate    Interest rate of the account
     * @param interestPaid    Amount of interest paid
     * @param closedDate      Date when the account was closed
     * @param closedBalance   Balance at the time of account closure
     */
    public BankAccount(String accountNumber, String accountType, boolean isOpen,
                       Date openDate, String[] accountHolders, double currentBalance,
                       double[] balanceHistory, double interestRate, double interestPaid,
                       Date closedDate, double closedBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.isOpen = isOpen;
        this.openDate = openDate;
        this.accountHolders = accountHolders;
        this.currentBalance = currentBalance;
        this.balanceHistory = balanceHistory;
        this.interestRate = interestRate;
        this.interestPaid = interestPaid;
        this.closedDate = closedDate;
        this.closedBalance = closedBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public String[] getAccountHolders() {
        return accountHolders;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double[] getBalanceHistory() {
        return balanceHistory;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterestPaid() {
        return interestPaid;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public double getClosedBalance() {
        return closedBalance;
    }

    /**
     * Returns a string representation of the BankAccount object.
     * 
     * @return String representation of the BankAccount object
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", isOpen=" + isOpen +
                ", openDate=" + openDate +
                ", accountHolders=" + Arrays.toString(accountHolders) +
                ", currentBalance=" + currentBalance +
                ", balanceHistory=" + Arrays.toString(balanceHistory) +
                ", interestRate=" + interestRate +
                ", interestPaid=" + interestPaid +
                ", closedDate=" + closedDate +
                ", closedBalance=" + closedBalance +
                '}';
    }
}
