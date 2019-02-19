package algorithms.collections;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        String[] strings = stringList.toArray(new String[0]);
        for(String s: strings)
            System.out.println(s);
    }
}
