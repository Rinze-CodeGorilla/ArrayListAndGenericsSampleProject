package nl.codegorilla.collection;

import java.util.Arrays;
import java.util.Iterator;

public class MyList<T> implements MyCollection<T>, Iterable<T> {
    Object[] storage = new Object[3];
    int size = 0;

    private void ensureSize(int size) {
        while (size > storage.length) {
            var newStorage = new Object[storage.length * 2];
            System.arraycopy(storage, 0, newStorage, 0, this.size);
            storage = newStorage;
        }
    }

    public void add(T item) {
        ensureSize(size + 1);
        storage[size++] = item;
    }

    public T get(int index) {
        return (T) storage[index];
    }

    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            return;
        }
        storage[index] = item;
    }

    @Override
    public String toString() {
        return "MyList [" + "storage=" + Arrays.toString(storage) + ", size=" + size + ']';
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) storage[index++];
            }
        };
    }
}
