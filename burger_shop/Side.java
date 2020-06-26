package burger_shop;

public class Side {
    private int fries;
    private int macAndCheese;

    public Side(int fries, int macAndCheese) {
        this.fries = fries;
        this.macAndCheese = macAndCheese;
    }

    public int addFries() {
        return fries;
    }

    public int addMacAndCheese() {
        return macAndCheese;
    }

}
