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


    private static List<Fruit> randomFruit(int num) {
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
                return new Fruit.Apple("apple");
            case 1:
                return new Fruit.Orange("orange");
            case 2:
                return new Fruit.Pear("pear");
            case 3:
                return new Fruit.Banana("banana");
            default:
                return new Fruit("awesome fruit");
        }
    }

    private static Fruit getDifferentFruit(int num) {
        switch (num) {
            case 0:
                return new Fruit.Apple("apple" + Fruit.Apple.appleCounter);
            case 1:
                return new Fruit.Orange("orange" + Fruit.Orange.orangeCounter);
            case 2:
                return new Fruit.Pear("pear" + Fruit.Pear.pearCounter);
            case 3:
                return new Fruit.Banana("banana" + Fruit.Banana.bananaCounter);
            default:
                return new Fruit("just fruit");
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

    public static void setFruitIdtoZero(){
        Fruit.setCount(0);
        Fruit.Banana.bananaCounter = 0;
        Fruit.Apple.appleCounter = 0;
        Fruit.Pear.pearCounter = 0;
        Fruit.Orange.orangeCounter = 0;
    }


}
