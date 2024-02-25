package decorator;

public class ColorDecorator extends ShapeDecorator {
    private String color;

    public ColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return getDecoratedShape().getName();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling with " + getColor() + " color to " + getName() + ".");
    }
}
