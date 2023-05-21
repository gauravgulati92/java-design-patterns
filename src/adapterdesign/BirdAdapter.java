package adapterdesign;

public class BirdAdapter implements Toy {
    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }
    @Override
    public void sound() {
        bird.makeSound();
    }
}
