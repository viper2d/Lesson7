package main;

public abstract class Animal {

    String name;

    public String getName() {
        return name;
    }


    public void eat(){
        System.out.println(getName() + " ate some snacks");
    }

}
