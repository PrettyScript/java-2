package burger_shop;

class Side {
    private int fries;
    private int macAndCheese;
    private int mashedPotatoes;
    private int corn;
    private int sweetPotatoFries;

    public Side(int fries, int macAndCheese, int mashedPotatoes, int corn, int sweetPotatoFries) {
        this.fries = fries;
        this.macAndCheese = macAndCheese;
        this.mashedPotatoes = mashedPotatoes;
        this.corn = corn;
        this.sweetPotatoFries = sweetPotatoFries;
    }

    public int addFries() {
        return fries;
    }

    public int addMacAndCheese() {
        return macAndCheese;
    }

    public int addMashedPotatoes() {
        return mashedPotatoes;
    }

    public int addCorn() {
        return corn;
    }

    public int addSweetPotatoFries() {
        return sweetPotatoFries;
    }


}
