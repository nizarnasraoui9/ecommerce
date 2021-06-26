package com.platform.ecommerce.customException;

public class ProductNotFound extends Exception{
    public ProductNotFound() {
        super("product not found");
    }
}
