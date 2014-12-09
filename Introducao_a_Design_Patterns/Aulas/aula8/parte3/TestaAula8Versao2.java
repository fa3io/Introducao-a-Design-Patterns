/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte3;

/**
 *
 * @author fsantos
 */
public class TestaAula8Versao2 {
    
    public static void main(String[] args) {
       
        //Instanciando DAO
        CustomerDAO customerDAO = new CustomerDAOJPA();
        
        //Criando Usuario
        Customer flavio = new Customer("Flavio", "Barueri");
        
        //Persistindo objeto
        customerDAO.persist(flavio);
        
        
      
        
    }
    
}