package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Address {

    private String addressLine;

    private String city;

    private String country;

    private String state;

    public Address() {
    }

    @XmlElement(name = "AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @XmlElement(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "State")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
