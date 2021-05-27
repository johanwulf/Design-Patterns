package Template;

public class Main {
    public static void main (String[] args) {
        /**
         * Vi vill ha ut resultatet av ekvationen
         * 5*3 vilket bör bli 15
         */

        int num = new Mul(new Num(5), new Num(3)).value();
        System.out.print(num);
    }
}
