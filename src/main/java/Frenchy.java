import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frenchy extends Restaurant {
  private List<String> desserts;
  private boolean hasMariachiBand;
  private double spicyLevel;
  private ArrayList<Item> foodItems = new ArrayList<Item>();


  public Frenchy(String col, String n, String size) {
    super(col, n, size);
    this.cuisineType = "French";
    this.hasMariachiBand = false;
    this.spicyLevel = 0.0;
    this.desserts = new ArrayList<>();
    this.foodItems.add(new Item("boeuf bourignon"));
    this.foodItems.add(new Item("pates aux fromages"));
    this.foodItems.add(new Item("mousse aux chocolat"));
  }

  public void initializeMenu() {
    Collections.addAll(this.desserts, "French mousse", "Cheesecake");
  }

  ///
  ///
  ///
  ///

  @Override
  public void serveAlchohol() {
    print("Enjoy a refreshing glass of red wine at " + this.name + "!");
    print("");
  }

  public void makeMousse() {
    print("Delicious chocolate mousse is being made at " + this.name + "!");
  }

}
