import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getPrice();
        }

        return total;
    }

    public boolean checkout() {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getAvailableCopies() == 0) {
                System.out.println("Cannot checkout.");
                System.out.println(items.get(i).getName() + " is out of stock.");
                return false;
            }
        }

        for (int i = 0; i < items.size(); i++) {
            items.get(i).sell();
        }

        items.clear();
        return true;
    }
}