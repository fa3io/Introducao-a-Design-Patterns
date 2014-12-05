package aula7.parte11;
/**
 *
 * @author fsantos
 */
public class FactoryPayment {
    
    private static Payment payment;
    
    public static Payment createPayment(String company, String tipo, String bank, double amount){
        if(tipo.equalsIgnoreCase("card")){
            
            payment = new CreditCardPayment(amount, company);
            
        }else if(tipo.equalsIgnoreCase("check")){
            
            payment = new CheckPayment(amount, bank);
          
        }
        return payment;
    }
    
}
