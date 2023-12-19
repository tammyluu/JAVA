package org.example.dao;

import org.example.models.Operation;
import org.example.models.Status;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class OperationDAO extends BaseDao<Operation> {

  protected OperationDAO(Connection connection) {
    super(connection);
  }

  @Override
  public boolean save(Operation element) throws SQLException {
    request = "INSERT INTO operation(operation_Num,  amount , status) VALUES(?,?,?)";
    statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
    statement.setString(1,element.getOperationNum());
    statement.setDouble(2,element.getAmount());
    statement.setString(3,element.getStatus().name());

    int nbRow = statement.executeUpdate();
    resultSet = statement.getGeneratedKeys();
    if (resultSet.next()){
      element.setOperationNum((resultSet.getString(1)));
    }
    return nbRow == 1;
  }

  @Override
  public boolean update(Operation element) throws SQLException {
   return false;
  }

  @Override
  public boolean delete(Operation element) throws SQLException {
    return false;
  }

  @Override
  public Operation get(int id) throws SQLException {
    return null;
  }

  @Override
  public Operation get(String numberOperation) throws SQLException {
    Operation o = null;
    request = "SELECT *  FROM operation  WHERE operation_Num = ?";
    statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
    statement.setString(1,numberOperation);
    resultSet = statement.executeQuery();
    if (resultSet.next()){
     o = new Operation(resultSet.getString("operation_Num"),
              resultSet.getDouble("amount"),
               Status.valueOf(resultSet.getString("status")));
    }
    return o;
  }

  @Override
  public List<Operation> get() throws SQLException {
    List<Operation> operations = new ArrayList<>();
    request = "SELECT * FROM operation";
    statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
    resultSet = statement.executeQuery();
    while (resultSet.next()) {
        Operation operation = new Operation(
                resultSet.getString("operation_Num"),
                resultSet.getDouble("amount"),
                Status.valueOf(resultSet.getString("status")));

        operations.add(operation);
      }
    return operations;
    }


}
