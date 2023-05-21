package facadePattern;

public class Vivo implements Phone{
    @Override
    public String brand() {
        return "Vivo";
    }

    @Override
    public String modelNumber() {
        return "IQ9";
    }

    @Override
    public Long price() {
        return Long.valueOf(30000);
    }
}
