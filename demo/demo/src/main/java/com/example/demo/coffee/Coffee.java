package com.example.demo.coffee;

import java.util.ArrayList;
import java.util.List;

abstract public class Coffee {
    String name;
    List<String> ingredients = new ArrayList<String>();

    public String getName() {
            return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void pack() {
        System.out.println("Packaging " + name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("\nName: " + name + "\n");
        for(String ingredient:ingredients){
            display.append(ingredient + "\n");
        }
        return display.toString();
    }


}
