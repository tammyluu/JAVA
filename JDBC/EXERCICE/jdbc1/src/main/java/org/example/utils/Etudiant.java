package org.example.utils;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Etudiant {
    private int id;
    private String firstName;
    private String lastName;
    private String numClass;
    private Date dateDiplome;
    public static int count = 0;
    public Scanner sc = new Scanner(System.in);
    public Connection conn = null;

    public Etudiant() {
        this.id = ++count;
    }

    public Etudiant(String firstName, String lastName, String numClass, Date dateDiplome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numClass = numClass;
        this.dateDiplome = dateDiplome;

    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", numClass = '" + numClass + '\'' +
                ", dateDiplome = " + dateDiplome +
                '}';
    }

    public void ajouterEtudiant() throws SQLException {
        try {
            conn = ConnectionUtils.getMySQLConnection();
            String request = "INSERT INTO etudiant (first_Name, last_Name, num_class, date_diplome)" +
                    " VALUES ('" + firstName + "', '" + lastName + "' , '" + numClass + "', '" + dateDiplome + "' )";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public  void afficherTous () {
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
    public void afficherEtudiantByClass () {
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
    public void deleteEtudiantByID () {
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