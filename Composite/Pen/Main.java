package Composite.Pen;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Macro macro = new Macro();
        macro.add(new PenDown());
        macro.add(new Move(1, 0));
        macro.add(new Move(0, 1));
        macro.add(new Move(-1, 0));
        macro.add(new Move(0, -1));
        macro.add(new PenUp());

        macro.execute();
        new Move(1, 1).execute();
        macro.execute();
    }
}
