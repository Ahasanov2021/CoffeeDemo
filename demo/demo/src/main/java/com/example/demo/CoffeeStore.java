package com.example.demo;

import com.example.demo.SimpleCoffeeFactory;
import com.example.demo.coffee.Coffee;

public class CoffeeStore {
    SimpleCoffeeFactory factory;

    public CoffeeStore(SimpleCoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee;

        coffee =  factory.createCoffee(type);

        coffee.prepare();
        coffee.pack();

        return coffee;
    }
}
