import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

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
        Income income = new Income(150000, 10000, 15000, 0, 5000, 0, 0);
        Employment employment = new Employment("Example Corp", "123-456-7890", "123 Main St", 5, "Software Engineer", income);
        
        BankAccount[] bankAccounts = {
        new BankAccount("12345678", "Checking", true, /* openDate */ null, new String[] {"John Doe"}, 50000.0, null, 0.05, 0.0, null, 0.0),
        new BankAccount("87654321", "Savings", true, /* openDate */ null, new String[] {"John Doe"}, 100000.0, null, 0.1, 0.0, null, 0.0)
        };
        Property[] properties = {
            new Property("123 Oak St, Anytown, CA 12345", 500000.0, "Single Family", 2000.0, 5000.0, 200.0)
        };
        double[] investments = {50000.0, 75000.0}; // Investments worth $125,000
        double proceedsFromSaleOfHome = 0.0;
        double giftedFunds = 0.0;
        
        Assets assets = new Assets(bankAccounts, properties, investments, proceedsFromSaleOfHome, giftedFunds);

        
        Debts debts = new Debts(300000, 0.0, 0.0, 0.0, 15000, 5000, 0.0, 0.0, 0.0);
        List<LocalDate> foreclosureDates = new ArrayList<>();
        CreditHistory creditHistory = new CreditHistory(0, 0, 0, 0, false, null, foreclosureDates, false);
        
        borrower.setEmployment(employment);
        borrower.setIncome(income);
        borrower.setAssets(assets);
        borrower.setDebts(debts);
        borrower.setCreditHistory(creditHistory);
        
        //System.out.println(borrower);

        // Assign values to lender1 attributes using setter methods
        lender1.setLenderNumber(1);
        lender1.setDtiRatio(3.0);
        lender1.setInterestRate(0.05);
        lender1.setLenderFees(1500);
        lender1.setClosingCosts(5000);

        // Assign values to lender2 attributes using setter methods
        lender2.setLenderNumber(2);
        lender2.setDtiRatio(3.5);
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
        
        // Check if both applications were approved
        if (processedApplication1.isStatus() && processedApplication2.isStatus()) {
            // Compare loan costs and choose the application with the lowest costs
            double totalCost1 = processedApplication1.getLoanEstimate().getEstimatedTotalMonthlyPayment();
            double totalCost2 = processedApplication2.getLoanEstimate().getEstimatedTotalMonthlyPayment();
        
            ProcessedApplication chosenApplication;
            if (totalCost1 < totalCost2) {
                chosenApplication = processedApplication1;
            } 
            else {
                chosenApplication = processedApplication2;
            }
        
            // Close the chosen application
            ClosedApplication closedApplication = mortgageImplementer.close(chosenApplication);
        
            // Print the chosen application details
            System.out.println("Chosen Application Number: " + closedApplication.getApplicationNumber());
            System.out.println("Chosen Lender: " + closedApplication.getLender().getLenderNumber());
            System.out.println("Chosen Loan Costs: " + closedApplication.getLoanEstimate().getEstimatedTotalMonthlyPayment());
        } 
        else if (processedApplication1.isStatus() || processedApplication2.isStatus()) {
            // Choose the approved application
            ProcessedApplication approvedApplication;
            if (processedApplication1.isStatus()) {
                approvedApplication = processedApplication1;
            } else {
                approvedApplication = processedApplication2;
            }
        
            // Close the approved application
            ClosedApplication closedApplication = mortgageImplementer.close(approvedApplication);
        
            // Print the closed application details
            System.out.println("Chosen Application Number: " + closedApplication.getApplicationNumber());
            System.out.println("Chosen Lender: " + closedApplication.getLender().getLenderNumber());
            System.out.println("Chosen Loan Costs: " + closedApplication.getLoanEstimate().getEstimatedTotalMonthlyPayment());
        } 
        else {
            System.out.println("Both applications were rejected. No application will be closed.");
        }
    }
}
