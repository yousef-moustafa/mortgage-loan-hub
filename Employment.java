/**
 * The Employment class represents employment information of an individual.
 * It includes details such as employer name, employer phone number, employer street address,
 * length of employment, position title, income details, and calculated salary.
 */
public class Employment {
    // Fields
    private String employerName; // Name of the employer
    private String employerPhone; // Phone number of the employer
    private String employerStreetAddress; // Street address of the employer
    private int lengthOfTime; // Length of employment in years
    private String positionTitle; // Title of the position
    private Income income; // Income details
    private double salary; // Calculated salary, including base, overtime, bonuses, and commissions

    /**
     * Constructs an Employment object with the provided employment details.
     * 
     * @param employerName            Name of the employer
     * @param employerPhone           Phone number of the employer
     * @param employerStreetAddress   Street address of the employer
     * @param lengthOfTime            Length of employment in years
     * @param positionTitle           Title of the position
     * @param income                  Income details
     */
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

    /**
     * Retrieves the name of the employer.
     * 
     * @return Name of the employer
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Retrieves the phone number of the employer.
     * 
     * @return Phone number of the employer
     */
    public String getEmployerPhone() {
        return employerPhone;
    }

    /**
     * Retrieves the street address of the employer.
     * 
     * @return Street address of the employer
     */
    public String getEmployerStreetAddress() {
        return employerStreetAddress;
    }

    /**
     * Retrieves the length of employment in years.
     * 
     * @return Length of employment in years
     */
    public int getLengthOfTime() {
        return lengthOfTime;
    }

    /**
     * Retrieves the position title.
     * 
     * @return Position title
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * Retrieves the income details.
     * 
     * @return Income details
     */
    public Income getIncome() {
        return income;
    }
    
    /**
     * Retrieves the calculated salary.
     * 
     * @return Calculated salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Calculates the salary based on the part of the income.
     * 
     * @return Calculated salary
     */
    private double calculateSalary() {
        return income.getBaseEmploymentIncome() + income.getOvertime() +
                income.getBonuses() + income.getCommissions();
    }
    
    /**
     * Returns a string representation of the Employment object.
     * 
     * @return String representation of the Employment object
     */
    @Override
    public String toString() {
        return "Employment{" +
                "employerName='" + employerName + '\'' +
                ", employerPhone='" + employerPhone + '\'' +
                ", employerStreetAddress='" + employerStreetAddress + '\'' +
                ", lengthOfTime=" + lengthOfTime +
                ", positionTitle='" + positionTitle + '\'' +
                ", income=" + income +
                '}';
    }
}
