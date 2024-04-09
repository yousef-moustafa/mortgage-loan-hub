import java.util.*;

public class Debts {
    // Fields
    private double currentMortgage;
    private double liens;
    private double alimony;
    private double childSupport;
    private double carLoans;
    private double creditCards;
    private double realEstateTaxes;
    private double homeownerAssociationDues;
    private double hazardInsurance;

    // Constructor
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

    // Getters
    public double getCurrentMortgage() {
        return currentMortgage;
    }

    public double getLiens() {
        return liens;
    }

    public double getAlimony() {
        return alimony;
    }

    public double getChildSupport() {
        return childSupport;
    }

    public double getCarLoans() {
        return carLoans;
    }

    public double getCreditCards() {
        return creditCards;
    }

    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    public double getHomeownerAssociationDues() {
        return homeownerAssociationDues;
    }

    public double getHazardInsurance() {
        return hazardInsurance;
    }
    
    // Method to calculate total debts
    public double calculateTotalDebts() {
        return currentMortgage + liens + alimony + childSupport + carLoans +
               creditCards + realEstateTaxes + homeownerAssociationDues +
               hazardInsurance;
    }
    
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