/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte12.integracao;

import aula8.parte12.entidades.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author fsantos
 */
public class CustomerDAOJDBC implements CustomerDAO{
    
    public static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String URL = "jdbc:derby://localhost:1527/design_patterns";
    public static final String USER = "fabio";
    public static final String PASSWORD = "123";
    public static  PreparedStatement preparedStatement;
    public static  ResultSet resultSet;
    
    
    
    @Override
    public void persist(Customer customer) {
        
    }

    @Override
    public void update(Customer customer) {
      
    }

    @Override
    public void remove(Customer customer) {
      
    }

    @Override
    public List findAll(String name) {
        return null;
      
    }

    @Override
    public List findAll() {
        return null;
      
    }
    
}
