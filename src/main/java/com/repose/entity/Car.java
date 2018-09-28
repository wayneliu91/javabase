package com.repose.entity;

/**
 * @author 刘山禾 2018年08月26日 新建
 * @since JDK1.7
 */
public class Car {
    private String brand;

    private String color;

    private Integer maxSpeed;

    public Car() {
    }

    public Car(String brand, String color, Integer maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", color='" + color + '\'' + ", maxSpeed=" + maxSpeed
                + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
