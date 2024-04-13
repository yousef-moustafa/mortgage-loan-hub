/**
 * The LoanEstimate class represents an estimate of the terms and costs of a mortgage loan.
 * It includes details such as the applicant's name, loan amount, loan term, interest rate, and estimated monthly payments.
 */
public class LoanEstimate {
    private String applicantName; // Name of the loan applicant
    private double loanAmount; // Amount of the loan
    private int loanTerm; // Loan term in years
    private double interestRate; // Interest rate of the loan
    private double monthlyPrincipalAndInterest; // Monthly principal and interest payment
    private double mortgageInsurance; // Mortgage insurance payment
    private double estimatedEscrow; // Estimated escrow payment
    private double estimatedTotalMonthlyPayment; // Estimated total monthly payment

    /**
     * Constructs a new LoanEstimate with the specified loan details.
     * Calculates monthly principal and interest payment and total monthly payment.
     * @param applicantName The name of the loan applicant.
     * @param loanAmount The amount of the loan.
     * @param loanTerm The term of the loan in years.
     * @param interestRate The interest rate of the loan.
     * @param mortgageInsurance The mortgage insurance payment.
     * @param estimatedEscrow The estimated escrow payment.
     */
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

    /**
     * Calculates the monthly principal and interest payment using the loan amount, term, and interest rate.
     * @param loanAmount The amount of the loan.
     * @param loanTerm The term of the loan in years.
     * @param interestRate The interest rate of the loan.
     * @return The calculated monthly principal and interest payment.
     */
    private double calculateMonthlyPrincipalAndInterest(double loanAmount, int loanTerm, double interestRate) {
        double monthlyInterestRate = interestRate / 12.0;
        int numberOfPayments = loanTerm * 12;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        return monthlyPayment;
    }

    /**
     * Calculates the estimated total monthly payment by adding up monthly principal and interest, mortgage insurance, and escrow.
     * @return The estimated total monthly payment.
     */
    private double calculateEstimatedTotalMonthlyPayment() {
        return monthlyPrincipalAndInterest + mortgageInsurance + estimatedEscrow;
    }

    // Getters and setters

    /**
     * Retrieves the name of the loan applicant.
     * @return The name of the loan applicant.
     */
    public String getApplicantName() {
        return applicantName;
    }
    
    /**
     * Sets the name of the loan applicant.
     * @param applicantName The name of the loan applicant to set.
     */
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    
    /**
     * Retrieves the amount of the loan.
     * @return The amount of the loan.
     */
    public double getLoanAmount() {
        return loanAmount;
    }
    
    /**
     * Sets the amount of the loan and recalculates the monthly principal and interest payment.
     * @param loanAmount The amount of the loan to set.
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
        calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
    }
    
    /**
     * Retrieves the term of the loan in years.
     * @return The term of the loan in years.
     */
    public int getLoanTerm() {
        return loanTerm;
    }
    
    /**
     * Sets the term of the loan in years and recalculates the monthly principal and interest payment.
     * @param loanTerm The term of the loan in years to set.
     */
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
        calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
    }
    
    /**
     * Retrieves the interest rate of the loan.
     * @return The interest rate of the loan.
     */
    public double getInterestRate() {
        return interestRate;
    }
    
    /**
     * Sets the interest rate of the loan and recalculates the monthly principal and interest payment.
     * @param interestRate The interest rate of the loan to set.
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        calculateMonthlyPrincipalAndInterest(loanAmount, loanTerm, interestRate);
    }
    
    /**
     * Retrieves the monthly principal and interest payment.
     * @return The monthly principal and interest payment.
     */
    public double getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }
    
    /**
     * Retrieves the mortgage insurance payment.
     * @return The mortgage insurance payment.
     */
    public double getMortgageInsurance() {
        return mortgageInsurance;
    }
    
    /**
     * Sets the mortgage insurance payment and recalculates the estimated total monthly payment.
     * @param mortgageInsurance The mortgage insurance payment to set.
     */
    public void setMortgageInsurance(double mortgageInsurance) {
        this.mortgageInsurance = mortgageInsurance;
        calculateEstimatedTotalMonthlyPayment();
    }
    
    /**
     * Retrieves the estimated escrow payment.
     * @return The estimated escrow payment.
     */
    public double getEstimatedEscrow() {
        return estimatedEscrow;
    }
    
    /**
     * Sets the estimated escrow payment and recalculates the estimated total monthly payment.
     * @param estimatedEscrow The estimated escrow payment to set.
     */
    public void setEstimatedEscrow(double estimatedEscrow) {
        this.estimatedEscrow = estimatedEscrow;
        calculateEstimatedTotalMonthlyPayment();
    }
    
    /**
     * Retrieves the estimated total monthly payment, including principal, interest, mortgage insurance, and escrow.
     * @return The estimated total monthly payment.
     */
    public double getEstimatedTotalMonthlyPayment() {
        return estimatedTotalMonthlyPayment;
    }
}

