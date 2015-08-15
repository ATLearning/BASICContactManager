package com.example.adan.contactmanager;

/**
 * Created by Adan on 14/08/2015.
 */
public class Contact {

    private String name,phone,email,address;

    public Contact(String name, String phone, String email, String address){

        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;

    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }
}
