package Collections.source;

public class Apple extends Fruit {
    public static int appleCounter = 0;

    public Apple(String name) {
        super(name);
        appleCounter++;
    }
}