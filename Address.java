public class Address {
    private String street;
    private String city;
    private String state;
    private String postalcode;

    public Address(String street, String city, String state, String postalcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + postalcode;
    }
}
