package burger_shop;

public class Toppings {
    private int lettuce;
    private int tomato;
    private int cheese;
    private int ketchup;
    private int bacon;
    private int extraCheese;
    private int extraMeat;

    public Toppings(int lettuce, int tomato, int cheese, int ketchup, int bacon, int extraCheese, int extraMeat) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.ketchup = ketchup;
        this.bacon = bacon;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
    }

    public int addLettuce() {
        return lettuce;
    }

    public int addTomato() {
        return tomato;
    }

    public int addCheese() {
        return cheese;
    }

    public int addKetchup() {
        return ketchup;
    }

    public int addBacon() {
        return bacon;
    }

    public int addExtraCheese() {
        return extraCheese;
    }

    public int addExtraMeat() {
        return extraMeat;
    }
}
