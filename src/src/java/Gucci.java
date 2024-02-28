import java.util.ArrayList;
import java.util.Collections;

public class Gucci extends Clothing {
    private ArrayList<Store.Item> bags; // Use the fully qualified name

    public Gucci(String c, String n, String s) {
        super(c, "Gucci", s);
        this.bags = new ArrayList<>();
    }

    public ArrayList<Store.Item> getBags() {
        return this.bags;
    }

    public void initializeMenu() {
        Collections.addAll(this.bags,
                new Store.Item("Gucci Belt Bag" ),
                new Store.Item("Red Carry-on"),
                new Store.Item("Backpack Kid X Gucci"),
                new Store.Item("LuhBronz Baagz"));

                Collections.addAll(this.clothes,
                new Store.Item("Gucci T-Shirt"),
                new Store.Item("Gucci Jeans"),
                new Store.Item("Gucci Sneakers"),
                new Store.Item("Gucci Hoodie"));
    }
}
