package com.platform.ecommerce.repo;

import com.platform.ecommerce.modal.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<product, Integer> {
}
