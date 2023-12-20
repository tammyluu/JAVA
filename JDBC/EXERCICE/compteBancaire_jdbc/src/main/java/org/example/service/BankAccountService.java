package org.example.service;

import org.example.dao.BankAccountDAO;
import org.example.dao.ClientDAO;
import org.example.models.BankAccount;
import org.example.models.Client;
import org.example.models.Operation;
import org.example.utils.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BankAccountService {
    private BankAccountDAO accountDAO;
    private Connection connection;
    public BankAccountService(){
        try {
            connection = new DataBaseManager().getConnection();
            accountDAO= new BankAccountDAO(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  boolean createAnAccount(Double balance,Client client ){
        BankAccount account = new BankAccount();
        account.setBalance(balance);
        account.setClient(client);
        try {
            return accountDAO.save(account);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean updateAnAccoount(BankAccount account){
        try {
            return  accountDAO.update(account);
        }catch ( SQLException e){
            throw new RuntimeException(e);
        }
    }
    public BankAccount getAccount(int id){
        try {
            return accountDAO.get(id);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public boolean deleteOneAccount(int id){
        BankAccount account = null;
        try {
           account = accountDAO.get(id);
            if ( account != null){
                return  accountDAO.delete(account);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return  false;
    }
    public  List<BankAccount> getAllAccounts(){
        try {
            return accountDAO.get();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}

