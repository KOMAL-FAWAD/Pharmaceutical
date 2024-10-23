public class InventoryClerk {
    String clerkID;
    String authCode;

    public InventoryClerk(String clerkID, String authCode, Pharmaceutical[] medicine) {
        this.clerkID = clerkID;
        this.authCode = authCode;
        this.medicine = medicine;
    }

    Pharmaceutical []medicine = new Pharmaceutical[10];

}
