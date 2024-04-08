public class Lender {
    private int lenderNumber;
    private double dtiRatio;
    private double downPaymentRequirement;
    private double interestRate;
    private double lenderFees;
    private double closingCosts;
    
    public Lender(){
        
    }

    public Lender(int lenderNumber, double dtiRatio, double downPaymentRequirement, double interestRate, double lenderFees, double closingCosts) {
        this.lenderNumber = lenderNumber;
        this.dtiRatio = dtiRatio;
        this.downPaymentRequirement = downPaymentRequirement;
        this.interestRate = interestRate;
        this.lenderFees = lenderFees;
        this.closingCosts = closingCosts;
    }

    // Getters and setters
    public int getLenderNumber() {
        return lenderNumber;
    }

    public void setLenderNumber(int lenderNumber) {
        this.lenderNumber = lenderNumber;
    }

    public double getDtiRatio() {
        return dtiRatio;
    }

    public void setDtiRatio(double dtiRatio) {
        this.dtiRatio = dtiRatio;
    }

    public double getDownPaymentRequirement() {
        return downPaymentRequirement;
    }

    public void setDownPaymentRequirement(double downPaymentRequirement) {
        this.downPaymentRequirement = downPaymentRequirement;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLenderFees() {
        return lenderFees;
    }

    public void setLenderFees(double lenderFees) {
        this.lenderFees = lenderFees;
    }

    public double getClosingCosts() {
        return closingCosts;
    }

    public void setClosingCosts(double closingCosts) {
        this.closingCosts = closingCosts;
    }
}
