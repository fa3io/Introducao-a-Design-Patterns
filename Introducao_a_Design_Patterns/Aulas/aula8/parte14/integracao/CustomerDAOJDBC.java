/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte14.integracao;


import aula8.parte14.entidades.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            
             preparedStatement  = connection.prepareStatement("INSERT INTO CREDENTIAL (LOGIN, PASSWORD) VALUES (?,?)");
             preparedStatement.setString(1, customer.getCredential().getLogin());
             preparedStatement.setString(2, customer.getCredential().getPassword());
             
             preparedStatement.executeUpdate();
            
             
             preparedStatement = connection.prepareStatement("SELECT id FROM CREDENTIAL ORDER BY id DESC FETCH FIRST 1 ROWS ONLY");
             resultSet = preparedStatement.executeQuery();
             resultSet.next();
             
             int idCredencial = resultSet.getInt("ID");
             
            preparedStatement  = connection.prepareStatement("INSERT INTO CUSTOMER (NAME, CITY, CREDENTIAL_ID) VALUES (?,?,?)");
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getCity());
            preparedStatement.setInt(3, idCredencial);
            
            preparedStatement.executeUpdate();
             
             
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
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
