package facadePattern;

public interface Phone {
    String brand();

    String modelNumber();

    Long price();

    default void show() {
        System.out.println(brand() + "-" + modelNumber() + "-" + price());
    }

}
