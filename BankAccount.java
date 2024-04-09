import java.util.Date;
import java.util.*;

public class BankAccount {
    // Fields
    private String accountNumber;
    private String accountType;
    private boolean isOpen;
    private Date openDate;
    private String[] accountHolders;
    private double currentBalance;
    private double[] balanceHistory;
    private double interestRate;
    private double interestPaid;
    private Date closedDate;
    private double closedBalance;

    // Constructor
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
