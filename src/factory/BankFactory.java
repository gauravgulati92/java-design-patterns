package factory;

public class BankFactory {
    public Bank getBank(String name) {
        return switch (name) {
            case "ICICI" -> new ICICBank();
            case "HDFC" -> new HDFCBank();
            default -> null;
        };
    }
}
