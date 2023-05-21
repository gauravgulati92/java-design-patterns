package bridgedesign;

import java.util.List;

public class Bike extends Vehicle {
    private List<WorkShop> workShops;

    public Bike(List<WorkShop> workShops) {
        this.workShops = workShops;
    }

    @Override
    public void manufacture() {
        System.out.println("Bike manufacturing started..");
        for (WorkShop workShop : workShops) {
            workShop.work();
        }
    }
}
