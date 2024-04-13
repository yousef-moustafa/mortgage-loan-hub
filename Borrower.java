/**
 * The Borrower class represents an individual applying for a loan.
 * It includes personal information such as name, social security number (SSN),
 * home phone number, date of birth (DOB), employment details, income details,
 * asset details, debt details, and credit history.
 */
public class Borrower {
    private String name; // Name of the borrower
    private String ssn; // Social security number of the borrower
    private String homePhone; // Home phone number of the borrower
    private String dob; // Date of birth of the borrower
    private Employment employment; // Employment details of the borrower
    private Income income; // Income details of the borrower
    private Assets assets; // Asset details of the borrower
    private Debts debts; // Debt details of the borrower
    private CreditHistory creditHistory; // Credit history of the borrower
    
    /**
     * Constructs a Borrower object with default values.
     */
    public Borrower() {
    }

    /**
     * Constructs a Borrower object with the provided details.
     * 
     * @param name          Name of the borrower
     * @param ssn           Social security number of the borrower
     * @param homePhone     Home phone number of the borrower
     * @param dob           Date of birth of the borrower
     * @param employment    Employment details of the borrower
     * @param income        Income details of the borrower
     * @param assets        Asset details of the borrower
     * @param debts         Debt details of the borrower
     * @param creditHistory Credit history of the borrower
     */
    public Borrower(String name, String ssn, String homePhone, String dob, Employment employment,
                    Income income, Assets assets, Debts debts, CreditHistory creditHistory) {
        this.name = name;
        this.ssn = ssn;
        this.homePhone = homePhone;
        this.dob = dob;
        this.employment = employment;
        this.income = income;
        this.assets = assets;
        this.debts = debts;
        this.creditHistory = creditHistory;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Assets getAssets() {
        return assets;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    public Debts getDebts() {
        return debts;
    }

    public void setDebts(Debts debts) {
        this.debts = debts;
    }

    public CreditHistory getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(CreditHistory creditHistory) {
        this.creditHistory = creditHistory;
    }
    
    /**
     * Returns a string representation of the Borrower object.
     * 
     * @return String representation of the Borrower object
     */
    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", dob='" + dob + '\'' +
                ", employment=" + employment +
                ", income=" + income +
                ", assets=" + assets +
                ", debts=" + debts +
                ", creditHistory=" + creditHistory +
                '}';
    }
}
