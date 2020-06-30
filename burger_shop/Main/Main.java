package burger_shop.Main;

import burger_shop.*;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application


        Scanner scanner = new Scanner(System.in);
        Order order = null;

        String name = greeting();

        int optionSelected = scanner.nextInt();

        if(optionSelected == 1){
            System.out.println("Great, our meal comes with a burger, side, and a drink. Would you like to see our menu? [ Y or N ]:");
            String viewMenu = scanner.next();
            if(viewMenu.toLowerCase().equals("y")){
                printMenu();
            }
            order = Order.createMeal();
        }
        else if(optionSelected == 2) {
            System.out.println("You can customize your order to your liking. Would you like to see our menu? [ Y or N ]:");
            String viewMenu = scanner.next();
            if(viewMenu.toLowerCase().equals("y")){
                printMenu();
            }
            order = Order.createALaCarte();
        }

        order.purchaseOrder(name);

    }

    public static String greeting(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bills Burgers!");
        System.out.print("Can I have a name for this order? ");
        String customerName = scanner.nextLine();
        System.out.println("Hi, " + customerName + " what would you like to order today?");
        System.out.println("\n Would you like a meal or à la carte? ");
        System.out.println("1. meal\n" +
                "2. à la carte");

        return customerName;
    }

    public static void printMenu() {
        System.out.println("Here's our menu, take a look and let me know what you would like?");
        System.out.println("============== MENU ==============");

        System.out.println("**** Burgers ****");
        System.out.println(   "Plain burger (2 max toppings) ------------------- $3.49\n"
                            + "Healthy burger (4 max toppings) ----------------- $3.49\n"
                            + "Deluxe burger (6 max toppings) ------------------ $3.49");

        System.out.println("\n**** Sides ****");
        System.out.println( "Fries ------------------- $0.75\n" +
                            "Mac & Cheese ------------ $1.25\n" +
                            "Mashed Potatoes --------- $1.25\n" +
                            "Corn -------------------- $1.05\n" +
                            "Sweet Potato Fries ------ $2.25");

        System.out.println("\n**** Drinks ****");
        System.out.println( "Soda ------------------- $2.99\n" +
                            "Vanilla Milkshake ------ $4.99\n" +
                            "Chocolate Milkshake ---- $4.99");
        System.out.println("==================================");
    }


}
