package FlamyMap.com.pwflamy.tasks.optional;

import java.util.Optional;

public class Address {

    private String city;
    private Optional<String> postalCode;

    public Address(String city, Optional<String> postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public Optional<String> getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Optional<String> postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
