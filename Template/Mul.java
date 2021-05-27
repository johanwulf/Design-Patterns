package Template;

public class Mul extends BinExpr {
    public Mul(Expr expr1, Expr expr2) {
        super(expr1, expr2);
    }

    protected int op(int int1, int int2) {
        return int1 * int2;
    }
}
