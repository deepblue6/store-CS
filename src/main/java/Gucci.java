import java.util.ArrayList;
import java.util.Collections;

public class Gucci extends Clothing {
    private boolean drippedOut;
    private ArrayList<Store.Item> bags; // Use the fully qualified name

    public Gucci(String c, String n, String s) {
        super(c, "Gucci", s);
        this.clothingType = "Designer";
        drippedOut = true;
        this.bags = new ArrayList<>();
    }

    public void printDrip() {
        print(this.name + " is a " + this.size + " " + this.color + " " + this.clothingType + " clothing store");
        print("");
    }

    public ArrayList<Item> getClothes() {
        return this.clothes;
    }

    public ArrayList<Store.Item> getBags() {
        return this.bags;
    }

    public void initializeMenu() {
        Collections.addAll(this.bags,
                new Store.Item("Gucci Belt Bag", 199.99),
                new Store.Item("Red Carry-on", 149.99),
                new Store.Item("Backpack Kid X Gucci", 179.99),
                new Store.Item("LuhBronz Baagz", 129.99));

                Collections.addAll(this.clothes,
                new Store.Item("Gucci T-Shirt", 59.99),
                new Store.Item("Gucci Jeans", 129.99),
                new Store.Item("Gucci Sneakers", 199.99),
                new Store.Item("Gucci Hoodie", 79.99));
    }
}
