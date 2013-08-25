package com.android.discount.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department extends UserAbstract {

    private static final String CITY = "city";
    private static final String ADDRESS = "address";
    private static final String SCHEDULE_WORK = "scheduleWork";
    private static final String TELEPHONES = "telephones";

    public Department() {
        this(new HashMap<String, Object>());
    }

    public Department(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getCity() {
        return (String) this.getAttributeValue(CITY);
    }

    public void setCity(String city) {
        this.getAttributes().put(CITY, city);
    }

    public String getAddress() {
        return (String) this.getAttributeValue(ADDRESS);
    }

    public void setAddress(String address) {
        this.getAttributes().put(ADDRESS, address);
    }

    public String getScheduleWork() {
        return (String) this.getAttributeValue(SCHEDULE_WORK);
    }

    public void setScheduleWork(String scheduleWork) {
        this.getAttributes().put(SCHEDULE_WORK, scheduleWork);
    }

    public List<String> getTelephones() {
        return (List<String>) this.getAttributeValue(TELEPHONES);
    }

    public void setTelephones(List<String> telephones) {
        this.getAttributes().put(TELEPHONES, telephones);
    }

}
