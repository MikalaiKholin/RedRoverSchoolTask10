import java.util.function.Supplier;

public enum Lights {
    GREEN("green", () -> "yellow"),
    YELLOW("yellow", () -> "red"),
    RED("red", () -> "green");

    private final String color;
    private final Supplier<String> next;

    Lights(String color, Supplier<String> next) {
        this.color = color;
        this.next = next;
    }

    public String getNext() {
        return next.get();
    }
}
