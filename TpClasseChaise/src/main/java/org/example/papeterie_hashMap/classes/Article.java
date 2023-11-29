package org.example.papeterie_hashMap.classes;

import java.util.HashMap;

public  abstract class  Article {
    public static int count = 0;
    private int ref;
    private static HashMap<Integer,Article> bdd =new HashMap<>();



    public Article(int ref) {
       this.ref = ++count;
       bdd.put(ref, this);

    }

    public static int getCount() {
        return count;
    }

    public int getRef() {
        return ref;
    }

    public static HashMap<Integer, Article> getBdd() {
        return bdd;
    }

    @Override
    public String toString() {
        return "Article " +
                "ref =" + ref +
                ", bdd =" + bdd ;

    }
}
