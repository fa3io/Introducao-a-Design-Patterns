package aula8.parte7;


import java.util.ArrayList;
import java.util.List;

public class TestaAula8Versao4 {
    
    private ProductDAO productDAO  = new ProductDAOJPA();
    List<Product> products = new ArrayList<>();

    public TestaAula8Versao4() {
        Product chuteira = new Product("Chuteira Nike", 200.20);
        Product meiao  = new Product("Meiao Topper", 30.00);
        Product camisa = new Product("Camisa", 45.00);
        Product caneleira = new Product("Caneleira Penault", 30.0);
        
        products.add(chuteira);
        products.add(meiao);
        products.add(camisa);
        products.add(caneleira);
    }
    
    
    
    public static void main(String[] args) {
    
        TestaAula8Versao4 teste = new TestaAula8Versao4();
        
        teste.persist();
}
    private void persist() {
        for (Product product : products) {
            productDAO.persist(product);
        }
    }
}