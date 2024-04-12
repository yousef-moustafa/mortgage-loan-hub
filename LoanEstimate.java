public class LoanEstimate {
    private String applicantName;
    private double loanAmount;
    private int loanTerm; // in years
    private double interestRate;
    private double monthlyPrincipalAndInterest;
    private double mortgageInsurance;
    private double estimatedEscrow;
    private double estimatedTotalMonthlyPayment;

    public LoanEstimate(String applicantName, double loanAmount, int loanTerm, double interestRate, double mortgageInsurance, double estimatedEscrow) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interestRate = interestRate;
        this.mortgageInsurance = mortgageInsurance;
        this.estimatedEscrow = estimatedEscrow;
        this.monthlyPrincipalAndInterest = calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
        this.estimatedTotalMonthlyPayment = calculateEstimatedTotalMonthlyPayment();
    }

    private double calculateMonthlyPrincipalAndInterest(double loanAmount, int loanTerm, double interestRate) {
        double monthlyInterestRate = interestRate / 12.0;
        int numberOfPayments = loanTerm * 12;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        return monthlyPayment;
    }

    private double calculateEstimatedTotalMonthlyPayment() {
        return monthlyPrincipalAndInterest + mortgageInsurance + estimatedEscrow;
    }

    // Getters and setters
    public String getApplicantName() {
        return applicantName;
    }
    
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
    
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
        calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
    }

    public int getLoanTerm() {
        return loanTerm;
    }
    
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
        calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
    }

    public double getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    public double getMortgageInsurance() {
        return mortgageInsurance;
    }
    
    public void setMortgageInsurance(double mortgageInsurance) {
        this.mortgageInsurance = mortgageInsurance;
        calculateEstimatedTotalMonthlyPayment();
    }

    public double getEstimatedEscrow() {
        return estimatedEscrow;
    }
    
    public void setEstimatedEscrow(double estimatedEscrow) {
        this.estimatedEscrow = estimatedEscrow;
        calculateEstimatedTotalMonthlyPayment();
    }

    public double getEstimatedTotalMonthlyPayment() {
        return estimatedTotalMonthlyPayment;
    }
}