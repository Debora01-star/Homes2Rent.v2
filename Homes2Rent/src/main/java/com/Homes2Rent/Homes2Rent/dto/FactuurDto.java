package com.Homes2Rent.Homes2Rent.dto;


public class FactuurDto {

    public Long id;

    public String boeking;

    public Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoeking() {
        return boeking;
    }

    public void setBoeking(String boeking) {
        this.boeking = boeking;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

