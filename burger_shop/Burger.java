package burger_shop;

public class Burger {
    private Bread breadRoll;
    private Meat meat;
    private Toppings toppings;
    private double price;
    public String type;

    public Burger(Bread breadRoll, Meat meat, Toppings toppings) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.toppings = toppings;
        this.price = price;
        this.type = "plain";
    }

    public Bread getBreadRoll() {
        return breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }


    public void getPlainBurgerPrice() {
        System.out.println("Basic burger: $3.49");
    }


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
        if(toppings.addCheese() > 0) {
            price += .75;
            max += 1;
        }
        if(toppings.addKetchup() > 0) {
            price += .50;
            max += 1;
        }

        if(max > 2) {
            System.out.println("Sorry you can only have two toppings on your burger...");
        } else {
            System.out.println("Your total will be $" + price);
        }

        return price;
    }


}
