package com.android.discount.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company extends Department {

    private static final String UNP = "unp";
    private static final String LICENSE = "license";
    private static final String LICENSE_PERIOD = "licensePeriod";
    private static final String DEPARTMENTS = "departments";
    private static final String PHOTO = "photo";
    private static final String STATUS = "status";
    private static final String SITE = "site";
    private static final String SKYPE = "skype";
    private static final String DIRECTOR_NAME = "directorName";

    public Company() {
        this(new HashMap<String, Object>());
    }

    public Company(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getUNP() {
        return (String) this.getAttributeValue(UNP);
    }

    public void setUNP(String unp) {
        this.getAttributes().put(UNP, unp);
    }

    public String getLicense() {
        return (String) this.getAttributeValue(LICENSE);
    }

    public void setLicense(String license) {
        this.getAttributes().put(LICENSE, license);
    }

    public String getLicensePeriod() {
        return (String) this.getAttributeValue(LICENSE_PERIOD);
    }

    public void setLicensePeriod(String licensePeriod) {
        this.getAttributes().put(LICENSE_PERIOD, licensePeriod);
    }

    public List<Department> getDepartments() {
        return (List<Department>) this.getAttributeValue(DEPARTMENTS);
    }

    public void setDepartments(List<Department> departments) {
        this.getAttributes().put(DEPARTMENTS, departments);
    }

    public String getPhoto() {
        return (String) this.getAttributeValue(PHOTO);
    }

    public void setPhoto(String photo) {
        this.getAttributes().put(PHOTO, photo);
    }

    public String getStatus() {
        return (String) this.getAttributeValue(STATUS);
    }

    public void setStatus(String gln) {
        this.getAttributes().put(STATUS, gln);
    }

    public String getSite() {
        return (String) this.getAttributeValue(SITE);
    }

    public void setSite(String site) {
        this.getAttributes().put(SITE, site);
    }

    public String getSkype() {
        return (String) this.getAttributeValue(SKYPE);
    }

    public void setSkype(String skype) {
        this.getAttributes().put(SKYPE, skype);
    }

    public String getDirectorName() {
        return (String) this.getAttributeValue(DIRECTOR_NAME);
    }

    public void setDirectorName(String directorName) {
        this.getAttributes().put(DIRECTOR_NAME, directorName);
    }

//    public boolean isActive() {
//        if (this.getAttributeValue(ACTIVE_KEY) == null) {
//            return false;
//        }
//        return (Boolean) this.getAttributeValue(ACTIVE_KEY);
//    }
//
//    public void setActive(boolean b) {
//        this.getAttributes().put(ACTIVE_KEY, b);
//    }

}
