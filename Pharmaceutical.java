import jdk.jshell.Snippet;

import java.time.LocalDateTime;
enum status {
    IN_STOCK, OUT_OF_STOCK;

}

public abstract class Pharmaceutical {
    String medName;
    String manufacturer;
    String expiryDate;
    status inStock = status.IN_STOCK;

    public Pharmaceutical(String medName, String manufacturer, String expiryDate) {
        this.medName = medName;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
    }

    public String getMedName() {
        return medName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void isEquivalent(Pharmaceutical obj){

        if(obj.manufacturer.equals(manufacturer) && obj.expiryDate.equals(expiryDate)){
            System.out.println("Both Medicines are equal");
            System.out.println("Medicine name : "+obj.getMedName());
            System.out.println("Manufacturer : "+obj.getManufacturer());
            System.out.println("Expiry date : "+obj.getExpiryDate());
            if(obj instanceof Antibiotic){
                System.out.println("Spectrum : "+((Antibiotic) obj).getSpectrum());
            }
            if(obj instanceof Analgesic){
                System.out.println("Pain Type : "+((Analgesic) obj).getPainType());
            }
        }
        else{
            System.out.println("Medicines are not equal");

        }

    }
    public abstract void displaySpecs();
}
