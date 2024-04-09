public class MortgageImplementerTest {

    public static void main(String[] args) {
        // Initialize mortgage market
        MortgageImplementer mortgageImplementer = new MortgageImplementer();
        MortgageMarket mortgageMarket = mortgageImplementer.initializeMortgageMarket(1, 1, 2);

        // Get borrower, lenders, and property
        Borrower borrower = mortgageMarket.getBorrowers().get(0);
        Lender lender1 = mortgageMarket.getLenders().get(0);
        Lender lender2 = mortgageMarket.getLenders().get(1);
        Property property = mortgageMarket.getProperties().get(0);

        // Create two applications
        Application application1 = mortgageImplementer.apply(borrower, property, lender1);
        Application application2 = mortgageImplementer.apply(borrower, property, lender2);

        // Process the applications
        ProcessedApplication processedApplication1 = mortgageImplementer.process(application1);
        ProcessedApplication processedApplication2 = mortgageImplementer.process(application2);

        // Compare loan costs
        double totalCost1 = processedApplication1.getLoanEstimate().getEstimatedTotalMonthlyPayment();
        double totalCost2 = processedApplication2.getLoanEstimate().getEstimatedTotalMonthlyPayment();

        // Choose the application with the lowest loan costs
        ProcessedApplication chosenApplication;
        if (totalCost1 < totalCost2) {
            chosenApplication = processedApplication1;
        } else {
            chosenApplication = processedApplication2;
        }

        // Close the chosen application
        ClosedApplication closedApplication = mortgageImplementer.close(chosenApplication);

        // Print the chosen application details
        System.out.println("Chosen Application Number: " + closedApplication.getApplicationNumber());
        System.out.println("Chosen Lender: " + closedApplication.getLender().getLenderNumber());
        System.out.println("Chosen Loan Costs: " + closedApplication.getLoanEstimate().getEstimatedTotalMonthlyPayment());
    }
}
