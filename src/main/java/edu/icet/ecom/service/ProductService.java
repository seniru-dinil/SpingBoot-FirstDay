package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;

import java.util.ArrayList;

public class ProductService {
    
        public ArrayList<Product> getProductList(){
            Product product = new Product("Banana", "Cargo", 100.0);
            Product product1 = new Product("Cream Cracker", "Unileaver", 300.0);
            Product product2 = new Product("Fresh Milk", "Sathosa", 300.0);

            ArrayList<Product> products = new ArrayList<>();
            products.add(product);
            products.add(product1);
            products.add(product2);
            return  products;
        }

}
