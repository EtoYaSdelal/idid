package algorithms.model;

import java.util.Arrays;
import java.util.Random;

public class RandomArray extends Random {
    private int[] array;

    public RandomArray(int length, int range) {
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = nextInt(range);
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getArrayElement(int num) {
        return array[num];
    }

    public void bubbleSort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public int binarySearch(int num) {
        int low = 0;
        System.out.println("low is " + low);
        int high = array.length - 1;
        System.out.println("high is " + high);
        while (low <= high) {
            int mid = (low + high) >>> 1;
            System.out.println("mid is " + mid);
            if (array[mid] == num) {
                return mid;
            }
            if (num > array[mid]) {
                low = mid + 1;
                System.out.println("low is " + low);
            }
            if (num < array[mid]) {
                high = mid - 1;
                System.out.println("high is " + high);
            }
        }
        return -1;
    }

    public void selectionSort() {
        int low;
        int lowIndex;
        for (int i = 0; i < array.length; i++) {
            low = array[i];
            lowIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (low > array[j]) {
                    low = array[j];
                    lowIndex = j;
                }
            }

            if (i != lowIndex) {
                int temp = array[i];
                array[i] = array[lowIndex];
                array[lowIndex] = temp;
            }
        }
    }


    public void print() {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

    }
}
