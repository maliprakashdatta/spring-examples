package com.swsa.service;

import com.swsa.model.Address;

public class HelloService {

    private String name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void sayHello() {

        System.out.println("Hello " + name + " from "+ address.getCity().getName() +"!!!");
    }
}
