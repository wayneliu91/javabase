package com.repose.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品
 * 
 * @author 刘山禾 2018年09月08日 新建
 * @since JDK1.7
 */
public class Item implements Serializable {

    private String id;

    private String name;

    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
