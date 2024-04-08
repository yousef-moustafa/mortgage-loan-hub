import java.time.LocalDate;

public class ClosedApplication extends ProcessedApplication {
    // Fields
    private ClosingDisclosure closingDisclosure;

    // Constructor
    public ClosedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property, String loanId, LocalDate closingDate) {
        super(applicationNumber, borrower, lender, property);
        this.closingDisclosure = new ClosingDisclosure(loanId, closingDate);
    }

    // Getter for ClosingDisclosure
    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }

    // Method to create a closing disclosure
    public void createClosingDisclosure(String loanId, LocalDate closingDate) {
        this.closingDisclosure = new ClosingDisclosure(loanId, closingDate);
    }
}
