package Template;

public abstract class BinExpr implements Expr{
    private Expr expr1, expr2;

    protected BinExpr(Expr expr1, Expr expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    protected abstract int op(int int1, int int2);

    public int value() {
        return op(expr1.value(), expr2.value());
    }
}
