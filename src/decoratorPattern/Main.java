package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle =  new Rectangle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape greenCircle = new GreenShapeDecorator(circle);
        Shape greenRectangle = new GreenShapeDecorator(new WelcomeToastDecorator(rectangle));
        Shape redRectangle = new RedShapeDecorator(rectangle);
        greenRectangle.draw();
        redRectangle.draw();
        greenCircle.draw();
        redCircle.draw();

     }
}
