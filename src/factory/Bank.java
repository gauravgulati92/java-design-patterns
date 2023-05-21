package factory;

public abstract class Bank {
    public abstract String name();

    public abstract double interestValue();

    public long calculate(long value) {
        return (long) (interestValue() * value);
    }

}
