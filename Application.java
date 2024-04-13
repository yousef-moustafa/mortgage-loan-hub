/**
 * The Application class represents a mortgage application submitted by a borrower to a lender for approval.
 * It contains information about the application, including borrower details, lender details, and property details.
 */
public class Application {
    private int applicationNumber; // Unique identifier for the application
    private Borrower borrower; // Borrower associated with the application
    private Lender lender; // Lender associated with the application
    private Property property; // Property associated with the application

    /**
     * Constructs a new Application with the specified details.
     * @param applicationNumber The application number.
     * @param borrower The borrower associated with the application.
     * @param lender The lender associated with the application.
     * @param property The property associated with the application.
     */
    public Application(int applicationNumber, Borrower borrower, Lender lender, Property property) {
        this.applicationNumber = applicationNumber;
        this.borrower = borrower;
        this.lender = lender;
        this.property = property;
    }

    /**
     * Retrieves the total assets of the borrower.
     * @return The Assets object representing the borrower's total assets.
     */
    public Assets getTotalAssets() {
        return borrower.getAssets();
    }

    /**
     * Retrieves the total liabilities of the borrower.
     * @return The Debts object representing the borrower's total liabilities.
     */
    public Debts getTotalLiabilities() {
        return borrower.getDebts();
    }

    /**
     * Retrieves the application number.
     * @return The application number.
     */
    public int getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the application number.
     * @param applicationNumber The application number to set.
     */
    public void setApplicationNumber(int applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /**
     * Retrieves the borrower associated with the application.
     * @return The Borrower object representing the borrower.
     */
    public Borrower getBorrower() {
        return borrower;
    }

    /**
     * Sets the borrower associated with the application.
     * @param borrower The Borrower object to set.
     */
    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    /**
     * Retrieves the lender associated with the application.
     * @return The Lender object representing the lender.
     */
    public Lender getLender() {
        return lender;
    }

    /**
     * Sets the lender associated with the application.
     * @param lender The Lender object to set.
     */
    public void setLender(Lender lender) {
        this.lender = lender;
    }

    /**
     * Retrieves the property associated with the application.
     * @return The Property object representing the property.
     */
    public Property getProperty() {
        return property;
    }

    /**
     * Sets the property associated with the application.
     * @param property The Property object to set.
     */
    public void setProperty(Property property) {
        this.property = property;
    }
}

