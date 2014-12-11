package aula8.parte5;

import java.util.List;

public class TestaAula8Versao3 {

    public static void main(String[] args) {

        //Instanciando DAO
        CustomerDAO customerDAO = new CustomerDAOJPA();

        //Criando Usuario
        Customer fabio = new Customer("Fabio", "Uberlandia");
        Customer flavio = new Customer("Flavio", "Barueri");
        Customer amanda = new Customer("Amanda", "Uberlandia");
        Customer lorena = new Customer("Lorena", "Araxa");
        Customer rosa = new Customer("Rosa", "Xambre");
        Customer lorena2 = new Customer("Lorena", "Uba");

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
            System.out.println("Cliente não encontrado!!!");
        }
        
        //Testando busca completa independente de nomes
        customers = customerDAO.findAll();
        
        if (customers.isEmpty()) {
            System.out.println("Cliente não encontrado!!!");
        }else{
            for (Customer customer : customers) {
                System.out.println(customer);
            }
            
        
        }
    }

}
