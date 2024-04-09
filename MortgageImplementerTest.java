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
        Income income = new Income(50000, 10000, 5000, 2000, 1000, 2000, 3000);
        Employment employment = new Employment("Example Corp", "123-456-7890", "123 Main St", 2, "Software Engineer", income);
        
        String[] accountHolders = {"John Doe", "Jane Doe"};
        double[] balanceHistory = {1000, 1500, 2000}; 
        Date openDate = new Date(); 
        Date closedDate = null; 
        BankAccount bankAccount = new BankAccount("123456789", "Savings", true, openDate, accountHolders, 2000, balanceHistory, 0.05, 100, closedDate, 0);
        Property property1 = new Property("123 Main St", 250000, "Single Family", 2000, 3000, 100);
        
        BankAccount[] bankAccounts = {bankAccount};
        Property[] properties = {property1};
        double[] investments = {5000, 10000}; 
        Assets assets = new Assets(bankAccounts, properties, investments, 0, 0);
        
        Debts debts = new Debts(200000, 0, 500, 200, 15000, 5000, 3000, 100, 500);
        
        List<LocalDate> foreclosureDates = new ArrayList<>();
        foreclosureDates.add(LocalDate.of(2020, 5, 15)); 
        CreditHistory creditHistory = new CreditHistory(1, 2, 0, 3, true, LocalDate.of(2019, 10, 20), foreclosureDates, false);
        
        borrower.setEmployment(employment);
        borrower.setIncome(income);
        borrower.setAssets(assets);
        borrower.setDebts(debts);
        borrower.setCreditHistory(creditHistory);
        
        //System.out.println(borrower);

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
