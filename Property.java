public class Property {
    private String streetAddress;
    private double expectedSalesPrice;
    private String homeType;
    private double size;
    private double realEstateTaxes;
    private double hoaDues;
    
    public Property(){
        
    }

    public Property(String streetAddress, double expectedSalesPrice, String homeType, double size, double realEstateTaxes, double hoaDues) {
        this.streetAddress = streetAddress;
        this.expectedSalesPrice = expectedSalesPrice;
        this.homeType = homeType;
        this.size = size;
        this.realEstateTaxes = realEstateTaxes;
        this.hoaDues = hoaDues;
    }

    // Getters and setters
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public double getExpectedSalesPrice() {
        return expectedSalesPrice;
    }

    public void setExpectedSalesPrice(double expectedSalesPrice) {
        this.expectedSalesPrice = expectedSalesPrice;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    public void setRealEstateTaxes(double realEstateTaxes) {
        this.realEstateTaxes = realEstateTaxes;
    }

    public double getHoaDues() {
        return hoaDues;
    }

    public void setHoaDues(double hoaDues) {
        this.hoaDues = hoaDues;
    }
}