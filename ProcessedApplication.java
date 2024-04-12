public class ProcessedApplication extends Application {
    private boolean status; // true for approved, false for rejected
    private LoanEstimate loanEstimate;

    public ProcessedApplication(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        super(applicationNumber, borrower, lender, property);
        this.status = determineStatus(borrower, lender);
        this.loanEstimate = createLoanEstimate(status, borrower, property, lender);
    }

    private boolean determineStatus(Borrower borrower, Lender lender) {
        double totalDebts = borrower.getDebts().calculateTotalDebts();
        double totalAssets = borrower.getAssets().calculateTotalAssets();
        double totalIncome = borrower.getIncome().getTotalIncome();
        double dtiRatio = lender.getDtiRatio();
        CreditHistory creditHistory = borrower.getCreditHistory();

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

    private LoanEstimate createLoanEstimate(boolean status, Borrower borrower, Property property, Lender lender) {
        if (status) {
            double loanAmount = property.getExpectedSalesPrice();
            int loanTerm = 30; // Assuming a 30-year loan term
            double interestRate = lender.getInterestRate();
            double mortgageInsurance = 0.00; // Assuming no mortgage insurance
            double estimatedEscrow = (property.getRealEstateTaxes() + property.getHoaDues()) / 12.0; // Assuming escrow includes property taxes and HOA dues
            return new LoanEstimate(borrower.getName(), loanAmount, loanTerm, interestRate, mortgageInsurance, estimatedEscrow);
        } else {
            return new LoanEstimate("", -1, -1, -1, -1, -1);
        }
    }

    // Getters and setters
    public boolean isStatus() {
        return status;
    }

    public LoanEstimate getLoanEstimate() {
        return loanEstimate;
    }
}