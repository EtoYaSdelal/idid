package Collections;

import Collections.source.Fruit;

import java.util.Objects;

public class FruitWrapper {
    Fruit fruit;

    public FruitWrapper(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitWrapper that = (FruitWrapper) o;
        return Objects.equals(fruit.getName(), that.fruit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit.getName());
    }

    @Override
    public String toString() {
        return "FruitWrapper{" +
                "fruit=" + fruit +
                '}';
    }
}
