package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {
    private String idAccount;
    private double balance;
    private  Client client;
    private List<Operation> operations;



    public BankAccount(String idAccount, double balance, int idClient) {
        this.idAccount = idAccount;
        this.balance = balance;

    }

    public BankAccount() {

    }

    @Override
    public String toString() {
        return "CompteBancaire|" +
                "idCompte = " + idAccount +
                "| soldCompte = " + balance +
                "| client = " + client +
                "| operations = " + operations +
                '|';
    }
}
