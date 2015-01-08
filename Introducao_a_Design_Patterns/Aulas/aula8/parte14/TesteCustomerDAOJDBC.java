/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte14;


import aula8.parte14.entidades.Credential;
import aula8.parte14.entidades.Customer;
import aula8.parte14.integracao.CustomerDAO;
import aula8.parte14.integracao.CustomerDAOJDBC;




/**
 *
 * @author fsantos
 */
public class TesteCustomerDAOJDBC {
    
        public static void main(String[] args) {
        
        

        //Instanciando DAO
        CustomerDAO customerDAO = new CustomerDAOJDBC();
        //Criando Usuario
        Customer fabio = new Customer("Fabio", "Uberlandia");
//        Customer flavio = new Customer("Flavio", "Barueri");
//        Customer amanda = new Customer("Amanda", "Uberlandia");
//        Customer lorena = new Customer("Lorena", "Araxa");
//        Customer rosa = new Customer("Rosa", "Xambre");
//        Customer lorena2 = new Customer("Lorena", "Uba");
//        
        //Criando Credencial
        Credential credencial = new Credential("fabio", "secret");
        fabio.setCredential(credencial);
//        
//        credencial = new Credential("flavio", "998");
//        flavio.setCredential(credencial);
//        
//        credencial = new Credential("manda", "nanda");
//        amanda.setCredential(credencial);
//        
//        credencial = new Credential("lolo", "louca");
//        lorena.setCredential(credencial);
//        
//        credencial = new Credential("rosalina", "ro");
//        rosa.setCredential(credencial);
//        
//        credencial = new Credential("lo2", "lolo2");
//        lorena2.setCredential(credencial);

        //Persistindo objeto
        customerDAO.persist(fabio);
//        customerDAO.persist(flavio);
//        customerDAO.persist(amanda);
//        customerDAO.persist(lorena);
//        customerDAO.persist(lorena2);
//        customerDAO.persist(rosa);
//        
        
        //Testando Selecao e Atualizacao
//        List<Customer> customers = customerDAO.findAll("Lorena");
//
//        for (Customer customer : customers) {
//            if(customer.getCity().equals("Uba")){
//                customer.setName("Lorena Caixeta"); //Atualizando na memoria RAM
//                customerDAO.update(customer);
//            }  
//        }
//        //testando Selecao e delecao
//        for (Customer customer : customers) {
//            if(customer.getCity().equals("Araxa")){
//                System.out.println(customer);
//                customerDAO.remove(customer);   //Removendo 
//            } 
//        }
//        //Testando usuario inexistente
//        customers = customerDAO.findAll("Carla");
//        if (customers.isEmpty()) {
//            System.out.println("Cliente não encontrado!!!");
//        }
//        
//        //Testando busca completa independente de nomes
//        customers = customerDAO.findAll();
//        
//        if (customers.isEmpty()) {
//            System.out.println("Cliente não encontrado!!!");
//        }else{
//            for (Customer customer : customers) {
//                System.out.println(customer);
//            }
//            
        
//        }
    }

}
