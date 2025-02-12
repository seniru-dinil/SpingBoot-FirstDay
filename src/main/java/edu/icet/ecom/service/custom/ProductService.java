package edu.icet.ecom.service.custom;


import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface ProductService {
     List<Product> getAll();
     boolean addProduct(Product product);
     boolean deleteProduct(Long id);
     boolean updateProduct(Product product);
}
