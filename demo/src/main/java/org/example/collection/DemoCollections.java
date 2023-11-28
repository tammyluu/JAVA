package org.example.collection;

import java.util.Vector;

public class DemoCollections {
    public static void main(String[] args) {
        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector: " + vector);

        // Method for vector

        System.out.println("1. Taille du vevtor: " + vector.size());
        System.out.println("2. Elemnet à index 1: " + vector.get(1));
        System.out.println("3. Est ce que Apple est present: " + vector.contains("Apple"));
        System.out.println("4. Est ce que Apple est present: " + vector.elementAt(2));
        vector.elementAt(2);
    }
}
