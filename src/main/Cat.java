package main;

public class Cat {

    public String name;
    public String color;
    int energy = 2;

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
        System.out.println(name + " is looking for a mouse.");
    }

    public void capture(Mouse mousename) {

        if (isTyred()) {
            System.out.println(name + " is tyred, need to sleep");
        } else {
            System.out.println(name + " trying to capture " + mousename.getMouseName());
            energy--;
        }
    }

    private boolean isTyred() {
        if (energy == 0) {
            return true;
        }
        return false;
    }

    public void sleep() {
        if (energy == 0) {
            System.out.println(name + " went to sleep");
            energy++;
        }
        else if (energy < 2) {
            System.out.println(name + " is sleeping");
            energy++;
        }

    }

}
