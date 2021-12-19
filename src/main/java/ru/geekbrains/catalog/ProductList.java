package ru.geekbrains.catalog;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private final List<Product> productList = new ArrayList<Product>(10);

    public ProductList() {
        for (int i = 0; i < 10; i++) {
            productList.add(new Product(i, "Product #" + (i+1), 0.375 * i + 6.0 + 0.125 * i * i));
        }
    }

    public Product getById(int id){
        for (Product product: productList) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    public void add(Product product){
        productList.add(product);
    }

    public List<Product> selectAll(){
        return productList;
    }
}
