package com.ing.zoo;

public class Zebra implements Animal, Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Zebra() {
    }

    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

}
