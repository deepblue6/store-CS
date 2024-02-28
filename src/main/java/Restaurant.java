import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Restaurant extends Store {
  protected String cuisineType;
  private boolean hasFoodPoisoning;
  protected ArrayList<String> menu = new ArrayList<String>();
  protected double price;
  private ArrayList<Item> foodItems = new ArrayList<Item>();

  public Restaurant(String col, String n, String size) {
    super(col, n, size);
  }


  public void printObject() {
    print(this.name + " is a " + this.size + " " + this.color + " " + this.cuisineType + " restaurant.");
  }

  public boolean checkFood(String food) {
    String lowerCaseFood = food.toLowerCase();
    for (String menuItem : this.menu) {
      if (menuItem.toLowerCase().contains(lowerCaseFood)) {
        return true;
      }
    }
    return false;
  }

  public ArrayList<Item> getMenu() {
    return this.foodItems;
  }

  public boolean hasFoodPoisoning() {
    return hasFoodPoisoning;
  }

  public void setFoodPoisoning(boolean hasFoodPoisoning) {
    this.hasFoodPoisoning = hasFoodPoisoning;
  }

  public void serveAlchohol() {
    print("Enjoy a refreshing beer at " + this.name + "!");
    print("");
  }

  public void checkFoodPoisining() {
    if ((Math.random()) * (100 - 1) + 1 > 70) {
      this.setFoodPoisoning(true);
      print("Uh-oh! There may be an issue with the food at " + this.name + ".");
      print("");
    } else {
      print("The food at " + this.name + " is safe.");
      print("");
    }
  }
}