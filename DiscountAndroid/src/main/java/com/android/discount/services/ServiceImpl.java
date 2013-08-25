package com.android.discount.services;

import com.android.discount.models.Category;
import com.android.discount.models.Company;
import com.android.discount.models.Product;
import com.android.discount.models.User;
import com.android.discount.models.containers.ProductContainer;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServiceImpl implements IService {

    /**
     * **************************************
     * <p/>
     * Company's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public Company createCompany(Company company) {
        return null;
    }

    @Override
    public List<Company> getCompanies() {
        return null;
    }

    @Override
    public List<Company> getCompanies(String endID) {
        return null;
    }

    @Override
    public List<Company> getCompanies(String startID, String endID) {
        return null;
    }

    @Override
    public Company getCompany(String id) {
        return null;
    }

    @Override
    public void updateCompany(Company company) {

    }

    @Override
    public void deleteCompany(String id) {

    }

    @Override
    public void deleteCompany(Company company) {

    }

    /**
     * **************************************
     * <p/>
     * User's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public void deleteUser(User user) {

    }

    /**
     * **************************************
     * <p/>
     * Product's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());

//        ResponseEntity<ProductContainer> responseEntity =
//                restTemplate.exchange(RestURL.PRODUCTS_URL, HttpMethod.GET, getRequestEntity(), ProductContainer.class);

        Product[] custList = restTemplate.getForObject(RestURL.PRODUCTS_URL, Product[].class);

        return new ArrayList<Product>(Arrays.asList(custList));
    }

    @Override
    public List<Product> getProducts(String endID) {
        return null;
    }

    @Override
    public List<Product> getProducts(String startID, String endID) {
        return null;
    }

    private HttpEntity<?> getRequestEntity() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
        return new HttpEntity<Object>(requestHeaders);
    }

    @Override
    public Product getProduct(String id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        return restTemplate.getForObject(RestURL.PRODUCTS_BY_ID_URL, Product.class, id);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(String id) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    /**
     * **************************************
     * <p/>
     * Category's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public Category createCategory(Category category) {
        return null;
    }

    @Override
    public List<Category> getCategory() {
        return null;
    }

    @Override
    public Category getCategory(String id) {
        return null;
    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void deleteCategory(String id) {

    }

    @Override
    public void deleteCategory(Category category) {

    }
}
