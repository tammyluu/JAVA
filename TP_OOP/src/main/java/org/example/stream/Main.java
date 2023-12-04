package org.example.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lire à paritr d'un fichier texte

       try {
           Scanner sc = new Scanner(new File("path/to/file"));
           StringBuilder textBuilder =new StringBuilder();
           do {
               textBuilder.append(sc.nextLine());
           }while (sc.hasNextLine());
           String allText = textBuilder.toString();
           sc.close();
       }catch (FileNotFoundException e){
           throw new RuntimeException(e);
       }

        // chain de text
        String text = "Hello From our Stream exercise and stream correction";
        String cleanText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        List<String> words = Arrays.asList(cleanText.split("\\s+"));

        //Fréquence des mots
        Map<String, Long> wordFrequency = words.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //Filtrer les mots
        List<String> wordsFilter = words.stream().filter(c->c.length()>5).collect(Collectors.toList());

        //Mots uniques
        Set<String > uniqueWords = new HashSet<>(words);

        //Avec Stream
        uniqueWords = words.stream().distinct().collect(Collectors.toSet());

        // les mots le plus fréquents
        //entrySet() pour récupérer en Obj (tous ensemnle)
        // key = mots; value = occurence
        List<String> motsFrequentWords = wordFrequency.entrySet().stream().sorted(
                Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5).map(e->e.getKey()).collect(Collectors.toList());

        // Statistique sur la longueurs des mots
       IntSummaryStatistics summaryStatistics =  words.stream().mapToInt(s -> s.length()).summaryStatistics();





    }
    private  static  void readFromFile()  {
       try (Scanner sc = new Scanner(new File("path/to/file"))){

        }catch (FileNotFoundException  e){
           throw new RuntimeException(e);
        }
    }

}
