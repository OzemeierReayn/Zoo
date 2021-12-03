package com.ing.zoo.animal;

import java.util.Random;

public class Pig implements Animal, Tricks, Carnivore, Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig() {
    }

    @Override
    public String getHelloMessage() {
        return "splash mud";
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }

    @Override
    public String getName() {
        return name;
    }
}
