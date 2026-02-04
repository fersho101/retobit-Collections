package RetoArrayList;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
        AtomicBoolean flag = new AtomicBoolean(false);
        for (Item e : items) {
            if (e.getName().equals(itemName)) {
                items.remove(e.getName());
                flag.set(true);
            }
        }
        return flag.get();
    }

    public Item findItem(String itemName) {
        // Aquí tu código
        for(Item e : items) {
            if(e.getName().equals(itemName)) {
                return e;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        double sum = 0;
        for(Item e: items) {
            sum += e.getWeight();
        }
        return sum; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
