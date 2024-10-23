public class Main {
    public static void main(String[] args) {
        Antibiotic amoxicillin = new Antibiotic("Amoxicillin","ABC Pharma","2024-12-01","Broad");
        Analgesic ibuprofen = new Analgesic("Ibuprofen","XYZ Pharma","2024-05-15","Acute");
        Antibiotic ciprofloxacin = new Antibiotic("Ciprofloxacin","123 Pharma","2025-06-15","Broad");
        Analgesic paracetamol = new Analgesic("Paracetamol","456 Pharma","2025-09-30","General");
        Antibiotic erythromycin = new Antibiotic("Erythromycin","789 Pharma","2022-11-20","Narrow");
        PharmaControl pharmaControl = new PharmaControl();
        //Add Medicines to Inventory
        pharmaControl.addToInventory(amoxicillin);
        pharmaControl.addToInventory(ibuprofen);
        pharmaControl.addToInventory(ciprofloxacin);
        pharmaControl.addToInventory(paracetamol);
        System.out.println("Searching results for Amoxicillin");
        pharmaControl.searchInInventory(amoxicillin);
        pharmaControl.removeFromInventory(ibuprofen);
        System.out.println("Searching results for Ibuprofen");
        pharmaControl.searchInInventory(ibuprofen);
//        pharmaControl.generateReport();
//        pharmaControl.issueMedicine(paracetamol);
//        pharmaControl.restockMedicine(ibuprofen);
    }
}