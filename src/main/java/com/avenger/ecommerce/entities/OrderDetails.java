package com.avenger.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetails {

    @Id
    private int Order_id;
    private int ProductId;
    private int Qty;

    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int order_id) {
        Order_id = order_id;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }
}
