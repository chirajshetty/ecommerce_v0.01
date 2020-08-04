package com.avenger.ecommerce.Repository;

import com.avenger.ecommerce.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders,Integer> {
}
