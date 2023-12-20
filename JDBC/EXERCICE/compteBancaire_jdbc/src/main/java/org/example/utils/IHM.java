package org.example.utils;

import org.example.models.Client;
import org.example.service.BankAccountService;
import org.example.service.ClientService;
import org.example.service.OperationService;

import java.util.List;
import java.util.Scanner;

public class IHM {
    private  static ClientService clientService = new ClientService();
    private  static BankAccountService bankAccountService = new BankAccountService();
    private  static OperationService operationService = new OperationService();
    private static Scanner sc = new Scanner(System.in);
    public static void startMenu(){
        boolean running = true;
        while (running) {
            System.out.println("1. Créer un nouveau client");
            System.out.println("2. Modifier un client");
            System.out.println("3. Supprimer un client");
            System.out.println("4. Afficher tous les clients");
            System.out.println("5. Créer un nouveau compte");
            System.out.println("6. Modifier un compte par l'id");
            System.out.println("7. Supprimer un compte par l'id");
            System.out.println("8. Afficher tous les comptes");
            System.out.println("9. Retrait d'argent de son compte");
            System.out.println("9. Dépôt d'argent pour son compte");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    createClient();
                    break;
                case 2:
                     updateClient();
                    break;
                case 3:
                    deleteAClient();
                    break;
                case 4:
                    showAllClients();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }
    private static void createClient() {
        System.out.print("Nom  : ");
        String firstName = sc.nextLine();
        System.out.print("Prenom : ");
        String lastName = sc.nextLine();
        System.out.print("Numéro de téléphone : ");
        String  phoneNumber = sc.nextLine();

        clientService.createAClient(firstName,lastName,phoneNumber);
    }
    private static void showAllClients(){
        List<Client> clients = clientService.getAllClients();
        for (Client c: clients
             ) {
            System.out.println(c);
        }
    }
    private static void updateClient() {
        System.out.print("ID de l'utilisateur à modifier : ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear the newline character

        Client client = clientService.getPerson(id);
        if (client == null) {
            System.out.println("Utilisateur non trouvé !");
            return;
        }
    }
    private static void deleteAClient() {
        System.out.print("ID de l'client à supprimer : ");
        int id = sc.nextInt();
        sc.nextLine();

        clientService.deleteOneClient(id);
        System.out.println("Un(e) client supprimé avec succès !");
    }
}
