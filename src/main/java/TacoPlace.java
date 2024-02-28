import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TacoPlace extends Restaurant {
  private List<String> salsaVarieties;
  private boolean hasMariachiBand;
  private double spicyLevel;
  private ArrayList<Item> foodItems = new ArrayList<Item>();


  public TacoPlace(String col, String n, String size) {
    super(col, n, size);
    this.cuisineType = "Mexican";
    this.hasMariachiBand = true;
    this.spicyLevel = 0.81;
    this.salsaVarieties = new ArrayList<>();
    this.foodItems.add(new Item("burritos"));
    this.foodItems.add(new Item("beef burritos"));
    this.foodItems.add(new Item("chicken burritos"));
    this.foodItems.add(new Item("steak burritos"));
    this.foodItems.add(new Item("chicken tacos"));
    this.foodItems.add(new Item("steak tacos"));
    this.foodItems.add(new Item("beef tacos"));
    this.foodItems.add(new Item("tortilla chips"));
    this.foodItems.add(new Item("tortilla tacos"));
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

  public void serveMargaritas() {
    print("Enjoy a refreshing margarita at " + this.name + "!");
    print("");
  }

  public void makeSalsa() {
    print("Delicious salsa is being made at " + this.name + "!");
    print("");
    print("nice");
    print("");
  }

}
