package com.android.discount.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends UserAbstract {

    private static final String NAME = "name";
    private static final String LAST_NAME = "lastName";
    private static final String CITY = "city";
    private static final String AGE = "age";
    private static final String TELEPHONE = "telephone";
    private static final String SUBSCRIPTION_EMAIL = "subscriptionEmail";
    private static final String SEX = "sex";


    public User() {
        this(new HashMap<String, Object>());
    }

    public User(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getName() {
        return (String) this.getAttributeValue(NAME);
    }

    public void setName(String name) {
        this.getAttributes().put(NAME, name);
    }

    public String getLastName() {
        return (String) this.getAttributeValue(LAST_NAME);
    }

    public void setLastName(String lastName) {
        this.getAttributes().put(LAST_NAME, lastName);
    }

    public String getCity() {
        return (String) this.getAttributeValue(CITY);
    }

    public void setCity(String city) {
        this.getAttributes().put(CITY, city);
    }

    public int getAge() {
        return (Integer) this.getAttributeValue(AGE);
    }

    public void setAge(int age) {
        this.getAttributes().put(AGE, age);
    }

    public String getTelephone() {
        return (String) this.getAttributeValue(TELEPHONE);
    }

    public void setTelephone(String telephone) {
        this.getAttributes().put(TELEPHONE, telephone);
    }

    public String getSubscriptionEmail() {
        return (String) this.getAttributeValue(SUBSCRIPTION_EMAIL);
    }

    public void setSubscriptionEmail(String subscriptionEmail) {
        this.getAttributes().put(SUBSCRIPTION_EMAIL, subscriptionEmail);
    }

    public String getSex() {
        return (String) this.getAttributeValue(SEX);
    }

    public void setSex(String sex) {
        this.getAttributes().put(SEX, sex);
    }

}
