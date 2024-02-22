import java.util.ArrayList;

public class Crocs extends Clothing{
  private String percentStyle;
  private ArrayList<CrocItem> clothes;
  private ArrayList<CharmItem> charms;
  private String charm;
  ///
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_ORANGE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public Crocs(String c,String n, String s) {
    super(c, "Crocs", s);
    this.clothingType = "shoe";
    this.charms = new ArrayList<>();
    this.clothes = new ArrayList<>();
  }

  public String getCharm(){
    return ""+charm; 
     }
  public void setCharm(String c){
     this.charm =  c; 
   }
  public String getPercentStyle(){
     return percentStyle; 
   }
  public void setPercentStyle(String pS){
   this.percentStyle =  pS; 
  }
  
 
    public void printStore() {
      print(this.name + " is a " + this.size + " " + this.color + " " + this.clothingType);
      print("");
    }

    public void printShoe() {
      print("You have a " + ""+this.charm + " on your shoe!");
      print("");
    }

    public void initializeMenu() {
      clothes.add(new CrocItem("Mator Crocs", 49.99));
      clothes.add(new CrocItem("Lightning McQueen Crocs", 59.99));
      clothes.add(new CrocItem("green crocs", 39.99));
      clothes.add(new CrocItem("Blue crocs", 44.99));
      clothes.add(new CrocItem("pink crocs", 34.99));
      clothes.add(new CrocItem("purple crocs", 54.99));

      charms.add(new CharmItem("Mango Salsa", 9.99));
      charms.add(new CharmItem("Pico de Gallo Salsa", 8.99));
      charms.add(new CharmItem("Corn Salsa", 7.99));
      charms.add(new CharmItem("Tomatillo Salsa", 6.99));
      charms.add(new CharmItem("Chile Salsa", 5.99));
      charms.add(new CharmItem("Jal Salsa", 4.99));
  }
    
  public String PStyle(){
    int b;
    String ans = "";
    while(true){
      int a = (int)(Math.random() * (100 - 1) + 1) ;
      if(a>50 == true){
        b = a;
        break;
      }
      
    }
    ans = b + "%";
   return ans; 
  }

  public void attachRandomCharm() { // attaches random charm
        int randomIndex = (int) (Math.random() * charms.size());
        this.setCharm(""+this.charms.get(randomIndex));
        print("You now have "+ ANSI_PURPLE+this.getCharm() + ANSI_RESET +" on your Crocs!");
}

public ArrayList<CrocItem> getClothes() {
  return this.clothes;
}

  ////
  ////
  ////
  ////
  private static class CharmItem {
    private String name;
    private double price;

    public CharmItem(String name, double price) {
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
 private static class CrocItem {
  private String name;
  private double price;

  public CrocItem(String name, double price) {
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