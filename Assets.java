import java.util.*;

public class Assets {
    // Fields
    private BankAccount[] bankAccounts;
    private Property[] properties;
    private double[] investments;
    private double proceedsFromSaleOfHome;
    private double giftedFunds;

    // Constructor
    public Assets(BankAccount[] bankAccounts, Property[] properties, double[] investments,
                  double proceedsFromSaleOfHome, double giftedFunds) {
        this.bankAccounts = bankAccounts;
        this.properties = properties;
        this.investments = investments;
        this.proceedsFromSaleOfHome = proceedsFromSaleOfHome;
        this.giftedFunds = giftedFunds;
    }

    // Getters
    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public Property[] getProperties() {
        return properties;
    }

    public double[] getInvestments() {
        return investments;
    }

    public double getProceedsFromSaleOfHome() {
        return proceedsFromSaleOfHome;
    }

    public double getGiftedFunds() {
        return giftedFunds;
    }
    
    // Method to calculate total assets
    public double calculateTotalAssets() {
        double totalAssets = 0;

        // Sum up balances of bank accounts
        for (BankAccount account : bankAccounts) {
            totalAssets += account.getCurrentBalance();
        }

        // Sum up expected sales prices of properties
        for (Property property : properties) {
            totalAssets += property.getExpectedSalesPrice();
        }

        // Sum up values of investments
        for (double investment : investments) {
            totalAssets += investment;
        }

        // Add proceeds from sale of home
        totalAssets += proceedsFromSaleOfHome;

        // Add gifted funds
        totalAssets += giftedFunds;

        return totalAssets;
    }
    
    @Override
    public String toString() {
        return "Assets{" +
                "bankAccounts=" + Arrays.toString(bankAccounts) +
                ", properties=" + Arrays.toString(properties) +
                ", investments=" + Arrays.toString(investments) +
                ", proceedsFromSaleOfHome=" + proceedsFromSaleOfHome +
                ", giftedFunds=" + giftedFunds +
                '}';
    }
}