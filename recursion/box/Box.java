package algorithms.recursion.box;

import java.util.Random;

public class Box {
    Box box;
    private static int count = 0;
    private boolean isEmpty = false;
    private boolean isKey;
    private String keyWord = "KKKey";

    public Box() {
        count++;
        int rnd = new Random().nextInt(1000);
        if (rnd <= 50) {
            isKey = true;
        } else {
            box = new Box();
        }

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isKey() {
        return isKey;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public static int getCount() {
        return count;
    }

    public void openBox() {
        if (isEmpty()) {
            System.out.println("box is empty, key not found");
        } else {
            System.out.println("Something is in the box");
            if (isKey()) {
                System.out.println(getKeyWord());
                System.out.println("There were " + getCount() + " boxes");
            } else {
                System.out.println("another box");
                box.openBox();
            }
        }
    }
}
