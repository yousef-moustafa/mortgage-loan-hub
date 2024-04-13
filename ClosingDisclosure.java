import java.time.LocalDate;

/**
 * The {@code ClosingDisclosure} class represents a closing disclosure document in a real estate transaction.
 * It contains information about the loan ID, closing date, and calculated closing costs.
 */
public class ClosingDisclosure {
    
    // Fields
    
    /** 
     * The unique identifier of the loan.
     */
    private String loanId;
    
    /** 
     * The date of the closing.
     */
    private LocalDate closingDate;
    
    /** 
     * The closing costs associated with the loan.
     */
    private double closingCosts;
    
    // Constructors
    
    /**
     * Constructs a new {@code ClosingDisclosure} object with specified loan ID and closing date.
     * The closing costs are calculated automatically based on a percentage of the loan amount.
     * 
     * @param loanId The unique identifier of the loan.
     * @param closingDate The date of the closing.
     */
    public ClosingDisclosure(String loanId, LocalDate closingDate) {
        this.loanId = loanId;
        this.closingDate = closingDate;
        calculateClosingCosts();
    }

    // Getters and Setters
    
    /**
     * Returns the loan ID.
     * 
     * @return The loan ID.
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * Sets the loan ID and recalculates the closing costs.
     * 
     * @param loanId The new loan ID.
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
        calculateClosingCosts();
    }

    /**
     * Returns the closing date.
     * 
     * @return The closing date.
     */
    public LocalDate getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the closing date.
     * 
     * @param closingDate The new closing date.
     */
    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    /**
     * Returns the closing costs associated with the loan.
     * 
     * @return The closing costs.
     */
    public double getClosingCosts() {
        return closingCosts;
    }

    // Helper methods
    
    /**
     * Calculates the closing costs based on a random percentage of the loan amount.
     * For demonstration purposes, a fixed loan amount of $200,000 is used.
     */
    private void calculateClosingCosts() {
        double percentage = Math.random() * (0.06 - 0.02) + 0.02; // Random percentage between 2% and 6%
        double loanAmount = 200000; // Fixed loan amount for demonstration purposes
        closingCosts = loanAmount * percentage;
    }
    
}
