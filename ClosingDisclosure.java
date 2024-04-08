import java.time.LocalDate;

public class ClosingDisclosure {
    private String loanId;
    private LocalDate closingDate;
    private double closingCosts;
    
    public ClosingDisclosure(String loanId, LocalDate closingDate) {
        this.loanId = loanId;
        this.closingDate = closingDate;
        calculateClosingCosts();
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
        calculateClosingCosts();
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    public double getClosingCosts() {
        return closingCosts;
    }

    private void calculateClosingCosts() {
        double percentage = Math.random() * (0.06 - 0.02) + 0.02;
        double loanAmount = 200000;
        closingCosts = loanAmount * percentage;
    }
    
}
