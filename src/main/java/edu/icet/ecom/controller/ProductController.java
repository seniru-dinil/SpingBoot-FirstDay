package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ProductController {
    @CrossOrigin(origins = "http://localhost:5500")
    @GetMapping("/get-product-list")
    ArrayList<Product> getProductList() {
        ProductService productService = new ProductService();
        return productService.getProductList();
    }
}
