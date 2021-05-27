package Strategy.List;
import java.util.*;

public class List<T> extends ArrayList<T> {
    private Prefix prefix = new Empty();

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : this) {
            sb.append(prefix.string());
            sb.append(t).append("\n");
        }

        return sb.toString();
    }
}
