package burger_shop;

class Meal {
    private Burger burger;
    private Drink drink;
    private Side side;
    public double price = 0;
    public int maxToppings;

    public Meal(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        this.maxToppings = burger.maxToppings;
    }

    public Side getSide(){
        return this.side;
    }

    public Drink getDrink(){
        return this.drink;
    }

    public Burger getBurger(){
        return this.burger;
    }
}

