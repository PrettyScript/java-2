package burger_shop;

class Toppings {
    private int lettuce;
    private int tomato;
    private int cheese;
    private int pickles;
    private int bacon;
    private int avocado;
    private int onions;

    public Toppings(int lettuce, int tomato, int cheese, int pickles, int bacon, int avocado, int onions) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.pickles = pickles;
        this.bacon = bacon;
        this.avocado = avocado;
        this.onions = onions;
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

    public int addPickles() {
        return pickles;
    }

    public int addBacon() {
        return bacon;
    }

    public int addAvocado() {
        return avocado;
    }

    public int addOnions() {
        return onions;
    }
}
