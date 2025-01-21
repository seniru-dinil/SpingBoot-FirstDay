package edu.icet.ecom.service;


import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface ProductService {
    public ArrayList<Product> getProductList();
}
