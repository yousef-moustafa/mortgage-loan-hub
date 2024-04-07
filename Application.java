public class Application {
    private int applicationNumber;
    private Borrower borrower;
    private Lender lender;
    private Property property;

    public Application(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        this.applicationNumber = applicationNumber;
        this.borrower = borrower;
        this.lender = lender;
        this.property = property;
    }

    public Assets getTotalAssets() {
        return borrower.getAssets();
    }

    public Debts getTotalLiabilities() {
        return borrower.getDebts();
    }

    // Getters and setters
    public int getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(int applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Lender getLender() {
        return lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
