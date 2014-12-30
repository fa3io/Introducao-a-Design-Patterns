/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte9;

/**
 *
 * @author fsantos
 */
public class ConcreateFactory {
    
    public static CustomerDAO createCustomerDAO(){
        return new CustomerDAOJPA();
    }
    
    public static ProductDAO createProductDAO(){
        
        return new ProductDAOJPA();
    }
    
}
