package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/get-product")
    ArrayList<Product> getProductList() {
        ArrayList<Product> productList = productService.getProductList();
        return productList;
    }

    
    @PostMapping("/add-product")
    String addProduct(@RequestBody Product product){
        return (product).toString();
    }
}
