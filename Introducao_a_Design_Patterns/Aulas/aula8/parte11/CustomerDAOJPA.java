
package aula8.parte11;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }

    }

    @Override
    public void update(Customer customer) {
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            entityManager.merge(customer);
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
    }

    @Override
    public void remove(Customer customer) {
        Customer temporario = null;
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            temporario = entityManager.merge(customer);
            entityManager.remove(temporario);
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
    }

    @Override
    public List findAll(String name) {
        List<Customer> customers = null;
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            String strQuery = "SELECT c from Customer c WHERE c.name =:n ";
            Query query = entityManager.createQuery(strQuery);
            query.setParameter("n", name);

            customers = query.getResultList();

            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
        return customers;
    }
    
     @Override
    public List findAll() {
       List<Customer> customers = null;
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            String strQuery = "SELECT c from Customer c";
            Query query = entityManager.createQuery(strQuery);
            customers = query.getResultList();
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
        return customers;
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
