package com.repose.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 订单
 * 
 * @author 刘山禾 2018年08月03日 新建
 * @since JDK1.7
 */
public class Order implements Serializable {
    private String orderId;

    private BigDecimal value;

    private List<Item> items;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
