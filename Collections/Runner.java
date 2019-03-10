package Collections;

import Collections.source.*;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Fruit> fruits1 = createCollections();
        ArrayList<Fruit> fruits2 = createCollections();

        Set<Fruit> fruitSet = new TreeSet<>(Comparator.comparing(Fruit::getName)); //ситуация когда класс не реализует comparable а сортировать надо
        ArrayList<Fruit> result = new ArrayList<>();
        fruitSet.addAll(fruits1);
        for(Fruit f : fruits2){
            if(fruitSet.contains(f)){ // поиск одинаковых объектов в двух коллекциях. так же можно обернуть в класс с переопред. equals() hashcode()
                result.add(f);
            }
        }
        showCollection(result);

    }

    private static ArrayList<Fruit> createCollections() {
        Fruit.setCount(0);
        Banana.bananaCounter = 0;
        Apple.appleCounter = 0;
        Pear.pearCounter = 0;
        Orange.orangeCounter = 0;
        Collection<Fruit> fruitCollection2 = FruitUtil.fill(new ArrayList<>(), 10);
        ArrayList<Fruit> fruits2 = new ArrayList<>(fruitCollection2);
        showCollection(fruits2);
        return fruits2;
    }

    private static void showCollection(Collection collection) {
        System.out.println("==========||=========");
        collection.forEach(System.out::println);
    }


}
