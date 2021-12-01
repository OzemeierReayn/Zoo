package com.ing.zoo;

import java.util.Random;

public class Monkey implements Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trickText;

    public Monkey() {
    }

    @Override
    public void sayHello() {
        helloText = "Greetings, gentleperson. Welcome to my abode";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "Thank you for the scrumptious meal you have given me.";
        System.out.println(eatText);
    }

    public void eatLeaves() {
        eatText = "I too enjoy some greens from time to time";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            trickText = "I will not perform any trick. I am not the same as any other animal";
        } else {
            trickText = "Only if I'm given something in return";
        }
        System.out.println(trickText);
    }
}
