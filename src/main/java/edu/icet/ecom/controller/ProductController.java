package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5500")
public class ProductController {

    @GetMapping("/get-product")
    ArrayList<Product> getProductList() {
        return new ProductService().getProductList();
    }

    
    @PostMapping("/saveData")
    String saveData(@RequestBody Product product){
        return "product recieved succesfullly";
    }
}
