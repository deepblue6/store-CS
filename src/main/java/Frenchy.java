import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frenchy extends Restaurant {
  private List<String> salsaVarieties;
  private boolean hasMariachiBand;
  private double spicyLevel;
  private ArrayList<Item> foodItems = new ArrayList<Item>();


  public Frenchy(String col, String n, String size) {
    super(col, n, size);
    this.cuisineType = "French";
    this.hasMariachiBand = false;
    this.spicyLevel = 0.0;
    this.salsaVarieties = new ArrayList<>();
    this.foodItems.add(new Item("boeuf bourignon"));
    this.foodItems.add(new Item("pates aux fromages"));
    this.foodItems.add(new Item("mousse aux chocolat"));
  }

  public void initializeMenu() {
    Collections.addAll(this.salsaVarieties,
        "Mango Salsa", "Pico de Gallo Salsa", "Corn Salsa", "Tomatillo Salsa", "Chile Salsa", "Jal Salsa");
  }
  
  public ArrayList<Item> getMenu() {
    return this.foodItems;
  }


  ///
  ///
  ///
  ///

  public void eatTacos() {
    print("Enjoying delicious tacos at " + this.name + "!");
    print("");
  }


  public void prepareGuacamole() {
    print("Fresh guacamole is being prepared at " + this.name + "!");
    print("");
  }

  @Override
  public void serveAlchohol() {
    print("Enjoy a refreshing glass of red wine at " + this.name + "!");
    print("");
  }

  public void makeMousse() {
    print("Delicious chocolate mousse is being made at " + this.name + "!");
  }

}
