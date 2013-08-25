package com.android.discount.models;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category extends Entity {

    private static final String NAME = "name";
    private static final String SUBCATEGORIES = "subcategories";

    public Category() {
        this(new HashMap<String, Object>());
    }

    public Category(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getName() {
        return (String) this.getAttributeValue(NAME);
    }

    public void setName(String name) {
        this.getAttributes().put(NAME, name);
    }

    public List<Category> getSubcategories() {
        return (List<Category>) this.getAttributeValue(SUBCATEGORIES);
    }

    public void setSubcategories(List<Category> subcategories) {
        this.getAttributes().put(SUBCATEGORIES, subcategories);
    }

}
