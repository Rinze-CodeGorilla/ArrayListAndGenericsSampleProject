package nl.codegorilla.collection;

import java.util.Iterator;

public class LinkedList<T> implements MyCollection<T> {
    LinkedList.Node<T> root;
    LinkedList.Node<T> last;

    public void add(T item) {
        if (root == null) {
            root = last = new LinkedList.Node<T>();
        } else {
            last = last.next = new LinkedList.Node<T>();
        }
        last.item = item;
    }

    public T get(int index) {
        LinkedList.Node<T> node = root;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        if (node == null) {
            return null;
        }
        return node.item;
    }

    public void set(int index, T item) {
        LinkedList.Node<T> node = root;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        if (node == null) {
            return;
        }
        node.item = item;
    }

    public String toString() {
        return "LinkedList [root=" + root + "]";
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            LinkedList.Node<T> current = root;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T item = current.item;
                current = current.next;
                return item;
            }
        };
    }

    static class Node<E> {
        E item;
        LinkedList.Node<E> next;

        public String toString() {
            return "Node with " + item + " -> " + next;
        }
    }
}
