package com.android.discount.services;

import com.android.discount.models.Category;
import com.android.discount.models.Company;
import com.android.discount.models.Product;
import com.android.discount.models.User;

import java.util.List;

public interface IService {

    /**
     * **************************************
     * <p/>
     * Company's CRUD
     * <p/>
     * ***************************************
     */

    Company createCompany(Company company);

    List<Company> getCompanies();

    List<Company> getCompanies(String endID);

    List<Company> getCompanies(String startID, String endID);

    Company getCompany(String id);

    void updateCompany(Company company);

    void deleteCompany(String id);

    void deleteCompany(Company company);

    /**
     * **************************************
     * <p/>
     * User's CRUD
     * <p/>
     * ***************************************
     */

    User createUser(User user);

    List<User> getUsers();

    User getUser(String id);

    void updateUser(User user);

    void deleteUser(String id);

    void deleteUser(User user);

    /**
     * **************************************
     * <p/>
     * Product's CRUD
     * <p/>
     * ***************************************
     */

    Product createProduct(Product product);

    List<Product> getProducts();

    List<Product> getProducts(String endID);

    List<Product> getProducts(String startID, String endID);

    Product getProduct(String id);

    void updateProduct(Product product);

    void deleteProduct(String id);

    void deleteProduct(Product product);

    /**
     * **************************************
     * <p/>
     * Category's CRUD
     * <p/>
     * ***************************************
     */

    Category createCategory(Category category);

    List<Category> getCategory();

    Category getCategory(String id);

    void updateCategory(Category category);

    void deleteCategory(String id);

    void deleteCategory(Category category);
}
