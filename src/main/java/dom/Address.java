package dom;

public class Address {

    private Integer id;

    private Integer employeeId;
    // private Employee employee;

    private String addressLine1;
    private String addressLine2;
    private String apartmentSuit;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    protected Address(){}

    public Address(String addressLine1Param, String addressLine2Param, String apartmentSuitParam, String zipCodeParam,
                   String cityParam, String stateParam, String countryParam) {
        this.addressLine1 = addressLine1Param;
        this.addressLine2 = addressLine2Param;
        this.apartmentSuit = apartmentSuitParam;
        this.zipCode = zipCodeParam;
        this.city = cityParam;
        this.state = stateParam;
        this.country = countryParam;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", apartmentSuit='" + apartmentSuit + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getApartmentSuit() {
        return apartmentSuit;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
