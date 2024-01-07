package com.example.demo;

import com.example.demo.coffee.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleCoffeeFactory {


    public Coffee createCoffee(String type) {
        Coffee coffee = null;

        switch (type) {
            case "espresso":
                coffee = new Espresso();
                break;
            case "doubleespresso":
                coffee = new DoubleEspresso();
                break;
            case "americano":
                coffee = new Americano();
                break;
            case "macchiato":
                coffee = new Macchiato();
                break;
            case "cappuccino":
                coffee = new Cappuccino();
                break;
            case "cafelatte":
                coffee = new CafeLatte();
                break;
            case "mocha":
                coffee = new Mocha();
                break;
            default:
                coffee = new Americano();
                break;

        }
        return coffee;
    }
}