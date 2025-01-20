package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProductService {
    
        public ArrayList<Product> getProductList(){
            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product("Banana", "Cargo", 100.0));
            products.add(new Product("Cream Cracker", "Unileaver", 300.0));
            products.add(new Product("Fresh Milk", "Sathosa", 300.0));
            return  products;
        }

}
