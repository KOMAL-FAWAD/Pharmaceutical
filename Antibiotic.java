import java.time.LocalDateTime;

public class Antibiotic extends Pharmaceutical implements Classifiable {

    String spectrum;

    public Antibiotic(String medName, String manufacturer, String expiryDate, String spectrum) {
        super(medName, manufacturer, expiryDate);
        this.spectrum = spectrum;
    }

    public String getSpectrum() {
        return spectrum;
    }

    //Pharmaceutical []medicines = new Pharmaceutical[10];
    public void displaySpecs(){
        System.out.println("Medicine : " +getMedName());
        System.out.println("Manufacturer : " + getManufacturer());
        System.out.println("Expiry Date : " + getExpiryDate());
        System.out.println("Spectrum : " + getSpectrum());
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
