package com.avenger.ecommerce.Repository;

import com.avenger.ecommerce.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepo extends JpaRepository<Seller,Integer> {
}
