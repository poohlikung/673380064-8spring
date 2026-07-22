package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<Coffee> getAll() {
        return coffeeService.getAll();
    }

    @GetMapping("/{id}")
    public Coffee getById(@PathVariable Long id) {
        return coffeeService.getById(id);
    }

    @PostMapping
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        return coffeeService.add(coffee);
    }

    @PutMapping("/{id}")
    public Coffee updateCoffee(@PathVariable Long id,
                               @RequestBody Coffee coffee) {
        return coffeeService.update(id, coffee);
    }

    @DeleteMapping("/{id}")
    public String deleteCoffee(@PathVariable Long id) {

        if (coffeeService.delete(id)) {
            return "Deleted Successfully";
        }

        return "Coffee not found";
    }
}