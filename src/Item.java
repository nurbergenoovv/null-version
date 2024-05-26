public class Item {
    private String name;
    private double price;
    private String sku;

    public Item() {
    }

    public Item(String name, double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sku=" + sku +
                '}';
    }
}
