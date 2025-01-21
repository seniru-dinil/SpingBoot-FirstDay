package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {


    final ProductService productService;


    @GetMapping("/get-product")
    public ArrayList<Product> getProductList() {
        ArrayList<Product> productList = productService.getProductList();
        return productList;
    }


    @PostMapping("/add-product")
    public String addProduct(@RequestBody Product product) {
        return (product).toString();
    }
}
