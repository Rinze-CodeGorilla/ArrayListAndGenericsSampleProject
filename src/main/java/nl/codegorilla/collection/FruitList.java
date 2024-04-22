package nl.codegorilla.collection;

import nl.codegorilla.produce.Fruit;

public class FruitList<T extends Fruit> extends MyList<T> {
    public boolean areAllFruitsTasty() {
        for (int i = 0; i < size; i++) {
            T fruit = (T) storage[i];
            if (fruit != null && !fruit.isTasty()) {
                return false;
            }
        }
        return true;
    }
}
