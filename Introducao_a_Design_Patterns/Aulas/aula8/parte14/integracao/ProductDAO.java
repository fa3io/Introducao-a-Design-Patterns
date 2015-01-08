package aula8.parte14.integracao;



import aula8.parte14.entidades.Product;
import java.util.List;

public interface ProductDAO {

    void persist(Product product);

    void update(Product product);

    void remove(Product product);

    List<Product> findAll(String name);

    List<Product> findAll();

}
