package org.example.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientList {

    private ArrayList<Client> clientsList;
    public ClientList() {
        this.clientsList = new ArrayList<Client>();
    }

    public ClientList(ArrayList<Client> clientsList) {
        this.clientsList = clientsList;
    }
    public void addClient(Client client) {
        this.clientsList.add(client);

        System.out.println("\tCette client a été ajouté:\n" + client);

    }
    public void listClient() {

        System.out.println("Liste des Clients : ");
        System.out.printf("%-5s %-20s %-15s %-15s \n", "Id ", " Prénom ", " Nom", "Numéro Téléphone");

        for (Client c : clientsList
        ) {
            System.out.println(c.toString());
        }
    }
    public boolean checkIsEmptyList (){
        return this.clientsList.isEmpty();
    }
    public int getQuantityOfClients(){
        return this.clientsList.size();

    }
    public void deleteAllClients(){
        this.clientsList.removeAll(clientsList);
    }
    public boolean  checkClientIsExist(Client client){
        return this.clientsList.contains(client);
    }
    public boolean deleteOneClient(Client client){
        return this.clientsList.remove(client);
    }
    public void findClientByName(String iFirstName){
        for (Client client: clientsList
             ) {
            if (client.getFirstName().contains(iFirstName)) {
                System.out.println(client);

            }

        }
    }
}
