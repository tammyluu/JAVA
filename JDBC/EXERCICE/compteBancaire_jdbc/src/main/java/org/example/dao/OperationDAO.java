package org.example.dao;

import org.example.models.Operation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

class OperationDAO extends BaseDao<Operation> {

  protected OperationDAO(Connection connection) {
    super(connection);
  }

  @Override
  public boolean save(Operation element) throws SQLException {
    return false;
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
  public List<Operation> get() throws SQLException {
    return null;
  }
}
