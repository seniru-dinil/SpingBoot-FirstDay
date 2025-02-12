package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.custom.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class ProductController {


    final ProductService productService;


    @GetMapping("products")
    public List<Product> getProductList() {
        return productService.getAll();
    }

    @GetMapping("/search-product")
    public void searchProduct(@RequestParam(value = "vendor")String vendor){
        log.info("user search this vendor-{}",vendor);
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        System.out.println(product);
    }
}
