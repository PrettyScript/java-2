package burger_shop;

public class HealthyBurger extends Burger {

    public HealthyBurger(Bread breadRoll, Meat meat, Toppings toppings) {
        super(breadRoll, meat, toppings);
        this.type = "healthy";
    }

    @Override
    public double totalBurgerPrice(Toppings toppings) {

        double price = 3.49;
        int max = 0;


        if(toppings.addLettuce() > 0) {
            price += .50;
            max += 1;
        }
        if(toppings.addTomato() > 0) {
            price += .50;
            max += 1;
        }
        if(toppings.addKetchup() > 0) {
            price += .50;
            max += 1;
        }

        if(max > 4) {
            System.out.println("Sorry you can't have more than 6 toppings on your burger...");
        } else {
            System.out.println("Your total will be $" + price);
        }


        return price;

    }
}
