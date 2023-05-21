package facadePattern;

public class Iphone implements Phone {

    @Override
    public String brand() {
        return "IPHONE";
    }

    @Override
    public String modelNumber() {
        return "12";
    }

    @Override
    public Long price() {
        return 70000L;
    }
}
