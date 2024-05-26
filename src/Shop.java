import java.util.*;


public class Shop {
    List<Item> items;

    public Shop() {
        items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public Boolean removeItem(String sku) {
        try {
            return items.removeIf(item -> item.getSku().equals(sku));
        } catch (NoSuchElementException e) {
            System.out.println("Item not found.");
            return false;
        }
    }

    public Optional<Item> searchBySku(String sku) {
        return items.stream().filter(item -> item.getSku().equals(sku)).findFirst();
    }

    public void getCountByCatgory(){
        long countSmartPhones = items.stream().filter(item -> item instanceof SmartPhones).count();
        long countAppliances = items.stream().filter(item -> item instanceof Appliances).count();

        System.out.println("SmartPhones: " + countSmartPhones);
        System.out.println("Appliances: " + countAppliances);
    }

    public void removeDublicats(){
        Set<String> seenSkus = new HashSet<>();
        items.removeIf(item -> !seenSkus.add(item.getSku()));
    }
    public void changeName(){
        items.forEach(item ->{
            String name = item.getName();
            item.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
        });
    }

    public void printAllItems(){
        items.stream().map(Item::getName).sorted().forEach(System.out::println);
    }
}
