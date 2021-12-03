package com.ing.zoo.command;

import com.ing.zoo.Zoo;
import com.ing.zoo.animal.Carnivore;
import com.ing.zoo.animal.Herbivore;

public class EatCommand implements Command {
    @Override
    public String getName() {
        return "give";
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("You're giving invisible food to the animals. Give them something to eat: [leaves, meat]");
            return;
        }
        //Input is meat
        if (args[0].equalsIgnoreCase("meat")) {
            Zoo.listOfAnimals
                    .stream()
                    .filter(animal -> animal instanceof Carnivore)
                    .forEach(animal -> System.out.printf("%s: %s\n", animal.getName(), ((Carnivore) animal).getEatMeatMessage()));
            return;
        }
        //Input is leaves
        if (args[0].equalsIgnoreCase("leaves")) {
            Zoo.listOfAnimals
                    .stream()
                    .filter(animal -> animal instanceof Herbivore)
                    .forEach(animal -> System.out.printf("%s: %s\n", animal.getName(), ((Herbivore) animal).getEatLeavesMessage()));
            return;
        }

        System.out.println("Hey stinky. You're giving the animal something inedible");
    }
}
