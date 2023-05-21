package factory;

public class HDFCBank extends Bank{
    @Override
    public String name() {
        return "HDFC";
    }

    @Override
    public double interestValue() {
        return 10;
    }
}
