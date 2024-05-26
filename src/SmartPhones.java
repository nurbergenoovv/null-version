public class SmartPhones extends Item {
    private String displayType;

    public SmartPhones() {}
    public SmartPhones(String name, double price, String sku, String displayType) {
        super(name, price, sku);
        this.displayType = displayType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String toString() {
        return "SmatPhones{" +
                "displayType='" + displayType + '\'' +
                '}';
    }
}

