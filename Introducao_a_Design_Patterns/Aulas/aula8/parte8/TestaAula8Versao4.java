package aula8.parte8;



import java.util.ArrayList;
import java.util.List;

public class TestaAula8Versao4 {
    
    private ProductDAO productDAO  = new ProductDAOJPA();
    private static List<Product> products = new ArrayList<>();

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
    private void persist() {
        for (Product product : products) {
            productDAO.persist(product);
        }
    }
    
    private List<Product> listProducts(){
        return productDAO.findAll();
    }
    
    private void updateProduct(Product product){
        productDAO.update(product);
        
    }
    
        private void removeProduct(Product product){
        productDAO.remove(product);
        
    }

    public static void main(String[] args) {
    
        TestaAula8Versao4 teste = new TestaAula8Versao4();
        
        teste.persist();
        
        products = teste.listProducts();
        
        for(Product p : products){
            if(p.getName().equals("Camisa")){
                p.setName("Camisa Palmeiras Oficial");
                p.setPrice(100.00);
                teste.updateProduct(p);
            }
            if(p.getName().equals("Caneleira Penault")){
                teste.removeProduct(p);
            }
        }
         products = teste.listProducts();
         
         for(Product p : products){
             System.out.println(p);
         }
  
}
    
}