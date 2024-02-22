import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Clothing extends Store{
protected ArrayList<String> clothes = new ArrayList<String>();
protected boolean steal;
protected String clothingType; 
protected String buy;
protected double money;

  public Clothing(String c, String n, String s){
     super(c,n,s);
     this.money = money;
  }
    public void printClothing() {
      System.out.println(this.name + " is a " + this.size + " " + this.color + " " + this.clothingType + " establishment.");
    }

    public boolean checkClothing(String Clothes){
      boolean b = false; 
      String a = Clothes.toLowerCase();
      for( String c : this.clothes){
        if(c.toLowerCase().contains(a)){
          b = true;
        }
      }
      return b; 
    }

  public boolean getSteal() {
    return steal;
  }

  public void setSteal(boolean aSteal) {
    this.steal = aSteal;
  }

  public String getBuy(){
    return buy; 
  }
  
  public void setBuy(String b){
    this.buy = b; 
  }
  
  public void checkSteal() {
    if ((Math.random()) * (100 - 1) + 1 > 50) {
      this.setSteal(true);
      System.out.println("Uh-oh! Utsav stole your " + this.name + " to flip it on ebay!");
      System.out.println();
    } else {
      System.out.println("Your " + this.name + " survived another day from the clutches of the most heinous villian UTSAV!");
      System.out.println();
    }
  }
}