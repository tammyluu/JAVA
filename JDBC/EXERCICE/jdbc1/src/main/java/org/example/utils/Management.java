package org.example.utils;

import java.sql.*;
import java.util.Scanner;

public class Management {
    Scanner sc = new Scanner(System.in);
    Connection conn = null;
 public void  ajouterEtudiant() throws SQLException {
     try {
         conn = ConnectionUtils.getMySQLConnection();
         System.out.println("Connection OK");
         System.out.print("Merci de saisir le prénom: ");
         String firstName = sc.nextLine();
         System.out.print("Merci de saisir le nom: ");
         String lastName = sc.nextLine();
         System.out.print("Merci de saisir le nom de la classe : ");
         String numClass = sc.nextLine();
         System.out.print("Merci de saisir la date du diplome: ");
         String dateDiplome = sc.nextLine();

         String request = "INSERT INTO etudiant (first_Name, last_Name, num_class, date_diplome) VALUES ('"+firstName+"', '"+lastName+"' , '"+ numClass + "', '" + dateDiplome + "' )";
      } catch (SQLException e) {
         System.out.println(e.getMessage());
     }
    public void afficherTous() {
        try {
            conn = ConnectionUtils.getMySQLConnection();
            System.out.println("Connection OK");
            String request = "SELECT * FROM etudiant";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " | " + resultSet.getString("first_Name") + "  " + resultSet.getString("last_Name")
                        + " | " + resultSet.getString("num_class") + " | " + resultSet.getDate("date_diplome"));
                Statement st = conn.createStatement();
                boolean res = statement.execute(request);
                System.out.println("Requête executée");
                System.out.println(res);
            }
            statement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Fermer la connexion à la BDD
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println((e.getMessage()));
                }

            }
        }
    }

    public void afficherEtudiantByClass() {
        try {
            System.out.print("Merci de saisir le nom de  classe: ");
            String numClass = sc.nextLine();
            String request = "SELECT * FROM etudiant WHERE num_class = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(request);
            preparedStatement.setString(1, "numClass");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " | " + resultSet.getString("first_Name") + "  " + resultSet.getString("last_Name")
                        + " | " + resultSet.getString("num_class") + " | " + resultSet.getDate("date_diplome"));
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void deleteEtudiantByID() throws SQLException {
        try {
            String request = "DELETE FROM etudiant WHERE id =?";
            PreparedStatement preparedStatement = conn.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, "numClass");
            int nbRowsDelete = preparedStatement.executeUpdate(); // retour int
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("Nombre de ligne: " + nbRowsDelete);
            if (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

}