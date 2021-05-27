package Command;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<Command> commandList = new ArrayList<Command>();

        commandList.add(new PenDown());
        commandList.add(new Move(1, 0));
        commandList.add(new Move(0, 1));
        commandList.add(new Move(-1, 0));
        commandList.add(new Move(0, -1));
        commandList.add(new PenUp());

        for (Command command : commandList) {
            command.execute();
        }
    }
}
