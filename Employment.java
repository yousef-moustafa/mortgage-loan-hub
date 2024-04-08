public class Employment {
    // Fields
    private String employerName;
    private String employerPhone;
    private String employerStreetAddress;
    private int lengthOfTime;
    private String positionTitle;
    private Income income;
    private double salary; // Includes base, overtime, bonuses, and commissions

    // Constructor
    public Employment(String employerName, String employerPhone, String employerStreetAddress,
                      int lengthOfTime, String positionTitle, Income income) {
        this.employerName = employerName;
        this.employerPhone = employerPhone;
        this.employerStreetAddress = employerStreetAddress;
        this.lengthOfTime = lengthOfTime;
        this.positionTitle = positionTitle;
        this.income = income;
        this.salary = calculateSalary();
    }

    // Getter methods
    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerPhone() {
        return employerPhone;
    }

    public String getEmployerStreetAddress() {
        return employerStreetAddress;
    }

    public int getLengthOfTime() {
        return lengthOfTime;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public Income getIncome() {
        return income;
    }
    
    public double getSalary() {
        return salary;
    }

    // Method to calculate salary based on part of the income
    private double calculateSalary() {
        return income.getBaseEmploymentIncome() + income.getOvertime() +
                income.getBonuses() + income.getCommissions();
    }
}