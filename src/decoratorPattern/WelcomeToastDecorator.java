package decoratorPattern;

public class WelcomeToastDecorator extends ShapeDecorator {
    private Shape shape;

    public WelcomeToastDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        addWelcomeToast();
        shape.draw();
    }

    private void addWelcomeToast() {
        System.out.println("Welcome buddy...");
    }
}
