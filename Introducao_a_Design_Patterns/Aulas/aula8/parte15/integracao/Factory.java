/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte15.integracao;









/**
 *
 * @author fsantos
 */
public abstract class Factory {
    
    public abstract  CustomerDAO createCustomerDAO();
    
    public abstract ProductDAO createProductDAO();
    
}
