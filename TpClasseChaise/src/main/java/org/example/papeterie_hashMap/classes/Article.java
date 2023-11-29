package org.example.papeterie_hashMap.classes;

import java.util.HashMap;

public  abstract class  Article {

    private String  ref;
    private static HashMap<String, Article> bdd =new HashMap<String, Article>();

    // BDD est static


    public Article(String ref) {
        this.ref = ref;
        // save database by HashMap
        bdd.put(ref, this);

    }

    public String getRef() {
        return ref;
    }

    public static HashMap<String, Article> getBdd() {
        return bdd;
    }
    public  static  int nbrArticleBDD(String ref){
        return bdd.size();
    }
    public  static  Article getArticle(String ref){
        return bdd.get(ref);
    }
    public  abstract String getNom();
    public abstract  double getPU();


    @Override
    public String toString() {
        return " || Article " +
                "ref =" + ref + '\''
                ;
    }


}
