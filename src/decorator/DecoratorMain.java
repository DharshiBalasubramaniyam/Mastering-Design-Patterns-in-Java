package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle1 = new Circle("circle1");
        Shape circle1WithBorder = new BorderDecorator(circle1, "red", 2);
        Shape circle1WithBorderAndColor = new ColorDecorator(circle1WithBorder, "blue");

        circle1WithBorderAndColor.draw();
    }
}
