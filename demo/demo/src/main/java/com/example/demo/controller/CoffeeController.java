package com.example.demo.controller;

import com.example.demo.coffee.Coffee;
import com.example.demo.service.CoffeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }


    @GetMapping("/{type}")
    public String getIngredients(@PathVariable String type) {
        return coffeeService.getIngredients(type);
    }

    @PostMapping("/{type}")
    public Coffee create(@PathVariable String type) {
        return coffeeService.create(type);
    }

    @PutMapping("/{type}")
    public String update(@PathVariable String type) {
        return coffeeService.update(type);
    }

    @DeleteMapping("/{type}")
    public String delete(@PathVariable String type) {
        return coffeeService.delete(type);
    }


}
