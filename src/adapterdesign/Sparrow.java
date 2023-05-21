package adapterdesign;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("i am flying");
    }

    @Override
    public void makeSound() {
        System.out.println("sparrow voice");
    }
}
