package Strategy.List;

public class Numbered implements Prefix {
    private int number;

    public String string() {
        number++;
        return String.valueOf(number) + " ";
    }
}
