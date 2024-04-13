/**
 * The {@code Property} class represents a property in a real estate system.
 * It contains information about the property's address, type, size, taxes, and HOA dues.
 */
public class Property {
    
    // Fields
    
    /** 
     * The street address of the property.
     */
    private String streetAddress;
    
    /** 
     * The expected sales price of the property.
     */
    private double expectedSalesPrice;
    
    /** 
     * The type of home (e.g., single-family, condominium) of the property.
     */
    private String homeType;
    
    /** 
     * The size of the property in square feet.
     */
    private double size;
    
    /** 
     * The real estate taxes associated with the property.
     */
    private double realEstateTaxes;
    
    /** 
     * The homeowner association (HOA) dues associated with the property.
     */
    private double hoaDues;
    
    // Constructors
    
    /**
     * Constructs a new {@code Property} object with default values.
     */
    public Property(){
        
    }

    /**
     * Constructs a new {@code Property} object with specified parameters.
     * 
     * @param streetAddress The street address of the property.
     * @param expectedSalesPrice The expected sales price of the property.
     * @param homeType The type of home of the property.
     * @param size The size of the property in square feet.
     * @param realEstateTaxes The real estate taxes associated with the property.
     * @param hoaDues The homeowner association dues associated with the property.
     */
    public Property(String streetAddress, double expectedSalesPrice, String homeType, 
                    double size, double realEstateTaxes, double hoaDues) {
        this.streetAddress = streetAddress;
        this.expectedSalesPrice = expectedSalesPrice;
        this.homeType = homeType;
        this.size = size;
        this.realEstateTaxes = realEstateTaxes;
        this.hoaDues = hoaDues;
    }

    // Getters and Setters
    
    /**
     * Returns the street address of the property.
     * 
     * @return The street address.
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the street address of the property.
     * 
     * @param streetAddress The new street address.
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * Returns the expected sales price of the property.
     * 
     * @return The expected sales price.
     */
    public double getExpectedSalesPrice() {
        return expectedSalesPrice;
    }

    /**
     * Sets the expected sales price of the property.
     * 
     * @param expectedSalesPrice The new expected sales price.
     */
    public void setExpectedSalesPrice(double expectedSalesPrice) {
        this.expectedSalesPrice = expectedSalesPrice;
    }

    /**
     * Returns the type of home of the property.
     * 
     * @return The home type.
     */
    public String getHomeType() {
        return homeType;
    }

    /**
     * Sets the type of home of the property.
     * 
     * @param homeType The new home type.
     */
    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    /**
     * Returns the size of the property in square feet.
     * 
     * @return The property size.
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the property in square feet.
     * 
     * @param size The new property size.
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Returns the real estate taxes associated with the property.
     * 
     * @return The real estate taxes.
     */
    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    /**
     * Sets the real estate taxes associated with the property.
     * 
     * @param realEstateTaxes The new real estate taxes.
     */
    public void setRealEstateTaxes(double realEstateTaxes) {
        this.realEstateTaxes = realEstateTaxes;
    }

    /**
     * Returns the homeowner association (HOA) dues associated with the property.
     * 
     * @return The HOA dues.
     */
    public double getHoaDues() {
        return hoaDues;
    }

    /**
     * Sets the homeowner association (HOA) dues associated with the property.
     * 
     * @param hoaDues The new HOA dues.
     */
    public void setHoaDues(double hoaDues) {
        this.hoaDues = hoaDues;
    }
    
    /**
     * Returns a string representation of the {@code Property} object.
     * 
     * @return A string representation including all property details.
     */
    @Override
    public String toString() {
        return "Property{" +
                "streetAddress='" + streetAddress + '\'' +
                ", expectedSalesPrice=" + expectedSalesPrice +
                ", homeType='" + homeType + '\'' +
                ", size=" + size +
                ", realEstateTaxes=" + realEstateTaxes +
                ", hoaDues=" + hoaDues +
                '}';
    }
}
