package burger_shop;

public class DeluxeBurger extends Burger {

    private boolean bacon;
    private boolean extraCheese;
    private boolean extraMeat;

    public DeluxeBurger(Bread breadRoll, Meat meat, Toppings toppings, boolean bacon, boolean extraCheese, boolean extraMeat) {
        super(breadRoll, meat, toppings);
        this.bacon = bacon;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
    }


    public double totalBurgerPrice(Toppings toppings, boolean bacon, boolean extraCheese, boolean extraMeat) {
        double price = 3.49;
        int max = 0;


        if(toppings.isLettuce()) {
            price += .50;
            max += 1;
        }
        if(toppings.isTomato()) {
            price += .50;
            max += 1;
        }
        if(toppings.isCheese()) {
            price += .75;
            max += 1;
        }
        if(toppings.isKetchup()) {
            price += .50;
            max += 1;
        }
        if(bacon) {
            price += 1.20;
            max += 1;
        }
        if(extraCheese) {
            price += 1.50;
            max += 1;
        }
        if(extraMeat) {
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
