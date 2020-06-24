package burger_shop;

public class HealthBurger extends Burger {

    public HealthBurger(Bread breadRoll, Meat meat, Toppings toppings) {
        super(breadRoll, meat, toppings);
    }

    @Override
    public double totalBurgerPrice(Toppings toppings) {

        double price = 3.49;


        if(toppings.isLettuce()) {
            price += .50;
        }
        if(toppings.isTomato()) {
            price += .50;
        }
        if(toppings.isKetchup()) {
            price += .50;
        }

        System.out.println("Your total will be $" + price);
        return price;

    }
}
