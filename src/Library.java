public class Library {
    private String ItemName;
    private String ItemManufacture;
    private String ItemModel;
    private String ItemSerial;
    private String ItemMac;
    private String ItemIP;
    private String ItemLocation;
    private String Connections;


    public Library(String Name, String Manufacture, String Model, String Serial, String Mac, String IP, String Location) {
        this.ItemName = Name;
        this.ItemManufacture = Manufacture;
        this.ItemModel = Model;
        this.ItemSerial = Serial;
        this.ItemMac = Mac;
        this.ItemIP = IP;
        this.ItemLocation = Location;

    }

    public String getItemSerial() {
        return ItemSerial;
    }

    public void setItemSerial(String itemSerial) {
        ItemSerial = itemSerial;
    }

    public String getItemMac() {
        return ItemMac;
    }

    public void setItemMac(String itemMac) {
        ItemMac = itemMac;
    }

    public String getItemIP() {
        return ItemIP;
    }

    public void setItemIP(String itemIP) {
        ItemIP = itemIP;
    }

    public String getItemLocation() {
        return ItemLocation;
    }

    public void setItemLocation(String itemLocation) {
        ItemLocation = itemLocation;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemManufacture() {
        return ItemManufacture;
    }

    public void setItemManufacture(String itemManufacture) {
        ItemManufacture = itemManufacture;
    }

    public String getItemModel() {
        return ItemModel;
    }

    public void setItemModel(String itemModel) {
        ItemModel = itemModel;
    }

    public String getConnections() {
        return Connections;
    }

    public void setConnections(String connections) {
        Connections = connections;
    }

    public String toString() {
        return "\n" + "ItemName = " + ItemName + '\n'
                + "ItemManufacture  = " + ItemManufacture + '\n'
                + "ItemModel =  " + ItemModel + "\n"
                + "ItemSerial  = " + ItemSerial + '\n'
                + "ItemMac  = " + ItemMac + '\n'
                + "ItemIP  = " + ItemIP + '\n'
                + "ItemLocation = " + ItemLocation + '\n';
    }
}


