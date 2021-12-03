package com.ing.zoo;

import com.ing.zoo.animal.*;
import com.ing.zoo.command.Command;
import com.ing.zoo.command.EatCommand;
import com.ing.zoo.command.HelloCommand;
import com.ing.zoo.command.TricksCommand;

import java.util.*;

public class Zoo {
    public static List<Animal> listOfAnimals = new ArrayList<>();
    private static List<Command> listOfCommands = new ArrayList<>();

    static {
        //Animals
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

        Monkey fitzgerald = new Monkey();
        fitzgerald.name = "fitzgerald";
        Dolphin berta = new Dolphin();
        berta.name = "berta";

        //Commands
        listOfCommands.add(new HelloCommand());
        listOfCommands.add(new EatCommand());
        listOfCommands.add(new TricksCommand());


        //Arraylist for animals, herbivores, carnivores and animals that can perform tricks
        listOfAnimals.add(henk);
        listOfAnimals.add(elsa);
        listOfAnimals.add(dora);
        listOfAnimals.add(marty);
        listOfAnimals.add(wally);

        listOfAnimals.add(fitzgerald);
        listOfAnimals.add(berta);
    }

    public static void main(String[] args) {
//        String[] commands = new String[4];
//        commands[0] = "hello";
//        commands[1] = "give leaves";
//        commands[2] = "give meat";
//        commands[3] = "perform trick";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        if (parts.length == 0) {
            System.out.println("No input received. Application will self-destruct sooner than you think...?");
            return;
        }

        Optional<Command> commandOptional = listOfCommands
                .stream()
                .filter(command -> command.getName().equalsIgnoreCase(parts[0]))
                .findFirst();

        if (!commandOptional.isPresent()) {
            System.out.println("Unknown command [hello, give leaves, give meat, perform trick]");
            return;
        }

        //Execute commands based on user input
        commandOptional.get().execute(Arrays.copyOfRange(parts, 1, parts.length));


//        if (input.equals(commands[0])) {        //Check for hello all animals
//            listOfAnimals.forEach(Animal::sayHello);
//        } else if (input.equals(commands[0] + " henk")) {
//            henk.sayHello();
//        } else if (input.equals(commands[0] + " elsa")) {
//            elsa.sayHello();
//        } else if (input.equals(commands[0] + " dora")) {
//            dora.sayHello();
//        } else if (input.equals(commands[0] + " wally")) {
//            wally.sayHello();
//        } else if (input.equals(commands[0] + " marty")) {
//            marty.sayHello();
//        } else if (input.equals(commands[0] + " berta")) {
//            berta.sayHello();
//        } else if (input.equals(commands[0] + " fitzgerald")) {
//            fitzgerald.sayHello();
//
//        } else if (input.equals(commands[1])) {     //Check herbivores for all animals
//            listOfHerbivores.forEach(Herbivore::eatLeaves);
//
//        } else if (input.equals(commands[2])) {     //Check carnivores for all animals
//            listOfCarnivores.forEach(Carnivore::eatMeat);
//
//        } else if (input.equals(commands[3])) {     //Check tricks for all animals
//            listOfAnimalTricks.forEach(Tricks::performTrick);
//
//        } else {
//            System.out.println("Unknown command: " + input);
//        }
//    }
    }
}

