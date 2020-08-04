package com.avenger.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {

    @Id
    private int SellerId;
    private String SellerName;
    private String Address;
    private String Contact;

    public int getSellerId() {
        return SellerId;
    }

    public void setSellerId(int sellerId) {
        SellerId = sellerId;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
