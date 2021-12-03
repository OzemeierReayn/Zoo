package com.ing.zoo.animal;

public class Lion implements Animal, Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion() {
    }

    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    @Override
    public String getName() {
        return name;
    }

}
