import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * The CreditHistory class represents the credit history of an individual or entity.
 * It includes information such as bankruptcies, collections, foreclosures, delinquencies,
 * outstanding judgments, dates of last bankruptcy, foreclosure dates, and party to lawsuit status.
 */
public class CreditHistory {
    private int bankruptcies; // Number of bankruptcies
    private int collections; // Number of collections
    private int foreclosures; // Number of foreclosures
    private int delinquencies; // Number of delinquencies
    private boolean hasOutstandingJudgments; // Indicates if there are outstanding judgments
    private LocalDate lastBankruptcyDate; // Date of the last bankruptcy
    private List<LocalDate> foreclosureDates; // Dates of foreclosures
    private boolean isPartyToLawsuit; // Indicates if the individual is party to a lawsuit

    /**
     * Constructs a CreditHistory object with the provided credit history details.
     * 
     * @param bankruptcies             Number of bankruptcies
     * @param collections              Number of collections
     * @param foreclosures             Number of foreclosures
     * @param delinquencies            Number of delinquencies
     * @param hasOutstandingJudgments  Indicates if there are outstanding judgments
     * @param lastBankruptcyDate       Date of the last bankruptcy
     * @param foreclosureDates         Dates of foreclosures
     * @param isPartyToLawsuit         Indicates if the individual is party to a lawsuit
     */
    public CreditHistory(int bankruptcies, int collections, int foreclosures, int delinquencies,
                         boolean hasOutstandingJudgments, LocalDate lastBankruptcyDate,
                         List<LocalDate> foreclosureDates, boolean isPartyToLawsuit) {
        this.bankruptcies = bankruptcies;
        this.collections = collections;
        this.foreclosures = foreclosures;
        this.delinquencies = delinquencies;
        this.hasOutstandingJudgments = hasOutstandingJudgments;
        this.lastBankruptcyDate = lastBankruptcyDate;
        this.foreclosureDates = foreclosureDates;
        this.isPartyToLawsuit = isPartyToLawsuit;
    }

    // Getters and setters
    public int getBankruptcies() {
        return bankruptcies;
    }

    public void setBankruptcies(int bankruptcies) {
        this.bankruptcies = bankruptcies;
    }

    public int getCollections() {
        return collections;
    }

    public void setCollections(int collections) {
        this.collections = collections;
    }

    public int getForeclosures() {
        return foreclosures;
    }

    public void setForeclosures(int foreclosures) {
        this.foreclosures = foreclosures;
    }

    public int getDelinquencies() {
        return delinquencies;
    }

    public void setDelinquencies(int delinquencies) {
        this.delinquencies = delinquencies;
    }

    public boolean hasOutstandingJudgments() {
        return hasOutstandingJudgments;
    }

    public LocalDate getLastBankruptcyDate() {
        return lastBankruptcyDate;
    }

    public void setLastBankruptcyDate(LocalDate lastBankruptcyDate) {
        this.lastBankruptcyDate = lastBankruptcyDate;
    }

    public List<LocalDate> getForeclosureDates() {
        return foreclosureDates;
    }

    public void setForeclosureDates(List<LocalDate> foreclosureDates) {
        this.foreclosureDates = foreclosureDates;
    }

    public boolean isPartyToLawsuit() {
        return isPartyToLawsuit;
    }

    public void setPartyToLawsuit(boolean partyToLawsuit) {
        isPartyToLawsuit = partyToLawsuit;
    }

    // Helper methods for credit history evaluation
    public boolean hasBankruptcyInLastSevenYears() {
        if (lastBankruptcyDate == null) {
            return false; // No bankruptcy history
        }

        LocalDate sevenYearsAgo = LocalDate.now().minus(7, ChronoUnit.YEARS);
        return lastBankruptcyDate.isAfter(sevenYearsAgo);
    }

    public boolean hasForeclosureInLastSevenYears() {
        if (foreclosureDates == null) {
            return false; // No foreclosure history
        }

        if (foreclosureDates.isEmpty()) {
            return false; // No foreclosure history
        }

        LocalDate sevenYearsAgo = LocalDate.now().minus(7, ChronoUnit.YEARS);
        return foreclosureDates.stream()
                .anyMatch(date -> date.isAfter(sevenYearsAgo));
    }

    public boolean hasLoanResultedInForeclosure() {
        return foreclosures > 0;
    }

    @Override
    public String toString() {
        return "CreditHistory{" +
                "bankruptcies=" + bankruptcies +
                ", collections=" + collections +
                ", foreclosures=" + foreclosures +
                ", delinquencies=" + delinquencies +
                ", hasOutstandingJudgments=" + hasOutstandingJudgments +
                ", lastBankruptcyDate=" + lastBankruptcyDate +
                ", foreclosureDates=" + foreclosureDates +
                ", isPartyToLawsuit=" + isPartyToLawsuit +
                '}';
    }
}
