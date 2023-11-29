package org.example.collection;

import java.util.*;

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

        // sortedSet est une interface (TreeSet) => pas de doublon,  trier en ordre
        System.out.println("\n-----------------------");
        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Python"); // pas de doublon
        sortedSet.add("C++"); // trier en ordre
        System.out.println("SortedSet: " + sortedSet);

        // Methodes pour sortedSet
        System.out.println("1. Premier element: " + sortedSet.first());
        System.out.println("2. Dernier element: " + sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Python"); // lay tu elemment python tro ve truoc
        System.out.println("3. sous-ensemble avant 'Python': " + headSet );

        //LinkedList
        System.out.println("\n-----------------------");
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.17);
        linkedList.add(1.85);
        System.out.println("LinkedList : " + linkedList);

        // Methode pour LinkedList

        System.out.println("1. Premier element: " + linkedList.getFirst());
        System.out.println("2. Dernier element: " + linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression premier element: " + linkedList);

        //SortedMap => trier en ordre par la cle, ne peut pas avoir doublon en cle
        System.out.println("\n---------- SortedMap ------------");
        SortedMap<String,Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java", 20);
        sortedMap.put("Python", 20);
        sortedMap.put("C++", 20);
        System.out.println("SortedMap: " + sortedMap);

        // Methode sortedMap
        System.out.println("1. Clés de sortedMap : " + sortedMap.keySet());
        System.out.println("2. Valeur numérique de sortedMap : " + sortedMap.values());
        System.out.println("3. Supprimer l'entrée avec la clé 'Java' de sortedMap : " );
        sortedMap.remove("Java");
        System.out.println("SortedMap après supprestion: " + sortedMap);
        for (String k: sortedMap.keySet() ) {
            sortedMap.get(k);
            System.out.println("Clé: " + k + " \tvalue: " + sortedMap.get(k));

        }

        // HashMap
        System.out.println("\n-----------HashMap------------");
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java",20);
        hashMap.put("Python", 10);
        hashMap.put("C++", 30);
        System.out.println("HashMap: " + hashMap);

        //Methodes
        System.out.println("1. Taille du hashmap: \t" + hashMap.size());
        System.out.println("2. Valeur associé a la clé 'Java'\t " + hashMap.get("Java"));
        System.out.println("3. La clé 'JS' est elle présent: \t" + hashMap.containsKey("Javascript"));
        hashMap.remove("Python");
        System.out.print("\nSuppression de l'entrée avec la cle 'Python': ");
        hashMap.remove("Python");
        System.out.print("\tHashmap: " +hashMap);





    }
}
