import java.util.Arrays;

/**
 * The Assets class represents a collection of various financial assets owned by an individual or entity.
 * It includes bank accounts, properties, investments, proceeds from the sale of a home, and gifted funds.
 */
public class Assets {
    // Fields
    private BankAccount[] bankAccounts; // Array of bank accounts
    private Property[] properties; // Array of properties
    private double[] investments; // Array of investment values
    private double proceedsFromSaleOfHome; // Proceeds from the sale of a home
    private double giftedFunds; // Gifted funds

    /**
     * Constructs an Assets object with the provided details.
     * 
     * @param bankAccounts          Array of bank accounts
     * @param properties            Array of properties
     * @param investments           Array of investment values
     * @param proceedsFromSaleOfHome  Proceeds from the sale of a home
     * @param giftedFunds           Gifted funds
     */
    public Assets(BankAccount[] bankAccounts, Property[] properties, double[] investments,
                  double proceedsFromSaleOfHome, double giftedFunds) {
        this.bankAccounts = bankAccounts;
        this.properties = properties;
        this.investments = investments;
        this.proceedsFromSaleOfHome = proceedsFromSaleOfHome;
        this.giftedFunds = giftedFunds;
    }

    /**
     * Retrieves the array of bank accounts.
     * 
     * @return Array of bank accounts
     */
    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    /**
     * Retrieves the array of properties.
     * 
     * @return Array of properties
     */
    public Property[] getProperties() {
        return properties;
    }

    /**
     * Retrieves the array of investment values.
     * 
     * @return Array of investment values
     */
    public double[] getInvestments() {
        return investments;
    }

    /**
     * Retrieves the proceeds from the sale of a home.
     * 
     * @return Proceeds from the sale of a home
     */
    public double getProceedsFromSaleOfHome() {
        return proceedsFromSaleOfHome;
    }

    /**
     * Retrieves the gifted funds.
     * 
     * @return Gifted funds
     */
    public double getGiftedFunds() {
        return giftedFunds;
    }
    
    /**
     * Calculates the total value of all assets by summing up the values of bank accounts,
     * properties, investments, proceeds from the sale of a home, and gifted funds.
     * 
     * @return Total value of all assets
     */
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
    
    /**
     * Returns a string representation of the Assets object.
     * 
     * @return String representation of the Assets object
     */
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
