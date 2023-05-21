package facadePattern;

public class BlackBerry implements Phone {
    @Override
    public String brand() {
        return "Black Berry";
    }

    @Override
    public String modelNumber() {
        return "X234";
    }

    @Override
    public Long price() {
        return 50000L;
    }
}
