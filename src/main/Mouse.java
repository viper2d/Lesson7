package main;

public class Mouse extends Animal implements Informative {

    private String name;

    public String getMouseName() {
        return name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(getMouseName() + " is small brown mouse which likes mozzarella cheese");
    }

    public void eat() {
        System.out.println(getMouseName()+ " ate some snacks");
    };

}
