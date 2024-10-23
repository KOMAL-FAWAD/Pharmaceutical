import java.time.LocalDateTime;

public class Analgesic extends Pharmaceutical implements Classifiable{
    String painType;

    public String getPainType() {
        return painType;
    }

    public Analgesic(String medName, String manufacturer, String expiryDate, String painType) {
        super(medName, manufacturer, expiryDate);
        this.painType = painType;
    }

    public void displaySpecs(){
        System.out.println("Medicine :" + getMedName());
        System.out.println("Manufacturer :" + getManufacturer());
        System.out.println("Expiry Date :" + getExpiryDate());
        System.out.println("Pain Type :" + getPainType());
    }

    @Override
    public void addMedicine(Pharmaceutical []medicines){
        System.out.println("Add medicine");

    }
    @Override
    public void removeMedicine(Pharmaceutical []medicines){
        System.out.println("Remove medicine");
    }
    @Override
    public void searchMedicine(Pharmaceutical []medicines){
        System.out.println("Search medicine");
    }
}
