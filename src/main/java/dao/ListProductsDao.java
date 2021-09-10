package dao;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements ProductsInterface{
    private List<Product> productsList = new ArrayList();

    public ListProductsDao(){
        insert(new Product(1,"hammer", "To hammer nails"));
        insert(new Product(2,"screwdriver", "To screw screws"));
        insert(new Product(3,"drill", "For drilling holes"));
    }

    public List<Product> all(){
        return productsList;
    };

    public void insert(Product product){
        productsList.add(product);
    }

}