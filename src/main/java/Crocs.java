import java.util.ArrayList;

public class Crocs extends Clothing{
  private String percentStyle;
  private ArrayList<Item> clothes;
  private ArrayList<Item> charms;
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

 public ArrayList<Item> getCharms() {
        return this.charms;
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
      clothes.add(new Item("Mator Crocs", 49.99));
      clothes.add(new Item("Lightning McQueen Crocs", 59.99));
      clothes.add(new Item("green crocs", 39.99));
      clothes.add(new Item("Blue crocs", 44.99));
      clothes.add(new Item("pink crocs", 34.99));
      clothes.add(new Item("purple crocs", 54.99));

      charms.add(new Item("Micky Mouse", 9.99));
      charms.add(new Item("Crocodile", 8.99));
      charms.add(new Item("Utsav", 7.99));
      charms.add(new Item("SpongeBob", 6.99));
      charms.add(new Item("Rock", 5.99));
      charms.add(new Item("Stick", 4.99));
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

public ArrayList<Item> getClothes() {
  return this.clothes;
}

  ////
  ////
  ////
  ////

}