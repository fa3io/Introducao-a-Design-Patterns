package aula8.parte15;





import aula8.parte15.integracao.JPAFactory;
import aula8.parte15.integracao.Factory;
import aula8.parte15.integracao.CustomerDAO;
import aula8.parte15.entidades.Credential;
import aula8.parte15.entidades.Customer;
import java.util.List;

public class TestaAula8Versao13Customer {

    public static void main(String[] args) {
        
        Factory factory = new JPAFactory();

        //Instanciando DAO
        CustomerDAO customerDAO = factory.createCustomerDAO();
        //Criando Usuario
        Customer fabio = new Customer("Fabio", "Uberlandia");
        Customer flavio = new Customer("Flavio", "Barueri");
        Customer amanda = new Customer("Amanda", "Uberlandia");
        Customer lorena = new Customer("Lorena", "Araxa");
        Customer rosa = new Customer("Rosa", "Xambre");
        Customer lorena2 = new Customer("Lorena", "Uba");
        
        //Criando Credencial
        Credential credencial = new Credential("fabio", "123");
        fabio.setCredential(credencial);
        
        credencial = new Credential("flavio", "998");
        flavio.setCredential(credencial);
        
        credencial = new Credential("manda", "nanda");
        amanda.setCredential(credencial);
        
        credencial = new Credential("lolo", "louca");
        lorena.setCredential(credencial);
        
        credencial = new Credential("rosalina", "ro");
        rosa.setCredential(credencial);
        
        credencial = new Credential("lo2", "lolo2");
        lorena2.setCredential(credencial);

        //Persistindo objeto
        customerDAO.persist(fabio);
        customerDAO.persist(flavio);
        customerDAO.persist(amanda);
        customerDAO.persist(lorena);
        customerDAO.persist(lorena2);
        customerDAO.persist(rosa);
        
        
        //Testando Selecao e Atualizacao
        List<Customer> customers = customerDAO.findAll("Lorena");

        for (Customer customer : customers) {
            if(customer.getCity().equals("Uba")){
                customer.setName("Lorena Caixeta"); //Atualizando na memoria RAM
                customerDAO.update(customer);
            }  
        }
        //testando Selecao e delecao
        for (Customer customer : customers) {
            if(customer.getCity().equals("Araxa")){
                System.out.println(customer);
                customerDAO.remove(customer);   //Removendo 
            } 
        }
        //Testando usuario inexistente
        customers = customerDAO.findAll("Carla");
        if (customers.isEmpty()) {
            System.out.println("Cliente n�o encontrado!!!");
        }
        
        //Testando busca completa independente de nomes
        customers = customerDAO.findAll();
        
        if (customers.isEmpty()) {
            System.out.println("Cliente n�o encontrado!!!");
        }else{
            for (Customer customer : customers) {
                System.out.println(customer);
            }
            
        
        }
    }

}
