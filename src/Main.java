import bridgedesign.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ////Factory
//        BankFactory bankFactory = new BankFactory();
//        Bank bank = bankFactory.getBank("HDFC");
//        System.out.println(bank.calculate(100));

        ///Adapter

//        Pigeon pigeon = new Pigeon();
//        pigeon.sound();
//
//        Bird sparrow = new Sparrow();
//        BirdAdapter adapter = new BirdAdapter(sparrow);
//        adapter.sound();

        /// Bridge
        Car car = new Car(List.of(new Assemble(), new Paint()));
        car.manufacture();
        Bike bike = new Bike(List.of(new Producer(), new Assemble(), new Paint()));
        bike.manufacture();
    }
}