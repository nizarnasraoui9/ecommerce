package com.platform.ecommerce.service;

import com.platform.ecommerce.customException.ProductNotFound;
import com.platform.ecommerce.modal.product;
import com.platform.ecommerce.repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    private final productRepo productRepo;

    @Autowired
    public ProductService(com.platform.ecommerce.repo.productRepo productRepo) {
        this.productRepo = productRepo;
    }

    public product addProduct(product p) {
        return productRepo.save(p);
    }

    public product updateProduct(product p) {
        return productRepo.save(p);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    public product findProduct(int id) {
        product p = null;
        try {
            p = productRepo.findById(id).orElseThrow(() -> new ProductNotFound());
        } catch (ProductNotFound productNotFound) {
            productNotFound.printStackTrace();
        }
        return p;
    }

    public List<product> getAllProducts() {
        return productRepo.findAll();
    }


}
