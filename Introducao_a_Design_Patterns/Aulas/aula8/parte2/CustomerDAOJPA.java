/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.parte2;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fsantos
 */
public class CustomerDAOJPA implements CustomerDAO {

    //Cria a fabrica de EntityManageer e depois é feito um EntityManeger
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Introducao_a_Design_PatternsPU");
    EntityManager entityManager;

    public CustomerDAOJPA() {
        entityManager = factory.createEntityManager();
    }

    @Override
    public void persist(Customer customer) {
        try{
        //Abrimos para transações
        open();
        entityManager.persist(customer);
        //Fechando transações
        entityManager.getTransaction().commit();
        }finally{
             close();
        }
       
    }

    @Override
    public void update(Customer customer) {
         try{
        //Abrimos para transações
        open();
        entityManager.merge(customer);
        //Fechando transações
        entityManager.getTransaction().commit();
        }finally{
             close();
        }
    }

    @Override
    public void remove(Customer customer) {

    }

    @Override
    public List findAll(String name) {
        return null;
    }

    private void open() {

        if (!factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory("Introducao_a_Design_PatternsPU");
        }
        if (!entityManager.isOpen()) {
            entityManager = factory.createEntityManager();
        }

    }

    private void close() {
        if (!entityManager.isOpen()) {
            entityManager.close();
        }
        if (factory.isOpen()) {
            factory.close();
        }

    }

}
