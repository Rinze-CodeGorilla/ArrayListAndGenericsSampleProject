package nl.codegorilla;

import nl.codegorilla.collection.FruitList;
import nl.codegorilla.collection.LinkedList;
import nl.codegorilla.collection.MyList;
import nl.codegorilla.produce.Apple;
import nl.codegorilla.produce.Fruit;
import nl.codegorilla.produce.Pear;
import nl.codegorilla.produce.Potato;

import java.util.ArrayList;

public class Main {
    /**
     * Example of JavaDoc
     * This is the main method that runs the program
     *
     * @param args These are the command line argumants passed to the program, they are not used by the program
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        // FruitList<Potato> potatoes = new FruitList<>(); // Doesn't work, as Potato doesn't implement the Fruit interface

        FruitList<Apple> apples = new FruitList<>();
        // apples.add(new Pear()); // Can't add Pears to a list of Apples
        apples.add(new Apple());
        apples.add(new Apple());
        System.out.println("Are all these apples tasty? " + apples.areAllFruitsTasty());

        MyList list = new MyList();
        list.add(new Pear());
        list.add(new Apple());
        list.add(new Potato());
        list.add(new Pear());


        // Fruit item = list.get(0); // Can't do this, because item is not guaranteed to be a Fruit
        System.out.println("list.get(0): " + list.get(0)); // should print Pear@...
        System.out.println("list.get(2): " + list.get(2)); // should print Potato@...
        // Fruit potato = (Fruit) list.get(2); // class cast exception during runtime, Potato is not a fruit

        System.out.println(list); // Should print 4 items and 2 nulls, as default backing array size is 3 and gets doubled when needed

        // You can ctrl-click on a method or class to view the implementation, even if it's a framework class or method.
        new ArrayList<>(10).contains(new Apple());

        System.out.println();

        LinkedList<Fruit> linkedList = new LinkedList<>();
        linkedList.add(new Apple());
        linkedList.add(new Pear());
        System.out.println("linkedList.get(0): " + linkedList.get(0)); // should print Apple@...
        System.out.println("linkedList.get(1): " + linkedList.get(1)); // should print Pear@....
        System.out.println("linkedList.get(5): " + linkedList.get(5)); // should print null

        System.out.println(linkedList);
    }
}
