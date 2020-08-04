package com.avenger.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    private int customer_id;
    private String Firstname;
    private String Lastname;
    private int Contact;
    private String email;
    private String Address;
    private String City;
    private String State;
    private String Country;
    private String password;
    private Date Registration_date;
    private Date LastUpdated_date;

    public Customer() {
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistration_date() {
        return Registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        Registration_date = registration_date;
    }

    public Date getLastUpdated_date() {
        return LastUpdated_date;
    }

    public void setLastUpdated_date(Date lastUpdated_date) {
        LastUpdated_date = lastUpdated_date;
    }
}
