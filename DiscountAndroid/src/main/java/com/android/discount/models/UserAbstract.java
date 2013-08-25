package com.android.discount.models;

import java.util.HashMap;
import java.util.Map;

public abstract class UserAbstract extends Entity {

    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";

    public UserAbstract() {
        this(new HashMap<String, Object>());
    }

    public UserAbstract(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getEmail() {
        return (String) this.getAttributeValue(EMAIL);
    }

    public void setEmail(String email) {
        this.getAttributes().put(EMAIL, email);
    }

    public String getPassword() {
        return (String) this.getAttributeValue(PASSWORD);
    }

    public void setPassword(String password) {
        this.getAttributes().put(PASSWORD, password);
    }
}
