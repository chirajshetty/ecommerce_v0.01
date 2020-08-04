package com.avenger.ecommerce.Repository;

import com.avenger.ecommerce.entities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails,Integer> {

}
