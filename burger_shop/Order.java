package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private Burger burger = null;
    private Bread bread;
    private Meat meat;
    private Meal meal;
    private Toppings toppings;
    private Drink drink;
    private int toppingMax = 0;
    private int toppingCount = 0;
    private int sideMax = 0;
    private double price = 0;
    private double baseBurgerPrice = 3.49;
    private double mealPrice = 7.43;
    private boolean invalidBurger = false;
    public String type;
    ArrayList<String> toppingsList = new ArrayList<>();
    ArrayList<String> sidesList = new ArrayList<>();


    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
        this.type = "à la carte";
        this.price += baseBurgerPrice;
        this.toppingMax = burger.maxToppings;
    }

    public Order(Meal meal) {
        this.meal = meal;
        this.type = "meal";
        this.price = mealPrice;
        this.toppingMax = meal.maxToppings;
    }

    public void addToppings(Toppings toppings) {

        if(toppings.addLettuce() > 0 && toppingCount < toppingMax) {
            if(toppings.addLettuce() > 1) {
                toppingsList.add("extra lettuce");
                price += (.50 * 2);
            } else {
                price += .50;
                toppingsList.add("lettuce");
            }
            if(toppings.addLettuce() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x lettuce to your burger.");
            }
            toppingCount ++;
        }
        if(toppings.addTomato() > 0 && toppingCount < toppingMax) {
            if(toppings.addTomato() > 1) {
                toppingsList.add("extra tomato");
                price += (.50 * 2);
            } else {
                price += .50;
                toppingsList.add("tomato");
            }
            if(toppings.addTomato() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x tomatoes to your burger.");
            }
            toppingCount ++;
        }
        if(toppings.addCheese() > 0 && toppingCount < toppingMax) {
            if(toppings.addCheese() > 1) {
                toppingsList.add("extra cheese");
                price += (.75 * 2);
            } else {
                price += .75;
                toppingsList.add("cheese");
            }
            if(toppings.addCheese() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x cheese to your burger.");
            }
            toppingCount ++;
        }
        if(toppings.addPickles() > 0 && toppingCount < toppingMax) {
            if(toppings.addPickles() > 1) {
                toppingsList.add("extra pickles");
                price += (.50 * 2);
            } else {
                price += .50;
                toppingsList.add("pickles");
            }
            if(toppings.addPickles() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x pickles to your burger.");
            }
            toppingCount ++;
        }
        if(toppings.addBacon() > 0 && toppingCount < toppingMax) {
            if(toppings.addBacon() > 1) {
                toppingsList.add("extra bacon");
                price += (1.20 * 2);
            } else {
                price += 1.20;
                toppingsList.add("bacon");
            }
            if(toppings.addBacon() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x bacon to your burger.");
            }
            toppingCount ++;
        }
        if(toppings.addAvocado() > 0 && toppingCount < toppingMax) {
            if(toppings.addAvocado() > 1) {
                toppingsList.add("extra avocado");
                price += (1.50 * 2);
            } else {
                price += 1.50;
                toppingsList.add("avocado");
            }
            if(toppings.addAvocado() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x avocado to your burger.");
            }
            toppingCount ++;
        }
        if(toppings.addOnions() > 0 && toppingCount < toppingMax) {
            if(toppings.addOnions() > 1) {
                toppingsList.add("extra onions");
                price += (2.25 * 2);
            } else {
                price += 2.25;
                toppingsList.add("onions");
            }
            if(toppings.addOnions() > 2) {
                System.out.println("We only allow double toppings. Adding 2 x onions to your burger.");
            }
            toppingCount ++;
        }

        // logic not working like I would like, will work on at a later date
//        if(toppingCount >= toppingMax) {
////            System.out.println("Sorry you can only have " + toppingMax + " toppings on your " + burger.type + " burger...");
//            System.out.println("topping count: " + toppingCount);
//            System.out.println("topping max: " + toppingMax);
//        }

    }

    public void addBurger(Burger burger) {
        this.burger = burger;
        System.out.println(burger.type + " burger was added to your order");
    }

    public void addSide(Side side) {

        if (side.addFries() > 0 && sideMax < 3) {
            System.out.println("Fries have been added to your order.");
//            price += (0.75 * side.addFries());
            sidesList.add(side.addFries() + " x fries");
            sideMax++;
        }
        if (side.addMacAndCheese() > 0 && sideMax < 3) {
            System.out.println("Macaroni and Cheese have been added to your order.");
//            price += (1.25 * side.addMacAndCheese());
            sidesList.add(side.addMacAndCheese() + " x mac and cheese");
            sideMax++;
        }
        if (side.addMashedPotatoes() > 0 && sideMax < 3) {
            System.out.println("Mashed Potatoes have been added to your order.");
//            price += (1.25 * side.addMashedPotatoes());
            sidesList.add(side.addMashedPotatoes() + " x mashed potatoes");
            sideMax++;
        }
        if (side.addCorn() > 0 && sideMax < 3) {
            System.out.println("Corn have been added to your order.");
//            price += (1.05 * side.addCorn());
            sidesList.add(side.addCorn() + " x corn");
            sideMax++;
        }
        if (side.addSweetPotatoFries() > 0 && sideMax < 3) {
            System.out.println("Sweet Potato Fries have been added to your order.");
//            price += (2.25 * side.addSweetPotatoFries());
            sidesList.add(side.addSweetPotatoFries() + " x sweet potato fries");
            sideMax++;
        }
        if(sideMax > 3) {
            System.out.println("Sorry, meals can only have 3 sides.");
        }
    }

    public void addDrink(Drink drink) {
        this.drink = drink;
//        this.price += drink.getPrice();
    }

    private String summaryOfSides() {
        String sides = "";
        String separator = ", ";
        for(int i=0; i<sidesList.size(); i++) {
            if(i == sidesList.size() - 1){separator = "";}
            sides += sidesList.get(i) + separator;
        }
        return sides;
    }

    private String summaryOfToppings(ArrayList<String> toppingsList) {
        String toppings = "";
        String separator = ", ";
        for(int i=0; i<toppingsList.size(); i++) {
            if(i == toppingsList.size() - 1){
                separator = "";
            }
            toppings += (toppingsList.get(i) + separator);
        }
        return toppings;
    }

    public void purchaseOrder(String name) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if(this.type.equals("meal")) {
            System.out.println("**********************************************************************");
            System.out.println("*                              Receipt                               *");
            System.out.println("**********************************************************************");
            System.out.println("Burger: "+ (invalidBurger ? "" : burger.type + " Burger on "+ burger.getBreadRoll().getBread() + " Bread with "+ burger.getMeat().getMeat() + " Meat"));
            System.out.println("Toppings: "+summaryOfToppings(toppingsList));
            System.out.println("Sides: "+summaryOfSides());
            System.out.println("Drink: "+drink.getName());
            System.out.println("**********************************************************************");
            System.out.println("Total: "+ decimalFormat.format(price));
            System.out.println("**********************************************************************");
            System.out.println("Please see order summary above for additional details.");
            System.out.println(name + ", Thank you for fulfilling your hunger needs with Bill's Burgers, where your Burger fits our Bill.");
        }
        if(this.type.equals("à la carte")) {
            if(invalidBurger) {
                System.out.print("Unfortunately, we couldn't process your burger order, as you have exceeded the topping limit ");

            } else {
                System.out.println("**********************************************************************");
                System.out.println("*                              Receipt                               *");
                System.out.println("**********************************************************************");
                System.out.println("Burger: "+ (invalidBurger ? "" : burger.type + " Burger on "+burger.getBreadRoll().getBread() + " Bread with "+ burger.getMeat().getMeat() + " Meat"));
                System.out.println("Toppings: "+summaryOfToppings(toppingsList));
                System.out.println("**********************************************************************");
                System.out.println("Total: "+ decimalFormat.format(price));
                System.out.println("**********************************************************************");
                System.out.println("Please see order summary above for additional details.");
                System.out.println(name + ", Thank you for fulfilling your hunger needs with Bill's Burgers, where your Burger fits our Bill.");
            }
        }
    }

    public static Order createMeal(){

        int burgerOption = getBurgerOption();
        Bread bread = selectBread(getBreadOption());
        Meat meat = selectMeat(getMeatOption());
        Toppings toppings = selectToppings(getToppingOptions());
        Burger burger = createBurger(burgerOption, bread, meat, toppings);
        Side side = selectSides(getSideOptions());
        Drink drink = selectDrink(getDrinkOptions());
        Meal meal = new Meal(burger, drink, side);

        System.out.println("=========================== Order Summary ============================");
        Order order = new Order(meal);
        order.addToppings(toppings);
        order.addBurger(burger);
        order.addSide(side);
        order.addDrink(drink);


        return order;
    }

    public static Order createALaCarte(){

        int burgerOption = Order.getBurgerOption();
        Bread bread = Order.selectBread(Order.getBreadOption());
        Meat meat = Order.selectMeat(Order.getMeatOption());
        Toppings toppings = Order.selectToppings(Order.getToppingOptions());
        Burger burger = Order.createBurger(burgerOption, bread, meat, toppings);

        System.out.println("=========================== Order Summary ============================");
        Order order = new Order(burger, bread, meat);
        order.addToppings(toppings);
        order.addBurger(burger);

        return order;
    }

    public static int getBurgerOption(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nWhich burger option would you like?");
        System.out.println( "1. Plain Burger\n" +
                "2. Healthy Burger\n" +
                "3. Deluxe Burger");
        return scanner.nextInt();
    }

    public static int getBreadOption(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of bread would you like?");
        System.out.println( "1. White\n" +
                "2. Wheat\n" +
                "3. Multigrain\n" +
                "4. Italian Herbs and Cheese");
        return scanner.nextInt();
    }

    public static int getMeatOption(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of meat would you like?");
        System.out.println( "1. Beef\n" +
                "2. Chicken\n" +
                "3. Steak\n" +
                "4. Turkey");
        return scanner.nextInt();
    }

    public static String[] getToppingOptions(){
        Scanner scanner = new Scanner(System.in);

        System.out.println( "What kind of toppings would you like? [ ONLY Single or Double quantities are accepted. Enter a number multiple times to increase the quantity. ]\n" +
                "Items must be separated by a space (e.g. '1 1 2' -> extra lettuce and single tomato)");
            System.out.println( "1. Lettuce\n" +
                    "2. Tomato\n" +
                    "3. Cheese\n" +
                    "4. Pickles\n" +
                    "5. Bacon\n" +
                    "6. Avocado\n" +
                    "7. Onions");

        String toppingOptions = scanner.nextLine();
        return toppingOptions.split(" ");
    }

    public static String[] getSideOptions(){
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Which sides would you like? [ Choose as many as you'd like. Enter a number multiple times to add multiple to order. ]\n" +
                "Items must be separated by a space i.e. '1 1 2'");
        System.out.println( "1. Fries\n" +
                "2. Mac n Cheese\n" +
                "3. Mashed Potatoes\n" +
                "4. Corn\n" +
                "5. Sweet Potato Fries");

        String sideOptions = scanner.nextLine();
        return sideOptions.split(" ");
    }

    public static int getDrinkOptions(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose any drink from the list below:");
        System.out.println( "1. Soda\n" +
                "2. Vanilla Milkshake\n" +
                "3. Chocolate Milkshake");
        return scanner.nextInt();
    }

    public static Bread selectBread(int breadOption){
        Bread bread;
        switch (breadOption){
            case 1:
                bread = new Bread("White");
                break;
            case 2:
                bread = new Bread("Wheat");
                break;
            case 3:
                bread = new Bread("Multigrain");
                break;
            case 4:
                bread = new Bread("Italian Herbs and Cheese");
                break;
            default:
                bread = new Bread("White");
        }
        return bread;
    }

    public static Meat selectMeat(int meatOption){
        Meat meat;
        switch (meatOption){
            case 1:
                meat = new Meat("Beef");
                break;
            case 2:
                meat = new Meat("Chicken");
                break;
            case 3:
                meat = new Meat("Steak");
                break;
            case 4:
                meat = new Meat("Turkey");
                break;
            default:
                meat = new Meat("Beef");
        }
        return meat;
    }

    public static Side selectSides(String[] sideOptions){
        Side sides;
        int fries = 0, mac = 0, mashedPotatoes = 0, corn = 0, sweetPotatoFries = 0;

        for(String side: sideOptions){
            if(side.equals("1")){
                fries ++;
            }
            if(side.equals("2")){
                mac ++;
            }
            if(side.equals("3")){
                mashedPotatoes ++;
            }
            if(side.equals("4")){
                corn ++;
            }
            if(side.equals("5")){
                sweetPotatoFries ++;
            }
        }
        sides = new Side(fries, mac, mashedPotatoes, corn, sweetPotatoFries);
        return sides;
    }

    public static Drink selectDrink(int drinkOption){
        Drink drink;
        switch (drinkOption){
            case 1:
                drink = new Drink("Soda", 2.99);
                break;
            case 2:
                drink = new Drink("Vanilla Milkshake", 4.99);
                break;
            default:
                drink = new Drink("Chocolate Milkshake", 4.99);
        }
        return drink;
    }

    public static Toppings selectToppings(String[] toppingsOptions){

        int lettuce = 0, tomato = 0, cheese = 0, pickles = 0, bacon = 0, avocado = 0, onions = 0;

        for(String topping: toppingsOptions){
            if(topping.equals("1")){
                lettuce++;
            }
            if(topping.equals("2")){
                tomato++;
            }
            if(topping.equals("3")){
                cheese++;
            }
            if(topping.equals("4")){
                pickles++;
            }
            if(topping.equals("5")){
                bacon++;
            }
            if(topping.equals("6")){
                avocado++;
            }
            if(topping.equals("7")){
                onions++;
            }
        }

        return new Toppings(lettuce, tomato, cheese, pickles, bacon, avocado, onions);
    }

    public static Burger createBurger(int burgerOption, Bread bread, Meat meat, Toppings toppings) {

        switch (burgerOption){
            case 1:
                return new Burger(bread, meat, toppings);
            case 2:
                return new HealthyBurger(bread, meat, toppings);
            case 3:
                return new DeluxeBurger(bread, meat, toppings);
            default:
                return new Burger(bread, meat, toppings);
        }
    }
}
