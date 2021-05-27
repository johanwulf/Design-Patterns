package Composite.Expr;

public class Num implements Expr{
    private int num;

    public Num(int num) {
        this.num = num;
    }

    public int value() {
        return num;
    }
}
