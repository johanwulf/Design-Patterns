package Composite.Pen;

public class Move implements Command {
    private int x, y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute() {
        System.out.println("Moved pen to X: " + x + " Y: " + y);
    }
}
