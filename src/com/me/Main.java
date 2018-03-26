package com.me;

//directions
/*
- create a simple interface (tip: name it Saveable or ISaveable)
- that interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
- the exact type of medium is not known to the interface (nor to the classes that implement it).
- the interface will just specify 2 methods, one to return an arraylist of values to be saved
and the other to populate the object's fields from an arraylist (parameter).
- create a few sample classes that implement your Saveable interface (we've used tthe idea of a game,
with players and monsters, but you can create any type of classes that you want).
- override the toString()method for each of your classes so that they can be easily printed to enable
the program to be tested easier.
- in main, write a method that takes an object that implements the interface as a parameter and
"saves" the values, ex. calls the method defined in the interface.
- we haven't covered I/O yet, so your method should just print the values to the screen.
- also in the main class, write a method that retores the values to a saveable object
ex. calls the mthod from the interface for populating fields (see above)
- again we are not going to use java file I/O; instead use the readValues() method below to
simulate getting values from a file - this allows you to type as many values as your class
requires, and returns an arraylist
 */

/*
https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //step 15 creating instance
        Player patrick = new Player("Patrick", 10, 15);
        System.out.println(patrick.toString());
        savedObject(patrick);

        //step 16 changes
        patrick.setHitpoints(8);
        System.out.println(patrick);
        patrick.setWeapon("Stormbringer");
        savedObject(patrick);
        loadObject(patrick);
        System.out.println(patrick);

        //step 17 run

    }

        //input from lesson the read values method outside of the main
        public static ArrayList<String> readValues () {
            ArrayList<String> values = new ArrayList<String>();

            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;
            System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "0 to quit");

            while (!quit) {
                System.out.println("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.println("Enter a string: ");
                        String stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                }

            }
            return values;

        }

        //step 13 method
        public static void savedObject (ISaveable objectToSave){

            for (int i = 0; i < objectToSave.write().size(); i++) {

                System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

            }

        }

        //step 14 method for load object
        public static void loadObject (ISaveable objectToLoad){
            ArrayList<String> values = readValues();
            objectToLoad.read(values);


        }
    }


