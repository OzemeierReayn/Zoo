package com.ing.zoo.command;

import com.ing.zoo.Zoo;
import com.ing.zoo.animal.Animal;

import java.util.Optional;

public class HelloCommand implements Command {
    @Override
    public String getName() {
        return "hello";
    }

    @Override
    public void execute(String[] args) {
        //no input after hello = all animals
        if (args.length == 0) {
            Zoo.listOfAnimals.forEach(animal -> System.out.printf("%s: %s\n", animal.getName(), animal.getHelloMessage()));
            return;
        }

        //input + name = specific animal
        Optional<Animal> animalOptional = Zoo.listOfAnimals
                .stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(args[0]))
                .findFirst();

        //Checks if animal exists
        if(!animalOptional.isPresent()) {
            System.out.println("We don't have any animals by that name!");
            return;
        }

        Animal animal = animalOptional.get();

        System.out.printf("%s: %s\n", animal.getName(), animal.getHelloMessage());
    }
}
