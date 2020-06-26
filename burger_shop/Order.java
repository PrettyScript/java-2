package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Order {
    private Burger burger;
    private Bread bread;
    private Meat meat;
    private Meal meal;
    private Toppings toppings;
    private Drink drink;
    private int max = 0;
    private double price = 3.49;
    private double mealPrice = 7.43;
    public String type;
    ArrayList<String> toppingsList = new ArrayList<>();
    ArrayList<String> sidesList = new ArrayList<>();


    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
        this.type = "à la carte";
    }

    public Order(Meal meal) {
        this.meal = meal;
        this.type = "meal";
    }

    public void addToppings(Toppings toppings) {

        if(toppings.addLettuce() > 0) {
            price += .50;
            max += 1;
            toppingsList.add("lettuce");
        }
        if(toppings.addTomato() > 0) {
            price += .50;
            max += 1;
            toppingsList.add("tomato");
        }
        if(toppings.addCheese() > 0) {
            price += .75;
            max += 1;
            toppingsList.add("cheese");
        }
        if(toppings.addKetchup() > 0) {
            price += .50;
            max += 1;
            toppingsList.add("ketchup");
        }
        if(toppings.addBacon() > 0) {
            price += 1.20;
            max += 1;
            toppingsList.add("bacon");
        }
        if(toppings.addExtraCheese() > 0) {
            price += 1.50;
            max += 1;
            toppingsList.add("extra cheese");
        }
        if(toppings.addExtraMeat() > 0) {
            price += 2.25;
            max += 1;
            toppingsList.add("extra meat");
        }

    }


    private String summaryOfToppings(ArrayList<String> toppingsList) {
        String toppings = "";
        for(int i=0; i<toppingsList.size(); i++) {
            toppings += (toppingsList.get(i) + " ");
        }
        return toppings;
    }

    public void addBurger(Burger burger) {
        switch (burger.type) {
            case "plain":
                System.out.println(burger.type + " burger was added to your order");
                if (max > 2) {
                    System.out.println("Sorry you can only have two toppings on your burger...");
                    price = 0;
                    toppingsList.clear();
                }
                break;
            case "healthy":
                System.out.println(burger.type + " burger was added to your order");
                if (max > 4) {
                    System.out.println("Sorry you can only have four toppings on your burger...");
                    price = 0;
                    toppingsList.clear();
                }
                break;
            case "deluxe":
                System.out.println(burger.type + " burger was added to your order");
                if (max > 6) {
                    System.out.println("Sorry you can only have six toppings on your burger...");
                    price = 0;
                    toppingsList.clear();
                }
                break;
            default:
                System.out.println("Sorry, " + burger + " burger is not available but we do have\n" +
                        "'Plain', 'Healthy', and the 'Deluxe' burgers as options.");
                break;
        }

    }

    public void addSide(Side side) {
        if(side.addFries() > 0) {
            System.out.println("Fries have been added to your order.");
            price += 0.75;
            sidesList.add("fries");
        }
        if(side.addMacAndCheese() > 0) {
            System.out.println("Macaroni and Cheese have been added to your order.");
            price += 1.25;
            sidesList.add("mac and cheese");
        }
    }

    private String summaryOfSides(ArrayList<String> sidesList) {
        String sides = "";
        for(int i=0; i<sidesList.size(); i++) {
            sides += sidesList.get(i) + " ";
        }
        return sides;
    }

    public void addDrink(Drink drink) {
        drink.getName();
    }

    public void purchaseOrder() {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
            if(this.type.equals("meal")) {
                System.out.println("You ordered a meal with a burger, a side and a drink. Your total will be $" + decimalFormat.format(mealPrice));
            }
            if(this.type.equals("à la carte")) {
                if(toppingsList.isEmpty()) {
                    System.out.println("Unfortunately, we couldn't process your burger order, but you have an à la carte order of " + summaryOfSides(sidesList) +
                            "with a drink. Your total will be $" + decimalFormat.format(price));
                } else {
                    System.out.println("You ordered a " + burger.type + " burger with " + meat.getMeat() + " on " + bread.getBread() +
                            " bread and, the following toppings: " + summaryOfToppings(toppingsList) +
                            "your total will be $" + decimalFormat.format(price));
                }

            }

    }

}
