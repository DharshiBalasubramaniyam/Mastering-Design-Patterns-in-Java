package decorator;

public class BorderDecorator extends ShapeDecorator {
    private String color;
    private int widthInPxs;

    public BorderDecorator(Shape decoratedShape, String color, int widthInPxs) {
        super(decoratedShape);
        this.color = color;
        this.widthInPxs = widthInPxs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidthInPxs() {
        return widthInPxs;
    }

    public void setWidthInPxs(int widthInPxs) {
        this.widthInPxs = widthInPxs;
    }

    @Override
    public String getName() {
        return getDecoratedShape().getName();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding " + getWidthInPxs() + "px, " + getColor() + " color border to " + getName() + ".");
    }
}
