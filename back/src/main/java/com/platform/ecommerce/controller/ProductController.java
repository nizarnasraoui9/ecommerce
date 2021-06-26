package com.platform.ecommerce.controller;

import com.platform.ecommerce.modal.product;
import com.platform.ecommerce.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:8080")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<product>> getAllProducts() {
        List<product> productList = productService.getAllProducts();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<product> findProduct(@PathVariable("id") int id) {
        product p = productService.findProduct(id);
        return new ResponseEntity<product>(p, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<product> addProduct(@RequestBody product p) {
        product pRes = productService.addProduct(p);
        return new ResponseEntity<>(pRes, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<product> updateProduct(@RequestBody product p) {
        product pRes = productService.addProduct(p);
        return new ResponseEntity<>(pRes, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
