package nl.codegorilla.collection;

public interface MyCollection<T> extends Iterable<T> {
    T get(int index);

    void set(int index, T element);

    void add(T element);
}
