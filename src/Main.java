public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addItem(new SmartPhones("iphone", 999.99,"001", "OLED"));
        shop.addItem(new SmartPhones("galaxy", 899.99,"002",  "AMOLED"));
        shop.addItem(new Appliances("washing machine", 499.99,"003", "2000"));
        shop.addItem(new Appliances("microwave", 199.99,"004", "800"));

        System.out.println("Все товары:");
        shop.printAllItems()
        shop.changeName();

        System.out.println("Все товары после изменения названий:");
        shop.printAllItems();
    }
}