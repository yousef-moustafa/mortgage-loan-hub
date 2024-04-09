import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class CreditHistory {
    private int bankruptcies;
    private int collections;
    private int foreclosures;
    private int delinquencies;
    private boolean hasOutstandingJudgments;
    private LocalDate lastBankruptcyDate;
    private List<LocalDate> foreclosureDates;
    private boolean isPartyToLawsuit;

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

    // Helper methods for credit history evaluation
    public boolean hasOutstandingJudgments() {
        return hasOutstandingJudgments;
    }

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

    public boolean isPartyToLawsuit() {
        return isPartyToLawsuit;
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
