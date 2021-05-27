package Decorator;

public class Coffee extends Drink{
    public Coffee() {
        super("coffee");
    }
    
    public int cost() {
        return 5;
    }
}
