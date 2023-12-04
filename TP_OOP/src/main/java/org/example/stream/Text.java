package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Text {
    public static void main(String[] args) {
        String str = " So happy to see you again! Long time no see you. I miss you so much!!! ";

        // Nettoyage du texte
        List<String> words = Arrays.stream(str.split(" "))
                .map(Text::cleanWord)
                .filter(word -> !word.isEmpty())
                .toList();
        // Affichage des mots après nettoyage
        System.out.println("Mots après nettoyage :\n " + words);

        //la fréquence des mots
        Map<String, Long> wordsFrequency = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Affichage de la fréquence des mots
        System.out.println("Fréquence des mots : \n" + wordsFrequency);

        //Le mots le plus long

        Optional<String> o = words.stream().max(Comparator.comparingInt(String::length));
        int longest = words.stream()
                .mapToInt(String ::length)
                .max()
                .orElse(0);
        System.out.println("\nLe mots le plus long :\t[ " + o.orElse("")+ " ] y compris : " + longest+ " caratères");

        //Le mots le plus court
        Optional<String> w = words.stream().min(Comparator.comparingInt(String::length));
        int shortest = words.stream()
                .mapToInt(String ::length)
                .min()
                .orElse(0);
        System.out.println("\nLe mots le plus court :\t[ " + w.orElse("")+ " ] y compris : " + shortest + " caratères");

        // Calculez la longueur moyenne des mots
         int avarage = (longest + shortest) / 2;
        System.out.println("\nCalculez la longueur moyenne des mots : " + avarage);


        // Mots uniques
        List<String> UniqOne = words.stream()
                .distinct()
                .toList();
        System.out.println("Mots uniques : \n" + UniqOne);

        // Mots les plus fréquents
        int wordsFrequencyNumber = 3;
        List<String> wordFrequency = wordsFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(wordsFrequencyNumber)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Mots les plus fréquents : \n" + wordFrequency);

        // Filtrer les mots par longueur
        int lengthMinimale = 4;
        List<String> filterWord = words.stream()
                .filter(word -> word.length() > lengthMinimale)
                .toList();
        System.out.println("Mots de plus de " + lengthMinimale + " caractères : \n " + filterWord);

    }

    private static String cleanWord(String iLetter) {
        StringBuilder clearWord = new StringBuilder();

        for (char caracter : iLetter.toCharArray()) {
            if (Character.isLetter(caracter)) {
                clearWord.append(Character.toLowerCase(caracter));
            }
        }

        return clearWord.toString();
    }
}
