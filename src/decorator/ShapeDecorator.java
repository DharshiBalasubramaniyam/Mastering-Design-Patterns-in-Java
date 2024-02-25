package decorator;

abstract class ShapeDecorator implements Shape{

    private Shape decoratedShape;

    public Shape getDecoratedShape() {
        return decoratedShape;
    }

    public void setDecoratedShape(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
