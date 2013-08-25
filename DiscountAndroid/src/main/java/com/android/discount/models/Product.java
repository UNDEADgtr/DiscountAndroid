package com.android.discount.models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Product extends Entity {

    private static final String TITLE = "title";
    private static final String DISCOUNT = "discount";
    private static final String START_DATE = "startDate";
    private static final String FINISH_DATE = "finishDate";
    private static final String AMOUNT = "amount";
    private static final String PHOTO = "photo";
    private static final String CONDITIONS_GRANTING = "conditionsGranting";
    private static final String STATUS = "status";                          //moderation/active/expired
    private static final String SUBCATEGORY = "subcategory";
    private static final String CITY = "city";
    private static final String COMPANY = "company";

    public Product() {
        this(new HashMap<String, Object>());
    }

    public Product(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getTitle() {
        return (String) this.getAttributeValue(TITLE);
    }

    public void setTitle(String title) {
        this.getAttributes().put(TITLE, title);
    }

    public String getDiscount() {
        return (String) this.getAttributeValue(DISCOUNT);
    }

    public void setDiscount(String discount) {
        this.getAttributes().put(DISCOUNT, discount);
    }

    public Date getStartDate() {
        return (Date) this.getAttributeValue(START_DATE);
    }

    public void setStartDate(Date startDate) {
        this.getAttributes().put(START_DATE, startDate);
    }

    public Date getFinishDate() {
        return (Date) this.getAttributeValue(FINISH_DATE);
    }

    public void setFinishDate(Date finishDate) {
        this.getAttributes().put(FINISH_DATE, finishDate);
    }

    public int getAmount() {
        if (this.getAttributeValue(AMOUNT) == null) {
            return 0;
        }
        return (Integer) this.getAttributeValue(AMOUNT);
    }

    public void setAmount(int amount) {
        this.getAttributes().put(AMOUNT, amount);
    }

    public String getPhoto() {
        return (String) this.getAttributeValue(PHOTO);
    }

    public void setPhoto(String photo) {
        this.getAttributes().put(PHOTO, photo);
    }

    public String getConditionsGranting() {
        return (String) this.getAttributeValue(CONDITIONS_GRANTING);
    }

    public void setConditionsGranting(String conditionsGranting) {
        this.getAttributes().put(CONDITIONS_GRANTING, conditionsGranting);
    }

    public String getStatus() {
        return (String) this.getAttributeValue(STATUS);
    }

    public void setStatus(String status) {
        this.getAttributes().put(STATUS, status);
    }

    public String getSubcategoryID() {
        return (String) this.getAttributeValue(SUBCATEGORY);
    }

    public void setSubcategoryID(String subcategory) {
        this.getAttributes().put(SUBCATEGORY, subcategory);
    }

    public String getCity() {
        return (String) this.getAttributeValue(CITY);
    }

    public void setCity(String city) {
        this.getAttributes().put(CITY, city);
    }

    public String getCompanyID() {
        return (String) this.getAttributeValue(COMPANY);
    }

    public void setCompanyID(String company) {
        this.getAttributes().put(COMPANY, company);
    }

}
