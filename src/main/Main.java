package main;

public class Main {

    public static void main(String[] args) {
        /* Novice */
        Cat cat = new Cat("Tom");
        cat.setColor("bLuE");
        System.out.println("Cat " + cat.getName() + " is " + cat.getColor() + "."); // "Cat Tom is blue."
        cat.lookForMouse(); // "Tom is looking for a mouse."

        /* Easy */
        Mouse mouse = new Mouse("Jerry");
        cat.capture(mouse); // "Tom trying to capture Jerry"

        /* Medium */
        /*
            add energy to Cat (energy by default should be 2;, and decrease it when try to capture mouse
            modify .capture() method: add method isTyred() - which checks if cat still have energy, if yes try to catch, if not print: "Tom is tired, he needs to sleep"
            method sleep() refills energy level back to 2 (if call more than 1 time sleep() print that Tom is already sleeps
         */
        cat.capture(mouse); // "Tom trying to capture Jerry"
        cat.capture(mouse); // "Tom is tyred, need to sleep" (Tom's energy is gone)
        cat.sleep(); // "Tom went to sleep"
        cat.sleep(); // "Tom can't go sleep, he is already sleeping"
        cat.capture(mouse); // "Tom trying to capture Jerry"

        /* Hard */
        /*
            Create interface Informative with method describe(), and implement this interface in Mouse class
            method describe() - will print your description about how Jerry is look like (1 or 2 sentences)
            e.g. "Jerry is small brown mouse which likes mozzarella cheese"
         */
       mouse.describe(); // "Jerry is small brown mouse which likes mozzarella cheese"

        /* Very Hard */
        /*
            Create abstract class Animal, create eat method which will print: "<cat or mouse name> went sleep"
            NOTE: you should refactor your Cat and Mouse classes
         */
//        cat.eat(); // "Tom ate some snacks"
        mouse.eat(); // "Jerry ate some snacks"
    }

    /* Output:

        Cat Tom is blue.
        Tom is looking for a mouse.
        Tom trying to capture Jerry
        Tom trying to capture Jerry
        Tom is tyred, need to sleep
        Tom went to sleep
        Tom can't go sleep, he is already sleeping
        Tom trying to capture Jerry
        Jerry is small brown mouse which likes mozzarella cheese
        Tom ate some snacks
        Jerry ate some snacks

     */

}