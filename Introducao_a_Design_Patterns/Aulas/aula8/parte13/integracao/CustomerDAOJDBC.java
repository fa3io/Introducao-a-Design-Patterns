/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte13.integracao;


import aula8.parte13.entidades.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fsantos
 */
public class CustomerDAOJDBC implements CustomerDAO{
    
    public static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String URL = "jdbc:derby://localhost:1527/design_patterns";
    public static final String USER = "fabio";
    public static final String PASSWORD = "123";
    public static Connection connection;
    public static  PreparedStatement preparedStatement;
    public static  ResultSet resultSet;
    
    
    static {
        try {
            Class.forName(JDBC_DRIVER);
            connection =  DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao efetuar conexão " + ex.getMessage());
        }
    }
    
    
    @Override
    public void persist(Customer customer) {
        
        try {
            String sql   = "INSERT INTO CREDENTIAL (LOGIN, PASSWORD) VALUES (?,?)";
             preparedStatement  = connection.prepareStatement(sql);
             preparedStatement.setString(1, customer.getCredential().getLogin());
             preparedStatement.setString(2, customer.getCredential().getPassword());
             
             preparedStatement.executeUpdate();
             
             
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
