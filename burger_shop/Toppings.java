package burger_shop;

public class Toppings {
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean ketchup;

    public Toppings(boolean lettuce, boolean tomato, boolean cheese, boolean ketchup) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.ketchup = ketchup;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isKetchup() {
        return ketchup;
    }
}
