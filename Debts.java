import java.util.*;

/**
 * The Debts class represents various financial debts owed by an individual or entity.
 * It includes current mortgage, liens, alimony, child support, car loans, credit card debt,
 * real estate taxes, homeowner association dues, and hazard insurance.
 */
public class Debts {
    // Fields
    private double currentMortgage; // Current mortgage amount
    private double liens; // Liens amount
    private double alimony; // Alimony amount
    private double childSupport; // Child support amount
    private double carLoans; // Car loans amount
    private double creditCards; // Credit card debt amount
    private double realEstateTaxes; // Real estate taxes amount
    private double homeownerAssociationDues; // Homeowner association dues amount
    private double hazardInsurance; // Hazard insurance amount

    /**
     * Constructs a Debts object with the provided debt details.
     * 
     * @param currentMortgage             Current mortgage amount
     * @param liens                       Liens amount
     * @param alimony                     Alimony amount
     * @param childSupport                Child support amount
     * @param carLoans                    Car loans amount
     * @param creditCards                 Credit card debt amount
     * @param realEstateTaxes             Real estate taxes amount
     * @param homeownerAssociationDues    Homeowner association dues amount
     * @param hazardInsurance             Hazard insurance amount
     */
    public Debts(double currentMortgage, double liens, double alimony,
                 double childSupport, double carLoans, double creditCards,
                 double realEstateTaxes, double homeownerAssociationDues,
                 double hazardInsurance) {
        this.currentMortgage = currentMortgage;
        this.liens = liens;
        this.alimony = alimony;
        this.childSupport = childSupport;
        this.carLoans = carLoans;
        this.creditCards = creditCards;
        this.realEstateTaxes = realEstateTaxes;
        this.homeownerAssociationDues = homeownerAssociationDues;
        this.hazardInsurance = hazardInsurance;
    }

    /**
     * Retrieves the current mortgage amount.
     * 
     * @return Current mortgage amount
     */
    public double getCurrentMortgage() {
        return currentMortgage;
    }

    /**
     * Retrieves the liens amount.
     * 
     * @return Liens amount
     */
    public double getLiens() {
        return liens;
    }

    /**
     * Retrieves the alimony amount.
     * 
     * @return Alimony amount
     */
    public double getAlimony() {
        return alimony;
    }

    /**
     * Retrieves the child support amount.
     * 
     * @return Child support amount
     */
    public double getChildSupport() {
        return childSupport;
    }

    /**
     * Retrieves the car loans amount.
     * 
     * @return Car loans amount
     */
    public double getCarLoans() {
        return carLoans;
    }

    /**
     * Retrieves the credit card debt amount.
     * 
     * @return Credit card debt amount
     */
    public double getCreditCards() {
        return creditCards;
    }

    /**
     * Retrieves the real estate taxes amount.
     * 
     * @return Real estate taxes amount
     */
    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    /**
     * Retrieves the homeowner association dues amount.
     * 
     * @return Homeowner association dues amount
     */
    public double getHomeownerAssociationDues() {
        return homeownerAssociationDues;
    }

    /**
     * Retrieves the hazard insurance amount.
     * 
     * @return Hazard insurance amount
     */
    public double getHazardInsurance() {
        return hazardInsurance;
    }
    
    /**
     * Calculates the total amount of debts by summing up all debt amounts.
     * 
     * @return Total amount of debts
     */
    public double calculateTotalDebts() {
        return currentMortgage + liens + alimony + childSupport + carLoans +
               creditCards + realEstateTaxes + homeownerAssociationDues +
               hazardInsurance;
    }
    
    /**
     * Returns a string representation of the Debts object.
     * 
     * @return String representation of the Debts object
     */
    @Override
    public String toString() {
        return "Debts{" +
                "currentMortgage=" + currentMortgage +
                ", liens=" + liens +
                ", alimony=" + alimony +
                ", childSupport=" + childSupport +
                ", carLoans=" + carLoans +
                ", creditCards=" + creditCards +
                ", realEstateTaxes=" + realEstateTaxes +
                ", homeownerAssociationDues=" + homeownerAssociationDues +
                ", hazardInsurance=" + hazardInsurance +
                '}';
    }
}
