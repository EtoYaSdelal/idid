package Collections;

import Collections.source.*;

import java.util.*;

public class FruitUtil {

    public static void showQ(PriorityQueue q) {
        while (q.peek() != null) {
            System.out.print(q.remove() + " ");
        }
        System.out.println("\nQ is empty = " + q.isEmpty());
    }


    public static void showMap(Map<?, ?> map) {
        System.out.println("==========||=========");
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("==========||=========");

    }


    public static List<Fruit> randomFruit(int num) {
        List<Fruit> randomFruit = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int rndNum = new Random().nextInt(4);
            randomFruit.add(getDifferentFruit(rndNum));
        }
        return randomFruit;

    }

    private static Fruit getFruit(int num) {
        switch (num) {
            case 0:
                return new Apple("apple");
            case 1:
                return new Orange("orange");
            case 2:
                return new Pear("pear");
            case 3:
                return new Banana("banana");
            default:
                return new Fruit("awesome fruit");
        }
    }

    private static Fruit getDifferentFruit(int num) {
        switch (num) {
            case 0:
                return new Apple("apple" + Apple.appleCounter);
            case 1:
                return new Orange("orange" + Orange.orangeCounter);
            case 2:
                return new Pear("pear" + Pear.pearCounter);
            case 3:
                return new Banana("banana" + Banana.bananaCounter);
            default:
                return new Fruit("awesome fruit");
        }
    }

    public static Collection fill(Collection<Fruit> collection, int num) {
        collection.addAll(randomFruit(num));
        return collection;
    }

    public static Map fill(Map<String, Fruit> map, int num) {
        for (Fruit f : randomFruit(num)) {
            map.put(f.getName(), f);
        }
        return map;
    }


}
