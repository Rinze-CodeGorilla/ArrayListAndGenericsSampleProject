package nl.codegorilla.collection;

public interface MyCollection<T> {
    T get(int index);

    void set(int index, T element);

    void add(T element);
}
