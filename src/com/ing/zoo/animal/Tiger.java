package com.ing.zoo.animal;

import java.util.Random;

public class Tiger implements Animal, Carnivore, Tricks {
    public String name;

    public Tiger() {
    }

    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public String getEatMeatMessage() {
        return  "nomnomnom oink wubalubadubdub";
    }

    public void performTrick() {
        Random random = new Random();
        String trick;
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        return trick;
    }

    @Override
    public String getName() {
        return name;
    }
}
