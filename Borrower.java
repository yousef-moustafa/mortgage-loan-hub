public class Borrower {
    private String name;
    private String ssn;
    private String homePhone;
    private String dob;
    private Employment employment;
    private Income income;
    private Assets assets;
    private Debts debts;
    private CreditHistory creditHistory;
    
    public Borrower() {
    }

    public Borrower(String name, String ssn, String homePhone, String dob, Employment employment, Income income, Assets assets, Debts debts, CreditHistory creditHistory) {
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
}