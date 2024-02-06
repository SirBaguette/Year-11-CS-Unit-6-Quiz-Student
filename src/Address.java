public class Address {

    String district;
    String street;
    int streetNumber;

    public Address(String a, String b, int i) {
        district = a;
        street = b;
        streetNumber = i;
    }

    public String getDistrict() {
        return district;
    }
    public String getStreet() {
        return street;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public void setDistrict(String a){
        district = a;
    }
    public void setStreet(String a) {
        street = a;
    }
    public void setStreetNumber(int i) {
        streetNumber = i;
    }

    @Override
    public String toString() {
        return streetNumber + " " + street + ", " + district;
    }
}


