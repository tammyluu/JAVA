package org.example.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dateDuJour = LocalDate.now();
        System.out.println("Date du jour: "+ dateDuJour);

        // date choisie
        LocalDate dateChoisie = LocalDate.of(2026,11,28);
        System.out.println("Date choisie: " + dateChoisie);

        //Recuperation de ma date
        int yearCurrent = dateDuJour.getYear();
        int month = dateDuJour.getMonthValue();
        int day = dateDuJour.getDayOfMonth();
        System.out.println("Nous sommes le " + day + " jour du " + month+ " mois de l'année " +yearCurrent );

        // ajouter ou soustraire des jours
        LocalDate dateDans3Jours = dateDuJour.plusDays(3);
        System.out.println(dateDans3Jours);
        System.out.println(dateDuJour.isBefore(dateDans3Jours));
        System.out.println(dateDuJour.isAfter(dateDans3Jours));
        System.out.println(dateDuJour.isEqual(dateDans3Jours));
        System.out.println("-----------------");
        LocalDate dateMoins3jours = dateDuJour.minusDays(3);
        System.out.println(dateMoins3jours);
        System.out.println(dateDuJour.isBefore(dateMoins3jours));
        System.out.println(dateDuJour.isAfter(dateMoins3jours));
        System.out.println(dateDuJour.isEqual(dateMoins3jours));

        System.out.println("-----------------");
        //Formatage de la date
        String dateEnString = "2023-01-25";
        LocalDate dateSaisie = LocalDate.parse(dateEnString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(dateSaisie);
        System.out.println(dateDuJour.isBefore(dateChoisie));

    }


}
