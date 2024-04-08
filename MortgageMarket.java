import java.util.ArrayList;
import java.util.List;

public class MortgageMarket {
    private List<Borrower> borrowers;
    private List<Lender> lenders;
    private List<Property> properties;

    // Constructor
    public MortgageMarket() {
        borrowers = new ArrayList<>();
        lenders = new ArrayList<>();
        properties = new ArrayList<>();
    }

    // Method to add a borrower
    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    // Method to add a lender
    public void addLender(Lender lender) {
        lenders.add(lender);
    }

    // Method to add a property
    public void addProperty(Property property) {
        properties.add(property);
    }

    // Method to retrieve all borrowers
    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    // Method to retrieve all lenders
    public List<Lender> getLenders() {
        return lenders;
    }

    // Method to retrieve all properties
    public List<Property> getProperties() {
        return properties;
    }
}
