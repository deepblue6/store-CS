import java.util.ArrayList;

public class Clothing extends Store {
    protected ArrayList<Item> clothes = new ArrayList<>(); // Change the type to Item
    protected boolean steal;
    protected String clothingType;
    protected String buy;
    protected double money;

    public Clothing(String c, String n, String s) {
        super(c, n, s);
        this.money = money;
    }

    public void printClothing() {
        System.out.println(this.name + " is a " + this.size + " " + this.color + " " + this.clothingType + " establishment.");
    }

    public boolean checkClothing(String Clothes) {
        boolean b = false;
        String a = Clothes.toLowerCase();
        for (Item item : this.clothes) { // Iterate over Item objects
            if (item.getName().toLowerCase().contains(a)) {
                b = true;
            }
        }
        return b;
    }

    public boolean getSteal() {
        return steal;
    }

    public void setSteal(boolean aSteal) {
        this.steal = aSteal;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String b) {
        this.buy = b;
    }

    public boolean checkSteal() {
        if ((Math.random()) * (100 - 1) + 1 > 50) {
            this.setSteal(true);
            System.out.println("Uh-oh! Utsav stole your " + this.name + " to flip it on ebay!");
            System.out.println();
            return false;
        } else {
            System.out.println("Your " + this.name + " survived another day from the clutches of the most heinous villain UTSAV!");
            System.out.println();
            return true;
        }
    }
}
