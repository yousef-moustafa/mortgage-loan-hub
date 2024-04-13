import java.time.LocalDate;

/**
 * The ClosedApplication class represents a processed mortgage application that has been closed.
 * It extends the ProcessedApplication class and includes additional functionality for managing closing disclosures.
 */
public class ClosedApplication extends ProcessedApplication {
    private static int nextLoanId = 1; // Static variable to track the next loan ID

    private ClosingDisclosure closingDisclosure; // Closing disclosure associated with the closed application

    /**
     * Constructs a new ClosedApplication with the specified application details.
     * @param applicationNumber The application number.
     * @param borrower The borrower associated with the application.
     * @param lender The lender associated with the application.
     * @param property The property associated with the application.
     */
    public ClosedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        super(applicationNumber, borrower, lender, property);
        this.closingDisclosure = createClosingDisclosure(); // Automatically create a closing disclosure upon instantiation
    }

    /**
     * Creates a ClosingDisclosure for the closed application.
     * Generates a unique loan ID and sets the closing date to today's date.
     * @return The created ClosingDisclosure.
     */
    private ClosingDisclosure createClosingDisclosure() {
        String loanId = "Loan-" + nextLoanId++; // Generate a unique loan ID
        LocalDate closingDate = LocalDate.now(); // Set the closing date to today's date
        return new ClosingDisclosure(loanId, closingDate);
    }

    /**
     * Retrieves the closing disclosure associated with the closed application.
     * @return The ClosingDisclosure.
     */
    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }

    /**
     * Sets the closing disclosure for the closed application.
     * @param closingDisclosure The ClosingDisclosure to set.
     */
    public void setClosingDisclosure(ClosingDisclosure closingDisclosure) {
        this.closingDisclosure = closingDisclosure;
    }
}
