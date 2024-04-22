package nl.codegorilla;

import nl.codegorilla.collection.LinkedList;
import nl.codegorilla.collection.MyList;
import nl.codegorilla.produce.Fruit;

// Either implementation works, as both MyList and LinkedList
// public class FruitList<T extends Fruit> extends MyList<T> {
public class FruitList<T extends Fruit> extends LinkedList<T> {
    public boolean areAllFruitsTasty() {
        for (Fruit fruit : this) {
            if (!fruit.isTasty()) return false;
        }
        return true;
    }
}
