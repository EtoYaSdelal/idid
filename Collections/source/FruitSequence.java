package Collections.source;

import Collections.FruitUtil;

import java.util.AbstractCollection;
import java.util.Iterator;

public class FruitSequence extends AbstractCollection<Fruit> {
    private Fruit[] fruits;
    public FruitSequence(int length) {
        if (length==0){
            throw new NullPointerException("fuck");
        }
        else {
            fruits = FruitUtil.createArray(length);
        }
    }



    @Override
    public Iterator<Fruit> iterator() {

        return new Iterator<Fruit>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < fruits.length;
            }

            @Override
            public Fruit next() {
                return fruits[index++];
            }
        };
    }

    @Override
    public int size() {
        return fruits.length;
    }
}