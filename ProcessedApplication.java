/**
 * The ProcessedApplication class represents a mortgage application that has been processed by a lender.
 * It extends the Application class and includes additional functionality for determining approval status and generating loan estimates.
 */
public class ProcessedApplication extends Application {
    private boolean status; // Status of the application (true for approved, false for rejected)
    private LoanEstimate loanEstimate; // Loan estimate associated with the processed application

    /**
     * Constructs a new ProcessedApplication with the specified application details.
     * Determines the approval status based on borrower's financial information and generates a loan estimate.
     * @param applicationNumber The application number.
     * @param borrower The borrower associated with the application.
     * @param lender The lender associated with the application.
     * @param property The property associated with the application.
     */
    public ProcessedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        super(applicationNumber, borrower, lender, property);
        this.status = determineStatus(borrower, lender); // Determine approval status
        this.loanEstimate = createLoanEstimate(status, borrower, property, lender); // Generate loan estimate
    }

    /**
     * Determines the approval status of the application based on borrower's financial information and lender's criteria.
     * @param borrower The borrower associated with the application.
     * @param lender The lender associated with the application.
     * @return True if the application is approved, false otherwise.
     */
    private boolean determineStatus(Borrower borrower, Lender lender) {
        // Retrieve borrower's financial information and lender's criteria
        double totalDebts = borrower.getDebts().calculateTotalDebts();
        double totalAssets = borrower.getAssets().calculateTotalAssets();
        double totalIncome = borrower.getIncome().getTotalIncome();
        double dtiRatio = lender.getDtiRatio();
        CreditHistory creditHistory = borrower.getCreditHistory();

        // Check borrower's financial health and credit history against lender's criteria (based off the specification)
        if (totalDebts >= totalAssets ||
            (totalDebts / totalIncome) > dtiRatio ||
            creditHistory.hasOutstandingJudgments() ||
            creditHistory.hasBankruptcyInLastSevenYears() ||
            creditHistory.hasForeclosureInLastSevenYears() ||
            creditHistory.isPartyToLawsuit() ||
            creditHistory.hasLoanResultedInForeclosure()) {
            return false; // Rejected
        }

        return true; // Approved
    }

    /**
     * Creates a loan estimate for the processed application.
     * If the application is approved, generates a loan estimate with loan details.
     * If the application is rejected, generates a blank loan estimate.
     * @param status The approval status of the application.
     * @param borrower The borrower associated with the application.
     * @param property The property associated with the application.
     * @param lender The lender associated with the application.
     * @return The created LoanEstimate.
     */
    private LoanEstimate createLoanEstimate(boolean status, Borrower borrower, Property property, Lender lender) {
        if (status) { // If application is approved
            double loanAmount = property.getExpectedSalesPrice();
            int loanTerm = 30; // Assuming a 30-year loan term
            double interestRate = lender.getInterestRate();
            double mortgageInsurance = 0.00; // Assuming no mortgage insurance
            double estimatedEscrow = (property.getRealEstateTaxes() + property.getHoaDues()) / 12.0; // Assuming escrow includes property taxes and HOA dues
            return new LoanEstimate(borrower.getName(), loanAmount, loanTerm, interestRate, mortgageInsurance, estimatedEscrow);
        } else { // If application is rejected
            return new LoanEstimate("", -1, -1, -1, -1, -1); // Return a blank loan estimate
        }
    }

// Getter Methods

    /**
     * Retrieves the approval status of the processed application.
     * @return True if the application is approved, false otherwise.
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Retrieves the loan estimate associated with the processed application.
     * @return The LoanEstimate.
     */
    public LoanEstimate getLoanEstimate() {
        return loanEstimate;
    }
}
