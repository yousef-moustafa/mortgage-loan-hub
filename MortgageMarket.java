import java.util.ArrayList;
import java.util.List;

/**
 * The MortgageMarket class represents a market that stores all stakeholders
 * It provides functionality to add and retrieve borrowers, lenders, and properties.
 */
public class MortgageMarket {
    private List<Borrower> borrowers; // List to store borrowers
    private List<Lender> lenders; // List to store lenders
    private List<Property> properties; // List to store properties

    /**
     * Constructs a new MortgageMarket with empty lists for borrowers, lenders, and properties.
     */
    public MortgageMarket() {
        borrowers = new ArrayList<>();
        lenders = new ArrayList<>();
        properties = new ArrayList<>();
    }

    /**
     * Adds a borrower to the market.
     * @param borrower The borrower to be added.
     */
    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    /**
     * Adds a lender to the market.
     * @param lender The lender to be added.
     */
    public void addLender(Lender lender) {
        lenders.add(lender);
    }

    /**
     * Adds a property to the market.
     * @param property The property to be added.
     */
    public void addProperty(Property property) {
        properties.add(property);
    }

    /**
     * Retrieves all borrowers in the market.
     * @return A list of all borrowers in the market.
     */
    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    /**
     * Retrieves all lenders in the market.
     * @return A list of all lenders in the market.
     */
    public List<Lender> getLenders() {
        return lenders;
    }

    /**
     * Retrieves all properties in the market.
     * @return A list of all properties in the market.
     */
    public List<Property> getProperties() {
        return properties;
    }
}
