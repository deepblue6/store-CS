import java.util.ArrayList;

public class Crocs extends Clothing{
  private String percentStyle;
  private ArrayList<Item> clothes;
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
    this.clothes = new ArrayList<>();
  }

    public void initializeMenu() {
      clothes.add(new Item("Mator Crocs"));
      clothes.add(new Item("Lightning McQueen Crocs"));
      clothes.add(new Item("green crocs"));
      clothes.add(new Item("Blue crocs"));
      clothes.add(new Item("pink crocs"));
      clothes.add(new Item("purple crocs"));
  }

public ArrayList<Item> getClothes() {
  return this.clothes;
}

}