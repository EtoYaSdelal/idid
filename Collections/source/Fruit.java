package Collections.source;

public class Fruit {

    private static int count;
    private int id = count++;
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Fruit.count = count;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Apple extends Fruit {
        public static int appleCounter = 0;

        public Apple(String name) {
            super(name);
            appleCounter++;
        }
    }

    public static class Banana extends Fruit {
        public static int bananaCounter = 0;

        public Banana(String name) {
            super(name);
            bananaCounter++;
        }
    }

    public static class Orange extends Fruit {
        public static int orangeCounter = 0;

        public Orange(String name) {
            super(name);
            orangeCounter++;
        }
    }

    public static class Pear extends Fruit {
        public static int pearCounter = 0;

        public Pear(String name) {
            super(name);
            pearCounter++;
        }
    }
}