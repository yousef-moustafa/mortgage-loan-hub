public class LoanEstimate {
    private String applicantName;
    private double loanAmount;
    private int loanTerm;
    private double interestRate;
    private double monthlyPrincipalAndInterest;
    private double mortgageInsurance;
    private double estimatedEscrow;
    private double estimatedTotalMonthlyPayment;

    public LoanEstimate(String applicantName, double loanAmount, int loanTerm, double interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interestRate = interestRate;
        calculateMonthlyPrincipalAndInterest();
    }

    public void calculateEstimatedTotalMonthlyPayment() {
        estimatedTotalMonthlyPayment = monthlyPrincipalAndInterest + mortgageInsurance + estimatedEscrow;
    }

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
        calculateMonthlyPrincipalAndInterest();
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
        calculateMonthlyPrincipalAndInterest();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        calculateMonthlyPrincipalAndInterest();
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
    
    private void calculateMonthlyPrincipalAndInterest() {
        int months = loanTerm * 12;
        double monthlyInterestRate = interestRate / 100 / 12;
        monthlyPrincipalAndInterest = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -months));
    }
    
}
