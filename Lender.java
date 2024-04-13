/**
 * The {@code Lender} class represents a lender entity in a financial system.
 * It contains information about the lender's terms and conditions for lending.
 */
public class Lender {
    
    // Fields
    
    /** 
     * The unique identifier of the lender.
     */
    private int lenderNumber;
    
    /** 
     * The debt-to-income ratio required by the lender.
     */
    private double dtiRatio;
    
    /** 
     * The minimum down payment required by the lender.
     */
    private double downPaymentRequirement;
    
    /** 
     * The interest rate offered by the lender.
     */
    private double interestRate;
    
    /** 
     * The fees charged by the lender.
     */
    private double lenderFees;
    
    /** 
     * The closing costs associated with the loan from the lender.
     */
    private double closingCosts;
    
    // Constructors
    
    /**
     * Constructs a new {@code Lender} object with default values.
     */
    public Lender(){
        
    }

    /**
     * Constructs a new {@code Lender} object with specified parameters.
     * 
     * @param lenderNumber The unique identifier of the lender.
     * @param dtiRatio The debt-to-income ratio required by the lender.
     * @param downPaymentRequirement The minimum down payment required by the lender.
     * @param interestRate The interest rate offered by the lender.
     * @param lenderFees The fees charged by the lender.
     * @param closingCosts The closing costs associated with the loan from the lender.
     */
    public Lender(int lenderNumber, double dtiRatio, double downPaymentRequirement, 
                  double interestRate, double lenderFees, double closingCosts) {
        this.lenderNumber = lenderNumber;
        this.dtiRatio = dtiRatio;
        this.downPaymentRequirement = downPaymentRequirement;
        this.interestRate = interestRate;
        this.lenderFees = lenderFees;
        this.closingCosts = closingCosts;
    }

    // Getters and Setters
    
    /**
     * Returns the unique identifier of the lender.
     * 
     * @return The lender number.
     */
    public int getLenderNumber() {
        return lenderNumber;
    }

    /**
     * Sets the unique identifier of the lender.
     * 
     * @param lenderNumber The new lender number.
     */
    public void setLenderNumber(int lenderNumber) {
        this.lenderNumber = lenderNumber;
    }

    /**
     * Returns the debt-to-income ratio required by the lender.
     * 
     * @return The debt-to-income ratio.
     */
    public double getDtiRatio() {
        return dtiRatio;
    }

    /**
     * Sets the debt-to-income ratio required by the lender.
     * 
     * @param dtiRatio The new debt-to-income ratio.
     */
    public void setDtiRatio(double dtiRatio) {
        this.dtiRatio = dtiRatio;
    }

    /**
     * Returns the minimum down payment required by the lender.
     * 
     * @return The down payment requirement.
     */
    public double getDownPaymentRequirement() {
        return downPaymentRequirement;
    }

    /**
     * Sets the minimum down payment required by the lender.
     * 
     * @param downPaymentRequirement The new down payment requirement.
     */
    public void setDownPaymentRequirement(double downPaymentRequirement) {
        this.downPaymentRequirement = downPaymentRequirement;
    }

    /**
     * Returns the interest rate offered by the lender.
     * 
     * @return The interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the interest rate offered by the lender.
     * 
     * @param interestRate The new interest rate.
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Returns the fees charged by the lender.
     * 
     * @return The lender fees.
     */
    public double getLenderFees() {
        return lenderFees;
    }

    /**
     * Sets the fees charged by the lender.
     * 
     * @param lenderFees The new lender fees.
     */
    public void setLenderFees(double lenderFees) {
        this.lenderFees = lenderFees;
    }

    /**
     * Returns the closing costs associated with the loan from the lender.
     * 
     * @return The closing costs.
     */
    public double getClosingCosts() {
        return closingCosts;
    }

    /**
     * Sets the closing costs associated with the loan from the lender.
     * 
     * @param closingCosts The new closing costs.
     */
    public void setClosingCosts(double closingCosts) {
        this.closingCosts = closingCosts;
    }
}
