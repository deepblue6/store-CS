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


public class Gucci extends Clothing{
  private boolean drippedOut; 
  private ArrayList<String> goodie;
  private String goods; 

  public Gucci(String c,String n, String s) {
    super(c, "Gucci", s);
    this.clothingType = "Designer";
    drippedOut = true; 
    this.goodie = new ArrayList<String>();

  }
    public void printDrip() {
      print(this.name + " is a " + this.size + " " + this.color + " " + this.clothingType + " clothing store");
         
      print("");
    }
    
  public void initializeMenu() {
    Collections.addAll(this.clothes, "Gucci Belt Bag", "Sweater", "Zip up Jacket", "Track Pants",
        "BackPack", "Socks");
    Collections.addAll(this.goodie,
        "Mango Salsa", "Pico de Gallo Salsa", "Corn Salsa", "Tomatillo Salsa", "Chile Salsa", "Jal Salsa");
  }
  
  
}