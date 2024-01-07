package com.example.demo.service;

import com.example.demo.coffee.Coffee;

public interface CoffeeService {

    Coffee create(String type);

    String getIngredients(String type);

    String update(String type);

    String delete(String type);
}
