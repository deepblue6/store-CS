import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Store {
  protected String color = "";
  protected String name = "";
  protected String size = "";
  protected String item = "";

  public void FoodItem(String item, double price) {
    this.item = item;
    }

  public Store(String c, String n, String s) {
    color = c;
    name = n;
    size = s;
  }

  public String getItem() {
    return item;
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

//////
////
///


public static class Item {
  private String name;

  public Item(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  @Override
  public String toString() {
      return name + " - ";
  }

}


}
