package Composite.Expr;

public class Add implements Expr {
    Expr expr1, expr2;

    public Add(Expr expr1, Expr expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public int value() {
        return expr1.value() + expr2.value();
    }
}
