public class Income {
    // Fields
    private double baseEmploymentIncome;
    private double overtime;
    private double bonuses;
    private double commissions;
    private double dividendsInterest;
    private double netRentalIncome;
    private double otherIncome;

    // Constructor
    public Income(double baseEmploymentIncome, double overtime, double bonuses,
                  double commissions, double dividendsInterest, double netRentalIncome,
                  double otherIncome) {
        this.baseEmploymentIncome = baseEmploymentIncome;
        this.overtime = overtime;
        this.bonuses = bonuses;
        this.commissions = commissions;
        this.dividendsInterest = dividendsInterest;
        this.netRentalIncome = netRentalIncome;
        this.otherIncome = otherIncome;
    }

    // Getters
    public double getBaseEmploymentIncome() {
        return baseEmploymentIncome;
    }

    public double getOvertime() {
        return overtime;
    }

    public double getBonuses() {
        return bonuses;
    }

    public double getCommissions() {
        return commissions;
    }

    public double getDividendsInterest() {
        return dividendsInterest;
    }

    public double getNetRentalIncome() {
        return netRentalIncome;
    }

    public double getOtherIncome() {
        return otherIncome;
    }

    // Method to calculate total income
    public double getTotalIncome() {
        return baseEmploymentIncome + overtime + bonuses + commissions +
               dividendsInterest + netRentalIncome + otherIncome;
    }
}