package com.example.demo.service;

import com.example.demo.coffee.Coffee;
import com.example.demo.CoffeeStore;
import com.example.demo.SimpleCoffeeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CoffeeServiceImpl implements CoffeeService {

    SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
    CoffeeStore store = new CoffeeStore(factory);

    @Override
    public Coffee create(String type){
        Coffee coffee = store.orderCoffee(type);
        log.info(coffee.toString());
        return coffee;
    }

    @Override
    public String getIngredients(String type) {
        Coffee coffee = store.orderCoffee(type);
        return coffee.toString();
    }

    @Override
    public String update(String type) {
        return new String("Updating type: " + type);
    }

    @Override
    public String delete(String type) {
        return new String("Updating type: " + type);
    }


}
