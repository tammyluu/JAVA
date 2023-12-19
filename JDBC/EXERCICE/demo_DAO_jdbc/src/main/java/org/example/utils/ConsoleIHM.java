package org.example.utils;

import org.example.dao.PersonDAO;
import org.example.models.Person;
import org.example.service.PersonService;

import javax.net.ssl.SSLException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ConsoleIHM {
    private Scanner sc;
    public ConsoleIHM(){ this.sc = new Scanner(System.in);}
    public  void start(){
        String choix;
        do {
            menu();
            choix = sc.nextLine();
            switch (choix){
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        }while (!choix.equals("0"));
    }
    private void menu(){
        System.out.println("______________________________________");
        System.out.println("********** PROFILE - JDBC*************");
        System.out.println("______________________________________");
        System.out.println("1. Ajouter une personne ");
        System.out.println("2. Afficher tous les personnes");
        System.out.println("3. Cherche une personne par son id");
        System.out.println("4. Supprimer une personne");
        System.out.println("0. Quitter");
        System.out.print("Choix : ");
        System.out.println("______________________________________");
    }
    private  void addAPerson(){
       System.out.println("Saisir le prénom: ");
        String firstName = sc.nextLine();
        System.out.println("Saisir le nom: ");
        String lastName = sc.nextLine();
        try {
            PersonService personService = new PersonService();
            Person person = new Person(firstName, lastName);
            if (personService.createPerson(person)){
                System.out.println("Etudiant ajouté avec l'id: " + person.getId());
            }else {
                System.out.println("Erreur d'engistrement en BDD!!!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    private  void showAllPersons(){
        PersonService personService = new PersonService();
        List<Person> persons = personService.getALLperson();

        if (persons.isEmpty()) {
            System.out.println("Aucune personne trouvée.");
        } else {
            System.out.println("Liste de toutes les personnes :");
            for (Person person : persons) {
                System.out.println("ID : " + person.getId() + ", Prénom : " + person.getFirstName() + ", Nom : " + person.getLastName());
            }
        }
    }
    private  void findOnePersonByID(){
        System.out.println("Saisir l'ID de la personne : ");
        int personId = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        PersonService personService = new PersonService();
        Person person = personService.getPerson(personId);

        if (person != null) {
            System.out.println("Détails de la personne avec l'ID " + personId + " :");
            System.out.println("Prénom : " + person.getFirstName());
            System.out.println("Nom : " + person.getLastName());
            // Print other details as needed
        } else {
            System.out.println("Aucune personne trouvée avec l'ID " + personId);
        }
    }
    private  void deleteOnePerson(){}



}
