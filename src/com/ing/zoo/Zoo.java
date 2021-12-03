package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
//
//    static {
//    }
//    private static List<Animal> listOfAnimals = new ArrayList<>();
//

    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        List<Herbivore> listOfHerbivores = new ArrayList<>();
        List<Carnivore> listOfCarnivores = new ArrayList<>();
        List<Tricks> listOfAnimalTricks = new ArrayList<>();

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

        Monkey jeffrey = new Monkey();
        jeffrey.name = "jeffrey";
        Dolphin berta = new Dolphin();
        berta.name = "berta";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        //Arraylist for animals, herbivores, carnivores and animals that can perform tricks
        listOfAnimals.add(henk);
        listOfAnimals.add(elsa);
        listOfAnimals.add(dora);
        listOfAnimals.add(marty);
        listOfAnimals.add(wally);

        listOfAnimals.add(jeffrey);
        listOfAnimals.add(berta);

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
            listOfHerbivores.forEach(Herbivore::eatLeaves);

        } else if (input.equals(commands[2])) {     //Check carnivores for all animals
            listOfCarnivores.forEach(Carnivore::eatMeat);

        } else if (input.equals(commands[3])) {     //Check tricks for all animals
            listOfAnimalTricks.forEach(Tricks::performTrick);

        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}

