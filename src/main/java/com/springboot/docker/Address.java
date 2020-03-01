package com.springboot.docker;

/**
 * @Author administered
 * @Description
 * @Date 2020/2/29 22:08
 **/
public class Address {

    private String postcode;

    private String street;

    private String state;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
