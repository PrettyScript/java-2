package burger_shop;

class DeluxeBurger extends Burger {


    public DeluxeBurger(Bread breadRoll, Meat meat, Toppings toppings) {
        super(breadRoll, meat, toppings);
        this.type = "Deluxe";
        this.maxToppings = 6;
    }

    public double totalBurgerPrice(Toppings toppings, int bacon, int extraCheese, int extraMeat) {
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
        if(toppings.addCheese() > 0) {
            price += .75;
            max += 1;
        }
        if(toppings.addPickles() > 0) {
            price += .50;
            max += 1;
        }
        if(bacon > 0) {
            price += 1.20;
            max += 1;
        }
        if(extraCheese > 0) {
            price += 1.50;
            max += 1;
        }
        if(extraMeat > 0) {
            price += 2.25;
            max += 1;
        }

        if(max > 6) {
            System.out.println("Sorry you can't have more than 6 toppings on your burger...");
        } else {
            System.out.println("Your total will be $" + price);
        }

        return price;
    }
}
