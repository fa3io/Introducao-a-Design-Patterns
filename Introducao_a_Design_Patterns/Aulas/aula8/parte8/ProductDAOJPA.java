package aula8.parte8;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author fsantos
 */
public class ProductDAOJPA implements ProductDAO{
    
     //Cria a fabrica de EntityManageer e depois é feito um EntityManeger
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Introducao_a_Design_PatternsPU");
    EntityManager entityManager;

    public ProductDAOJPA() {
        entityManager = factory.createEntityManager();
    }
    
    

    @Override
    public void persist(Product product) {
       try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }}

    @Override
    public void update(Product product) {
      try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            entityManager.merge(product);
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
    }

    @Override
    public void remove(Product product) {
       Product temporario = null;
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            temporario = entityManager.merge(product);
            entityManager.remove(temporario);
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
    }

    @Override
    public List<Product> findAll(String name) {
        List<Product> products = null;
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            String strQuery = "SELECT p from Product p WHERE c.name =:n ";
            Query query = entityManager.createQuery(strQuery);
            query.setParameter("n", name);

            products = query.getResultList();

            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
        return products;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = null;
        try {
            //Abrimos para transações
            open();
            entityManager.getTransaction().begin();
            String strQuery = "SELECT p from Product p";
            Query query = entityManager.createQuery(strQuery);
            products = query.getResultList();
            //Fechando transações
            entityManager.getTransaction().commit();
        } finally {
            close();
        }
        return products;
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
