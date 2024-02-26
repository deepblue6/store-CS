import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userBalance = getRandomCashAmount();
        String startChoice = askStart();

        while (!saysExit) {
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
            } else if (startChoice.equals("exit")) {
                break;
            }
        }
    }

    private static double getRandomCashAmount() {
        return 50 + Math.random() * (10000 - 50);
    }

    private static void handleGucci() {
        Gucci d = new Gucci("red", "gucci", "string s");
        d.initializeMenu();
        Scanner scanner = new Scanner(System.in);
        print("\nGucci has a lot of marvelous clothes and bags at extremely affordable prices for all. What are you interested in today? You have " + d.randMoney("clothing") + "$. If you're too broke, you can try to steal something.");
        print(ANSI_RED + "[1] Clothes" + ANSI_RESET);
        print(ANSI_CYAN + "[2] Bags" + ANSI_RESET);
        print("[3] Steal");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            d.printMenu("Gucci", d.getClothes());
            print("Which one do you want to buy?");
            Scanner inp = new Scanner(System.in);

            if (inp != null) {
                String selectedCloth = inp.nextLine();
                for (Store.Item item : d.getClothes()) {
                    if (item.getName().equals(selectedCloth)) {
                        double price = item.getPrice();
                        print("The price of " + selectedCloth + " is: " + price + "$");
                        break;
                    }
                }
            }
        } else if (input.equals("2")) {
            d.printMenu("Gucci", d.getBags());
        } else if (input.equals("3")) {
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
        print(ANSI_CYAN + "[2] Charms" + ANSI_RESET);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            croc.printMenu("Crocs", croc.getClothes());
            print("What do you want to buy? You have " + croc.randMoney("clothing") + "$");
        } else if (input.equals("2")) {
            print("");
        } else if (input.equals("exit")) {
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
}
