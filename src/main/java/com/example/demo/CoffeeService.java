package com.example.demo;
import com.example.demo.Coffee;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    private final List<Coffee> coffees = new ArrayList<>();

    public CoffeeService() {

        coffees.add(new Coffee(1L, "Espresso", 45));
        coffees.add(new Coffee(2L, "Latte", 55));

    }

    public List<Coffee> getAll() {
        return coffees;
    }

    public Coffee getById(Long id) {

        for (Coffee coffee : coffees) {
            if (coffee.getId().equals(id)) {
                return coffee;
            }
        }

        return null;
    }

    public Coffee add(Coffee coffee) {

        Long newId = (long) (coffees.size() + 1);
        coffee.setId(newId);

        coffees.add(coffee);

        return coffee;
    }

    public Coffee update(Long id, Coffee newCoffee) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {

                coffee.setName(newCoffee.getName());
                coffee.setPrice(newCoffee.getPrice());

                return coffee;
            }
        }

        return null;
    }

    public boolean delete(Long id) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {
                coffees.remove(coffee);
                return true;
            }

        }

        return false;
    }

}