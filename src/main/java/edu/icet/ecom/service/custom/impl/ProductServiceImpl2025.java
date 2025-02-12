package edu.icet.ecom.service.custom.impl;

import edu.icet.ecom.entity.ProductEntity;
import edu.icet.ecom.model.Product;
import edu.icet.ecom.repository.custom.ProductDao;
import edu.icet.ecom.service.custom.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Primary
@Service
@RequiredArgsConstructor
public class ProductServiceImpl2025 implements ProductService {

    final ProductDao productDao;

    public List<Product> getAll() {
        Iterable<ProductEntity> all = productDao.findAll();
        List<Product> products = new ArrayList<>();
        all.forEach(p->{
           products.add(new ModelMapper().map(p,Product.class));
        });
        return  products;
    }

    @Override
    public boolean addProduct(Product product) {
        ProductEntity map = new ModelMapper().map(product, ProductEntity.class);
        productDao.save(map);
        return false;
    }

    @Override
    public boolean deleteProduct(Long id) {
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }


}
