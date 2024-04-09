import java.util.*;

public class MortgageImplementer implements MLH
{
    // setting up all roles of mortgage market
    private MortgageMarket mortgageMarket;
    
    //counter variable to generate unique application numbers
    private static int applicationCounter = 1;
    
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

    // creates an application mortgage to a lender by a borrower on a property
    @Override
    public Application apply (Borrower b, Property p, Lender l){
        
        // Create a new Application object with the provided borrower, property, and lender
        Application application = new Application(applicationCounter++, b, l, p);
        
        // Return the created application
        return application;  
    };
    
    //process the mortgage application to determine status and total price of transaction
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
    
    //Closing process
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
