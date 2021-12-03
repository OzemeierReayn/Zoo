package com.ing.zoo.command;

import com.ing.zoo.Zoo;
import com.ing.zoo.animal.Carnivore;
import com.ing.zoo.animal.Tricks;

public class TricksCommand implements Command{
    @Override
    public String getName() {
        return "perform";
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0){
            System.out.println("Perform what exactly? [Trick]");
            return;
        }

        //Check if it's an actual trick
        if (args[0].equalsIgnoreCase("trick")){
            Zoo.listOfAnimals
                    .stream()
                    .filter(animal -> animal instanceof Tricks)
                    .forEach(animal -> System.out.printf("%s: %s\n", animal.getName(), ((Tricks) animal).getTrickMessage()));
            return;
        }

        System.out.println("Hey stinky. Don't order the animals around like that");
    }
}
