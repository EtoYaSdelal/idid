package Collections.source;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

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

//    @Override
//    public int compareTo(Fruit o) {
//        return getId() - o.getId();
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return Objects.equals(name, fruit.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}