package com.karim.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Menu {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "CHEF_RECOMMENDED")
    private boolean chefRecommended;

    @Column(name = "SPICY")
    private boolean spicy;

}
