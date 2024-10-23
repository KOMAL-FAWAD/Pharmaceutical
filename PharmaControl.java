public class PharmaControl{
    Pharmaceutical []inventory = new Pharmaceutical[10];
//    InventoryClerk []inv = new InventoryClerk[10];
    int invCount = 0;
    PharmaControl(){

    }

//    public PharmaControl(Pharmaceutical[] obj, InventoryClerk[] inv) {
//        this.obj = obj;
//        this.inv = inv;
//    }

    public void addToInventory(Pharmaceutical obj){
        if(invCount< inventory.length){
            inventory[invCount] = obj;
            invCount++;
            System.out.println("Medicine added to inventory");
        }
        else{
            System.out.println("Inventory is full");
        }

    }
    public void removeFromInventory(Pharmaceutical obj){
        for(int i = 0; i < invCount; i++){
            if(inventory[i] != null && inventory[i].getMedName().equals(obj.getMedName())){
                inventory[i] = null;
                System.out.println("Medicine removed from inventory");
                return;
            }

        }
        System.out.println("Medicine not found in inventory");


    }

    public void searchInInventory(Pharmaceutical obj) {
        for (Pharmaceutical i : inventory) {
                if (i != null && i.getMedName().equals(obj.getMedName())) {
                obj.displaySpecs();
                }
            }
        System.out.println("Medicine not found");

    }
    public void issueMedicine(Pharmaceutical obj){
        for (Pharmaceutical i : inventory) {
            if (i != null && i.getMedName().equals(obj.getMedName())) {
                System.out.println("Medicine issued");
                obj.displaySpecs();
                return;
            }
        }
        System.out.println("Medicine not found");
    }
    public void restockMedicine(Pharmaceutical obj){
        for (Pharmaceutical i : inventory) {
            if (i != null && i.getMedName().equals(obj.getMedName())) {
                System.out.println("Medicine available");
                return;
            }
        }
        System.out.println("Medicine restock required");
    }
    public void generateReport(){
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] != null){
                inventory[i].displaySpecs();
            }
        }
    }
}
