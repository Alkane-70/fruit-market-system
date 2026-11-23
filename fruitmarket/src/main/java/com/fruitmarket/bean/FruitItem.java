package com.fruitmarket.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FruitItem {
    private String number;
    private String name;
    private double price;
    private String unit;
}
