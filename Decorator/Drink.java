package Decorator;

public abstract class Drink {
    private String drinkName;

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public String toString() {
        return drinkName;
    }

    public abstract int cost();
}
