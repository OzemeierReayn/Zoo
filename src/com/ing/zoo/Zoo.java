package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {


    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();

        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        Dolphin berta = new Dolphin();
        berta.name = "berta";
        Monkey jeffrey = new Monkey();
        jeffrey.name = "jeffrey";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        //Arraylist for animals
        listOfAnimals.add(henk);
        listOfAnimals.add(elsa);
        listOfAnimals.add(dora);
        listOfAnimals.add(marty);
        listOfAnimals.add(wally);

        listOfAnimals.add(berta);
        listOfAnimals.add(jeffrey);

        String input = scanner.nextLine();

        if (input.equals(commands[0])) {        //Check for hello all animals
            listOfAnimals.forEach(Animal::sayHello);
        } else if (input.equals(commands[0] + " henk")) {
            henk.sayHello();
        } else if (input.equals(commands[0] + " elsa")) {
            elsa.sayHello();
        } else if (input.equals(commands[0] + " dora")) {
            dora.sayHello();
        } else if (input.equals(commands[0] + " wally")) {
            wally.sayHello();
        } else if (input.equals(commands[0] + " marty")) {
            marty.sayHello();
        } else if (input.equals(commands[0] + " berta")) {
            berta.sayHello();
        } else if (input.equals(commands[0] + " jeffrey")) {
            jeffrey.sayHello();

        } else if (input.equals(commands[1])) {     //Check herbivores for all animals
            elsa.eatLeaves();
            dora.eatLeaves();
            marty.eatLeaves();
            jeffrey.eatLeaves();

        } else if (input.equals(commands[2])) {     //Check carnivores for all animals
            henk.eatMeat();
            dora.eatMeat();
            wally.eatMeat();
            berta.eatMeat();
            jeffrey.eatMeat();

        } else if (input.equals(commands[3])) {     //Check tricks for all animals
            dora.performTrick();
            wally.performTrick();
            berta.performTrick();
            jeffrey.performTrick();

        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}

