import java.util.*;

public class MortgageImplementer implements MLH
{
    // setting up all roles of mortgage market
    @Override
    public MortgageMarket initializeMortgageMarket(int numOfBorrowers, int numOfProperties, int numOfLenders) {
        MortgageMarket mortgageMarket = new MortgageMarket();

        Scanner scanner = new Scanner(System.in);

        // Add borrowers
        for (int i = 0; i < numOfBorrowers; i++) {
            Borrower borrower = createBorrower();
            mortgageMarket.addBorrower(borrower);
        }
        
        // Add properties
        for (int i = 0; i < numOfProperties; i++) {
            Property property = createProperty();
            mortgageMarket.addProperty(property);
        }

        // Add lenders
        for (int i = 0; i < numOfLenders; i++) {
            Lender lender = createLender();
            mortgageMarket.addLender(lender);
        }

        return mortgageMarket;
    };

    // creates an application mortgage to a lender by a borrower on a property
    @Override
    Application apply (Borrower b, Property p, Lender l){
        
    };
    
    //process the mortgage application to determine status and total price of transaction
    @Override
    ProcessedApplication process (Application a){
        
    };

    //Closing process
    @Override
    ClosedApplication close (ProcessedApplication pa){
        
    };
    
    // Helper methods to create Borrower, Property, and Lender objects
    private Borrower createBorrower() {
        Borrower borrower = new Borrower(); 
        return borrower;
    }

    private Property createProperty() {
        Property property = new Property();
        return property;
    }

    private Lender createLender() {
        Lender lender = new Lender();
        return lender;
    }
}
