package com.android.discount.models;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

public class Entity implements java.io.Serializable {

    private static final String ID_KEY = "_id";
    private static final String DESC_KEY = "description";

    private Map<String, Object> attributes;

    public Entity() {
    }

    public Entity(Map<String, Object> attributes) {
        if (attributes == null) {
            throw new IllegalArgumentException("Null attributes");
        }
        this.attributes = new HashMap<String, Object>(attributes);
    }
    @JsonIgnore
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public Object getAttributeValue(String name) {
        return this.attributes.get(throwIfEmpty(name));
    }

    public void setAttributeValue(String name, Object value) {
        this.attributes.put(throwIfEmpty(name), value);
    }

    public String getId() {
        return (String) this.attributes.get(ID_KEY);
    }

    public void setId(String id) {
        this.attributes.put(ID_KEY, throwIfEmpty(id));
    }

    public String getDescription() {
        return (String)this.getAttributeValue(DESC_KEY);
    }

    public void setDescription(String description) {
        this.getAttributes().put(DESC_KEY, description);
    }

    public Map<String, Object> toMap() {
        return getAttributes();
    }

    protected String throwIfEmpty(String s) {
//        if (s == null || s.trim().length() == 0) {
//            throw new IllegalArgumentException();
//        }
//        return s.trim();
        return s;
    }
}
