import java.util.*;

/**
 * The {@code MortgageImplementer} class implements the {@code MLH} interface to handle mortgage-related operations.
 */
public class MortgageImplementer implements MLH {
    
    // Fields
    
    /** 
     * The mortgage market containing borrowers, lenders, and properties.
     */
    private MortgageMarket mortgageMarket;
    
    /** 
     * Counter variable to generate unique application numbers.
     */
    private static int applicationCounter = 1;
    
    // Methods
    
    /**
     * Initializes the mortgage market with the specified number of borrowers, properties, and lenders.
     * 
     * @param numOfBorrowers The number of borrowers to initialize.
     * @param numOfProperties The number of properties to initialize.
     * @param numOfLenders The number of lenders to initialize.
     * @return The initialized mortgage market.
     */
    @Override
    public MortgageMarket initializeMortgageMarket(int numOfBorrowers, int numOfProperties, int numOfLenders) {
        mortgageMarket = new MortgageMarket();
        
        // Initialize borrowers, lenders, and properties
        for (int i = 0; i < numOfBorrowers; i++) {
            Borrower borrower = new Borrower();
            mortgageMarket.addBorrower(borrower);
        }
        
        for (int i = 0; i < numOfLenders; i++) {
            Lender lender = new Lender();
            mortgageMarket.addLender(lender);
        }
        
        for (int i = 0; i < numOfProperties; i++) {
            Property property = new Property();
            mortgageMarket.addProperty(property);
        }
        
        return mortgageMarket;
    }

    /**
     * Creates a mortgage application to a lender by a borrower for a property.
     * 
     * @param b The borrower applying for the mortgage.
     * @param p The property for which the mortgage is being applied.
     * @param l The lender to whom the mortgage application is submitted.
     * @return The created application.
     */
    @Override
    public Application apply(Borrower b, Property p, Lender l) {
        // Create a new Application object with the provided borrower, property, and lender
        Application application = new Application(applicationCounter++, b, l, p);
        
        // Return the created application
        return application;  
    };
    
    /**
     * Processes the mortgage application to determine its status and total price of the transaction.
     * 
     * @param a The mortgage application to be processed.
     * @return The processed application.
     */
    @Override
    public ProcessedApplication process(Application a) {
        Borrower borrower = a.getBorrower();
        Lender lender = a.getLender();
        Property property = a.getProperty();
    
        // Create a new ProcessedApplication object
        ProcessedApplication processedApplication = new ProcessedApplication(a.getApplicationNumber(), borrower, lender, property);
    
        // Return the processed application object
        return processedApplication;
    }
    
    /**
     * Performs the closing process for the mortgage application.
     * 
     * @param pa The processed mortgage application to be closed.
     * @return The closed application.
     */
    @Override
    public ClosedApplication close(ProcessedApplication pa) {
        Borrower borrower = pa.getBorrower();
        Lender lender = pa.getLender();
        Property property = pa.getProperty();
    
        // Create a new ClosedApplication object
        ClosedApplication closedApplication = new ClosedApplication(pa.getApplicationNumber(), borrower, lender, property);
    
        // Return the closed application
        return closedApplication;
    }
    
}
