package burger_shop.Main;

import burger_shop.*;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Toppings toppings = new Toppings(1, 1, 0 , 0, 1, 1, 1);
        Bread bread = new Bread("white");
        Meat meat = new Meat ("beef");
        Burger plainBurger = new Burger(bread, meat, toppings);
        Side sides = new Side(1, 1);
        Order order = new Order(plainBurger, bread, meat);

        Drink drink = new Drink("Lemonade");
        Side side = new Side(1,0);
        Meal meal = new Meal(plainBurger, drink, side);
        Order order2 = new Order(meal);

        Toppings deluxeToppings = new Toppings(1, 1, 1, 0, 4, 0, 0);
        DeluxeBurger deluxeBurger = new DeluxeBurger(bread, meat, deluxeToppings);
        Order order3 = new Order(deluxeBurger, bread, meat);
        Side side2 = new Side(1, 0);


        order.addToppings(toppings);
        order.addBurger(plainBurger);
        order.addSide(sides);
        order.addDrink(drink);
        order.purchaseOrder();
        System.out.println("=============================================");
        order2.purchaseOrder();
        System.out.println("=============================================");

        order3.addToppings(deluxeToppings);
        order3.addBurger(deluxeBurger);
        order3.addSide(side2);
        order3.addDrink(drink);
        order3.purchaseOrder();

    }
}
