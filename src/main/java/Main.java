import java.io.BufferedInputStream;
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    private static boolean saysExit = false;
    private static final String EXIT_OPTION = "exit";
    private static double userBalance;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_ORANGE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static Clip clip;  // Store the Clip globally


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!saysExit) {
            String startChoice = askStart();
            if (startChoice.equals("1")) {
                print("Welcome to the clothing store. This section features Gucci and Crocs. Which one do you want to shop at?");
                print("[1] GUCCI");
                print("[2] CROCS");

                String input = scanner.nextLine();

                if (input.equals("1")) {
                    handleGucci();
                } else if (input.equals("2")) {
                    handleCrocs();
                } else if (input.equals("exit")) {
                    break;
                }
            } 
            else if(startChoice.equals("2")) {
                handleRestaurant();
            }
            else if (startChoice.equals("exit")) {
                break;
            }
        }
    }

    private static void handleRestaurant() {
        playMusic("C:/Users/Jules M/Programming/Java/store-CS/src/main/java/fiesta.wav");
        TacoPlace r = new TacoPlace("Blue", "Gucci Drip Swag", "small");
        r.initializeMenu();
        Scanner scanner = new Scanner(System.in);
        print("Which restaurant do you want to go to?");
        print("[1] Taco Place");
        print("[2] Other restaurant");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            print("Welcome to the " + ANSI_RED + "fiesta!" + ANSI_RESET);
            checkStop();  // Play music until user decides to stop
            print("Taco place has a lot of options for food. Which dish do you want to order? We have a lot of options.");
            r.printMenu("Taco Place", r.getMenu());
            findInListRest(r);
        } else if (input.equals("2")) {
            // Handle other restaurant logic here
        } else if (input.equals("exit")) {
            saysExit = true;
        } else {
            print("I could not understand. Could you try again, please?");
        }
    }

    private static void handleGucci() {
        Gucci d = new Gucci("red", "gucci", "string s");
        d.initializeMenu();
        Scanner scanner = new Scanner(System.in);
        print("\nGucci has a lot of marvelous clothes");
        print(ANSI_RED + "[1] Clothes" + ANSI_RESET);
        print("[2] Steal");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            d.printMenu("Gucci", d.getClothes());
            print("Which one do you want to buy?");
            findInList(d);
        }  else if (input.equals("2")) {
            if (d.checkSteal()) {
                saysExit = true;
            } else {
                print("You can't steal anything right now.");
            }
        } else if (input.equals("exit")) {
            saysExit = true;
        } else {
            print("I could not understand. Could you try again please?");
        }
    }

    private static void handleCrocs() {
        Scanner scanner = new Scanner(System.in);
        Crocs croc = new Crocs("Blue", "Gucci Drip Swag", "small");
        croc.initializeMenu();
        print("\nCrocs get you dripped out! What do you want to buy?");
        print(ANSI_RED + "[1] Shoes" + ANSI_RESET);
        print(ANSI_CYAN + "[2] Steal" + ANSI_RESET);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            croc.printMenu("Crocs", croc.getClothes());
            findInList(croc);
        } 
        else if(input.equals("2")) {
            if (croc.checkSteal()) {
                saysExit = true;
            } else {
                print("You can't steal anything right now.");
            }
        }

        else if (input.equals("exit")) {
            System.exit(0);
        } else {
            print("I could not understand. Could you try again please?");
        }
    }

    private static String askStart() {
        print("Welcome to the Super Store Emporium! We have a clothing store and a restaurant. " +
                "Which one do you want to go to? (type 'exit' to end conversation).");
        print("");
        print("[1] Clothing Store");
        print("[2] Restaurant");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals(EXIT_OPTION)) {
            saysExit = true;
            return "";
        } else if (input.equals("1")) {
            return "1";
        } else if (input.equals("2")) {
            return "2";
        } else {
            print("Sorry, we could not understand that.");
            return askStart();
        }
    }

    private static void goBeginning() {
        print("What do you want to buy next?");
        print("");
        print("[1] Clothing Store");
        print("[2] Restaurant");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }

    public static void print(String message) {
        if (message == null || message.trim().isEmpty()) {
            System.out.println("");
        } else {
            System.out.println(message);
        }
    }

    public static void findInList(Clothing st) {
        Scanner inp = new Scanner(System.in);
        if (inp != null) {
            String selectedCloth = inp.nextLine();
            for (int i = 0; i < st.getClothes().size(); i++) {
                Store.Item item = st.getClothes().get(i);
    
                if (item.getName().equals(selectedCloth)) {
                    print("You bought " + selectedCloth + "! Heading back to the main plaza now...");
                    return;
                }
            }
            print("We could not find that item in the clothing store. Heading back to main plaza now...");
        }
    }

    public static void findInListRest(Restaurant st) {
        Scanner inp = new Scanner(System.in);
        if (inp != null) {
            String selectedCloth = inp.nextLine();
            for (int i = 0; i < st.getMenu().size(); i++) {
                Store.Item item = st.getMenu().get(i);
                if (item.getName().equals(selectedCloth)) {
                    print("You bought " +ANSI_GREEN + selectedCloth + ANSI_RESET+"! Heading back to the main plaza now...");
                    return;
                }
            }
            print("We could not find that item in the restaurant. Heading back to main plaza now...");
        }
    }

    //

private static boolean musicPlaying = false;
private static void playMusicHelper(String filePath) {
    try {
        File file = new File(filePath);
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
        AudioInputStream bufferedInputStream = new AudioInputStream(
                new BufferedInputStream(new FileInputStream(file)),
                inputStream.getFormat(),
                inputStream.getFrameLength());

        clip = AudioSystem.getClip();
        clip.open(bufferedInputStream);

        // Add listener to detect when clip finishes playing
        clip.addLineListener(new LineListener() {
            @Override
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (!musicPlaying) {
                        clip.close();  // Close the clip when music stops and not looping
                    }
                }
            }
        });

        clip.start();
        // clip.loop(Clip.LOOP_CONTINUOUSLY);  // Loop the audio continuously

        while (musicPlaying) {
            Thread.sleep(100);  // Adjust the sleep duration as needed
        }
    } catch (Exception e) {
        System.err.println("Error playing music: " + e.getMessage());
        e.printStackTrace();
    }
}

public static void playMusic(final String filePath) {
    musicPlaying = true;
    new Thread(new Runnable() {
        @Override
        public void run() {
            playMusicHelper(filePath);
        }
    }).start();
}

public static void stopMusic() {
    musicPlaying = false;
    if (clip != null && clip.isRunning()) {
        clip.stop();
    }
}

public static void checkStop() {
    // Check if music is not already playing
    if (!musicPlaying) {
        // Play music only if it's not already playing
        playMusic("C:/Users/Jules M/Programming/Java/store-CS/src/main/java/fiesta.wav");

        // Set a flag to indicate that music is currently playing
        musicPlaying = true;

        Scanner scanner = new Scanner(System.in);
        print("Type 'stop' to stop the music:");

        // Continue checking for user input until 'stop' is entered
        while (true) {
            String stopInput = scanner.nextLine();
            if (stopInput.equalsIgnoreCase("stop")) {
                stopMusic();
                // Reset the flag after stopping the music
                musicPlaying = false;
                break;
            }
        }
    } else {
        Scanner scanner = new Scanner(System.in);
        print("Music is already playing. Please wait until it finishes or type 'stop' to stop it.");
        String input3 = scanner.nextLine(); {
            if (input3.equalsIgnoreCase("stop")) {
                stopMusic();
                // Reset the flag after stopping the music
                musicPlaying = false;
            }
        }
    }
}


      
}
