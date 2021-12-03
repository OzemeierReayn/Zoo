package com.ing.zoo;

import java.util.Random;

public class Dolphin implements Animal, Carnivore, Tricks {
    public String name;
    public String helloText;
    public String eatText;
    public String trickText;

    public Dolphin() {
    }

    @Override
    public void sayHello() {
        helloText = "beep beep henlo";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "thenk fo' feesh";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(3);

        if (rnd == 0) {
            trickText = "ball bounce";
        } else if (rnd == 1) {
            trickText = "swim around";
        } else {
            trickText = "jump out of the water";
        }
        System.out.println(trickText);
    }
}
