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

        // Assign values to attributes using setter methods
        borrower.setName("John Doe");
        borrower.setSsn("123-45-6789");
        borrower.setHomePhone("123-456-7890");
        borrower.setDob("1990-01-01");
        // Set other borrower attributes using setter methods

        // Assign values to lender1 attributes using setter methods
        lender1.setLenderNumber(1);
        lender1.setDtiRatio(0.3);
        lender1.setInterestRate(0.05);
        lender1.setLenderFees(1500);
        lender1.setClosingCosts(5000);

        // Assign values to lender2 attributes using setter methods
        lender2.setLenderNumber(2);
        lender2.setDtiRatio(0.35);
        lender2.setInterestRate(0.055);
        lender2.setDownPaymentRequirement(0.25);
        lender2.setLenderFees(2000);
        lender2.setClosingCosts(6000);

        // Assign values to property attributes using setter methods
        property.setStreetAddress("123 Main St");
        property.setExpectedSalesPrice(300000.0);
        property.setHomeType("Single-Family");
        property.setSize(2000.0);
        property.setRealEstateTaxes(4000.0); 
        property.setHoaDues(100.0); 

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
