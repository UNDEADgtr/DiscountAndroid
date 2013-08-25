package com.android.discount.services;

import com.android.discount.models.Category;
import com.android.discount.models.Company;
import com.android.discount.models.Product;
import com.android.discount.models.User;

import java.util.ArrayList;
import java.util.List;

public class ServiceMock implements IService {

    List<Product> products;

    public ServiceMock() {
        this.products = new ArrayList<Product>();
        Product product = new Product();
        product.setTitle("Photo");
        product.setDescription("Good photo");
        product.setDiscount("50");
        product.setCity("Minsk");
        products.add(product);
    }

    @Override
    public Company createCompany(Company company) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Company> getCompanies() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Company> getCompanies(String endID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Company> getCompanies(String startID, String endID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Company getCompany(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateCompany(Company company) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteCompany(String id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteCompany(Company company) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User createUser(User user) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> getUsers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User getUser(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteUser(String id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Product createProduct(Product product) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public List<Product> getProducts(String endID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Product> getProducts(String startID, String endID) {

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Product getProduct(String id) {
        return products.get(0);
    }

    @Override
    public void updateProduct(Product product) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteProduct(String id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteProduct(Product product) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Category createCategory(Category category) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Category> getCategory() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Category getCategory(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateCategory(Category category) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteCategory(String id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteCategory(Category category) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
