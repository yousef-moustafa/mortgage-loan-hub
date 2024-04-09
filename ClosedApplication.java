import java.time.LocalDate;

public class ClosedApplication extends ProcessedApplication {
    private static int nextLoanId = 1; // Static variable to track the next loan ID

    private ClosingDisclosure closingDisclosure;

    // Constructor
    public ClosedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        super(applicationNumber, borrower, lender, property);
        this.closingDisclosure = createClosingDisclosure();
    }

    // Method to create the ClosingDisclosure
    private ClosingDisclosure createClosingDisclosure() {
        String loanId = "Loan-" + nextLoanId++; // Generate a unique loan ID
        LocalDate closingDate = LocalDate.now(); // Set the closing date to today's date
        return new ClosingDisclosure(loanId, closingDate);
    }

    // Getters and setters
    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }

    public void setClosingDisclosure(ClosingDisclosure closingDisclosure) {
        this.closingDisclosure = closingDisclosure;
    }
}