package com.workintech.library;

public class Address {

    private String streetBlockAddress;
    private String city;
    private String country;

    public Address(String streetBlockAddress, String city, String country) {
        this.streetBlockAddress = streetBlockAddress;
        this.city = city;
        this.country = country;
    }

    public String getStreetBlockAddress() {
        return streetBlockAddress;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetBlockAddress='" + streetBlockAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
