package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class ProductController {


    final ProductService productService;


    @GetMapping("/get-product")
    public ArrayList<Product> getProductList() {
        return productService.getProductList();
    }

    @GetMapping("/search-product")
    public void searchProduct(@RequestParam(value = "vendor")String vendor){
        log.info("user search this vendor-{}",vendor);
    }

    @PostMapping("/add-product")
    public String addProduct(@RequestBody Product product) {
        return (product).toString()+" added succesfully";
    }
}
