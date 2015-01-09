package aula8.parte15.integracao;




import aula8.parte15.entidades.Customer;
import java.util.List;

public interface CustomerDAO {
    
    void persist(Customer customer);
    void update(Customer customer);
    void remove(Customer customer);
    List findAll(String name);
    List findAll();
}
