package bridgedesign;

public class Producer implements WorkShop {
    @Override
    public void work() {
        System.out.println("Producing parts");
    }
}
