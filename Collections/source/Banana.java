package Collections.source;

public class Banana extends Fruit {
    public static int bananaCounter = 0;

    public Banana(String name) {
        super(name);
        bananaCounter++;
    }

}