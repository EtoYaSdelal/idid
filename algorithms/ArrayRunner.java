package algorithms;

import algorithms.model.RandomArray;
import algorithms.util.Timer;

import java.time.Instant;
import java.util.Random;

public class ArrayRunner {
    public static void main(String[] args) {
        RandomArray ar = new RandomArray(5, 100);
        Timer timer = new Timer();
        timer.setStart(Instant.now());
        ar.print();
        ar.bubbleSort();
        ar.selectionSort();

        ar.print();
        timer.setEnd(Instant.now());
        System.out.println("Time spend for sort " + timer.getTime());

        int randomNum = ar.getArrayElement(new Random()
                .nextInt(ar.getArray().length));
        System.out.println("position of number " + randomNum + " is "
                + ar.binarySearch(randomNum));

    }
}
