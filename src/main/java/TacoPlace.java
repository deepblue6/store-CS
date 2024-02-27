import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TacoPlace extends Restaurant {
  private List<String> salsaVarieties;
  private boolean hasMariachiBand;
  private double spicyLevel;
  private ArrayList<Food> foodItems = new ArrayList<Food>();


  public TacoPlace(String col, String n, String size) {
    super(col, n, size);
    this.cuisineType = "Mexican";
    this.hasMariachiBand = true;
    this.spicyLevel = 0.81;
    this.salsaVarieties = new ArrayList<>();
    this.foodItems.add(new Food("burrito", 5.50));
  }

  public void initializeMenu() {
    Collections.addAll(this.menu, "Extra Cheese Taco", "Double Beef Burrito", "Chicken Burrito", "Steak Burrito",
        "Chicken Tacos", "Steak Taco");
    Collections.addAll(this.salsaVarieties,
        "Mango Salsa", "Pico de Gallo Salsa", "Corn Salsa", "Tomatillo Salsa", "Chile Salsa", "Jal Salsa");
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
