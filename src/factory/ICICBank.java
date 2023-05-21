package factory;

public class ICICBank extends Bank{
    @Override
    public String name() {
        return "ICICI";
    }

    @Override
    public double interestValue() {
        return 15;
    }
}
