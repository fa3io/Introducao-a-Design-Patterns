package aula8.parte7;


import java.util.List;

public interface CustomerDAO {
    
    void persist(Customer customer);
    void update(Customer customer);
    void remove(Customer customer);
    List findAll(String name);
    List findAll();
}
