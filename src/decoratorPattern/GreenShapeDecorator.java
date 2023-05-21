package decoratorPattern;

public class GreenShapeDecorator extends ShapeDecorator {
    private Shape shape;

    public GreenShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Adding green border");
    }
}
