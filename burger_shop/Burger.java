package burger_shop;

class Burger {
    private Bread breadRoll;
    private Meat meat;
    private Toppings toppings;
    private double price = 3.49;
    public String type;
    public int maxToppings;

    public Burger(Bread breadRoll, Meat meat, Toppings toppings) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.toppings = toppings;
        this.price = price;
        this.type = "Plain";
        this.maxToppings = 2;
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
        int max = 0;

        if(toppings.addLettuce() > 0) {
            price += (.50 * toppings.addLettuce());
            max += 1;
        }
        if(toppings.addTomato() > 0) {
            price += (.50 * toppings.addTomato());
            max += 1;
        }
        if(toppings.addCheese() > 0) {
            price += (.75 * toppings.addCheese());
            max += 1;
        }
        if(toppings.addPickles() > 0) {
            price += (.50 * toppings.addPickles());
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
