package org.example.collection.map;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------");
            System.out.println("         MENU           ");
            System.out.println(" "
                   + "1. Ajouter un mot\n"
                   + "2. Ajouter un mot\n"
                   + "3. Ajouter un mot\n"
                   + "4. Ajouter un mot\n"
                   + "5. Ajouter un mot\n"
                   + "6. Ajouter un mot\n"

            );
            choose = sc.nextInt();
            sc.nextLine();
            if (choose == 1) {
                System.out.println("Entrez votre: ");
                String key = sc.nextLine();
                String sense = sc.nextLine();


            }
        }while (choose !=0);

    }
    //treemap : auto en ordre
    private Map<String, String> data = new TreeMap<>();
    // il y a constructor vide par default
    public String addWord(String key, String sense){
        return  this.data.put(key, sense);

    }
    public String deleteWord(String key){
        //remove a pair of map (data) : key & sense
        return  this.data.remove(key);
    }
    public String looUpAWord(String key){
        String result = this.data.get(key);
        return  result;
    }
    // display list of keyword
    public void printKey(){
        Set<String> keyCollection = this.data.keySet();
        System.out.println(Arrays.toString(keyCollection.toArray()));
    }
    //display number of keyword
    public  int sizeOfKey(){
        return this.data.size();
    }
    public void deleteAll(){
        this.data.clear();
    }

}
