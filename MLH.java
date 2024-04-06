public interface MLH {
    // setting up all roles of mortgage market
    MortgageMarket initializeMortgageMarket(int numOFBorrowers, int numOFProperties, int numOFLenders);

    // creates an application mortgage to a lender by a borrower on a property
    Application apply (Borrower b, Property p, Lender l);
    //process the mortgage application to determine status and total price of transaction
    ProcessedApplication process (Application a);

    //Closing process
    ClosedApplication close (ProcessedApplication pa);
}
