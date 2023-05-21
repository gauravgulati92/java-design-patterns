package facadePattern;

import java.util.List;

public class ShopMaker {
    private List<Phone> phones;

    public ShopMaker() {
        phones = List.of(new Vivo(), new Iphone(), new BlackBerry());
    }

    public void showPhones() {
        phones.forEach(this::display);
    }

    private void display(Phone phone) {
        phone.show();
    }
}
