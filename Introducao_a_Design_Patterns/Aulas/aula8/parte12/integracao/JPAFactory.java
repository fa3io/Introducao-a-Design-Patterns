
package aula8.parte12.integracao;



public class JPAFactory extends Factory{

    @Override
    public CustomerDAO createCustomerDAO() {
      return new CustomerDAOJPA();
    }

    @Override
    public ProductDAO createProductDAO() {
      return new ProductDAOJPA();
    }
    
}
