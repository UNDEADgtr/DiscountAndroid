package com.android.discount.services;


public class RestURL {

    public static final String TAG = RestURL.class.getSimpleName();

    private static final String BASE_URL = "http://192.168.1.3:8080";

    public static final String PRODUCTS_URL = BASE_URL + "/products";

    public static final String PRODUCTS_BY_ID_URL = PRODUCTS_URL + "/{id}";
}

