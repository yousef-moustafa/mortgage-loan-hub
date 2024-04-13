/**
 * The Income class represents various sources of income for an individual or entity.
 * It includes base employment income, overtime pay, bonuses, commissions, dividends/interest,
 * net rental income, and other sources of income.
 */
public class Income {
    // Fields
    private double baseEmploymentIncome; // Base employment income
    private double overtime; // Overtime pay
    private double bonuses; // Bonuses
    private double commissions; // Commissions
    private double dividendsInterest; // Dividends/Interest income
    private double netRentalIncome; // Net rental income
    private double otherIncome; // Other sources of income

    /**
     * Constructs an Income object with the provided income details.
     * 
     * @param baseEmploymentIncome  Base employment income
     * @param overtime              Overtime pay
     * @param bonuses               Bonuses
     * @param commissions           Commissions
     * @param dividendsInterest     Dividends/Interest income
     * @param netRentalIncome      Net rental income
     * @param otherIncome           Other sources of income
     */
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

    /**
     * Retrieves the base employment income.
     * 
     * @return Base employment income
     */
    public double getBaseEmploymentIncome() {
        return baseEmploymentIncome;
    }

    /**
     * Retrieves the overtime pay.
     * 
     * @return Overtime pay
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * Retrieves the bonuses.
     * 
     * @return Bonuses
     */
    public double getBonuses() {
        return bonuses;
    }

    /**
     * Retrieves the commissions.
     * 
     * @return Commissions
     */
    public double getCommissions() {
        return commissions;
    }

    /**
     * Retrieves the dividends/interest income.
     * 
     * @return Dividends/Interest income
     */
    public double getDividendsInterest() {
        return dividendsInterest;
    }

    /**
     * Retrieves the net rental income.
     * 
     * @return Net rental income
     */
    public double getNetRentalIncome() {
        return netRentalIncome;
    }

    /**
     * Retrieves other sources of income.
     * 
     * @return Other sources of income
     */
    public double getOtherIncome() {
        return otherIncome;
    }

    /**
     * Calculates the total income by summing up all income sources.
     * 
     * @return Total income
     */
    public double getTotalIncome() {
        return baseEmploymentIncome + overtime + bonuses + commissions +
               dividendsInterest + netRentalIncome + otherIncome;
    }
    
    /**
     * Returns a string representation of the Income object.
     * 
     * @return String representation of the Income object
     */
    @Override
    public String toString() {
        return "Income{" +
                "baseEmploymentIncome=" + baseEmploymentIncome +
                ", overtime=" + overtime +
                ", bonuses=" + bonuses +
                ", commissions=" + commissions +
                ", dividendsInterest=" + dividendsInterest +
                ", netRentalIncome=" + netRentalIncome +
                ", otherIncome=" + otherIncome +
                '}';
    }
}
