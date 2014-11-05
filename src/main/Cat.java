package main;

public class Cat {

    public String name;
    public String color;

    public Cat(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void lookForMouse() {
        System.out.println("Tom is looking for a mouse.");
    }

    public void capture(Mouse mousename) {
        System.out.println(name + " trying to capture " + mousename.getMouseName());
    }

}
