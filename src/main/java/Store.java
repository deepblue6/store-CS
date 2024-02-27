import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Store {
  protected String color = "";
  protected String name = "";
  protected String size = "";
  protected String item = "";
  protected double price = 0.0;

  public void FoodItem(String item, double price) {
    this.item = item;
    this.price = price;
  }

  public Store(String c, String n, String s) {
    color = c;
    name = n;
    size = s;
  }

  public String getItem() {
    return item;
  }

  public double getPrice() {
    return price;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public void setColor(String c) {
    color = c;
  }

  public void setName(String n) {
    name = n;
  }

  public void setSize(String s) {
    size = s;
  }

  public void deductMoney(Item item) {
    if(this.price - item.getPrice() < 0) {
      print("You cannot buy this because you cannot afford it.");
      print("");
    }
    else {
      this.price -= item.getPrice();
    }
  }

  public <T> void printMenu(String menuName, ArrayList<T> arrList) {
    print("Menu for " + menuName + ": ");
    for (T item : arrList) {
        print(item.toString());
    }
}

public void print(String message) {
  if (message == null || message.trim().isEmpty()) {
      System.out.println(""+message);
  } else {
      System.out.println(message);
  }
}

public double randMoney(String storeType) {
  double baseAmount;
  double moneyRange;
  double randomMoney = 0.0;

    if(storeType.equalsIgnoreCase("clothing")) {
    double randomDecimal = Math.random();
    randomMoney = randomDecimal * 100 + 50;
    randomMoney = Math.round(randomMoney * 100.0) / 100.0;
    }
    else if(storeType.equalsIgnoreCase("restaurant")) {
      double randomDecimal = Math.random();
      randomMoney = randomDecimal * 100 + 50;
      randomMoney = Math.round(randomMoney * 100.0) / 100.0;
    }
    return Math.round(randomMoney * 100.0) / 100.0;
 }
//////
////
///


public static class Item {
  private String name;
  private double price;

  public Item(String name, double price) {
      this.name = name;
      this.price = price;
  }

  public String getName() {
      return name;
  }

  public double getPrice() {
      return price;
  }

  @Override
  public String toString() {
      return name + " - $" + price;
  }

}


}
