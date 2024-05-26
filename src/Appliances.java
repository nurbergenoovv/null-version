public class Appliances extends Item{
    private String power;

    public Appliances(){}
    public Appliances(String name, double price, String sku, String power){
        super(name, price, sku);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String toString() {
        return "Appliances{" +
                "power='" + power + '\'' +
                '}';
    }
}
