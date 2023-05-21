package bridgedesign;

import java.util.List;

public class Car extends Vehicle {
    private List<WorkShop> workShops;

    public Car(List<WorkShop> workShops) {
        this.workShops = workShops;
    }

    @Override
    public void manufacture() {
        System.out.println("Car manufacturing started..");
        for (WorkShop workShop : workShops) {
            workShop.work();
        }
    }
}
