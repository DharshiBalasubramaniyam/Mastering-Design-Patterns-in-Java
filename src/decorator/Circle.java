package decorator;

public class Circle implements Shape{

    private String name;

    public Circle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle, " + getName() + ".");
    }

}
