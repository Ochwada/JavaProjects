package com.example.model;


/**
 * *******************************************************
 * Package: com.example.model
 * File: Address.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 3:37 PM
 * Description: POJO for addresses-Represents a physical address, consisting of street, house number, postal code, city, and country.
 * * This class can be embedded into other entities such as {@code Event}, {@code User}, or {@code Company}
 * *  to model physical locations in a clean, object-oriented way.
 * Objective:
 * *******************************************************
 */


public class Address {

    private final String street;
    private final String houseNumber;
    private final String postalCode;
    private final String city;
    private final String country;

    /**
     * Constructs a new {@code Address} instance with the provided details.
     *
     * @param street      the street name (e.g., "Hauptstr.")
     * @param houseNumber the house number (e.g., "11")
     * @param postalCode  the postal code or ZIP code (e.g., "10115")
     * @param city        the city name (e.g., "Berlin")
     * @param country     the country name (e.g., "Germany")
     */
    public Address(String street, String houseNumber, String postalCode, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    /**
     * Returns a formatted string representation of the full address.
     *
     * @return formatted address string
     */
    @Override
    public String toString() {
        return street + " " + houseNumber + ", " + postalCode + " " + city + ", " + country;
    }
}
