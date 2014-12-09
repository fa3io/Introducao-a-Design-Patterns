/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte2;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fsantos
 */
public class TestaAula8Versao1 {
    
    public static void main(String[] args) {
        
        //Cria a fabrica de EntityManageer e depois é feito um EntityManeger
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Introducao_a_Design_PatternsPU");
        EntityManager entityManager = factory.createEntityManager();
        
        Customer fabio = new Customer("Rute Camila", "Uberlandia");
        
        
        //Abrimos para transações
        entityManager.getTransaction().begin();
        
        entityManager.persist(fabio);
        
        
        //Fechando transações
        entityManager.getTransaction().commit();
        
        
        entityManager.close();
        factory.close();
        
    }
    
}