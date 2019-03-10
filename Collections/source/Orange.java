package Collections.source;

public class Orange extends Fruit {
    public static int orangeCounter = 0;

    public Orange(String name) {
        super(name);
        orangeCounter++;
    }
}