package main;

public class Mouse extends Animal implements Informative {

    public String getMouseName() {
        return name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(getMouseName() + " is small brown mouse which likes mozzarella cheese");
    }

}
