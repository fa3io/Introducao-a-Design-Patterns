package aula7.parte12.adapter;

public class AdapterFactory {

    private AccountingAdapter accountingAdapter;
    private InventoryAdapter inventoryAdapter;
    private static AdapterFactory factory = new AdapterFactory();

    private AdapterFactory() {

    }

    public static AdapterFactory getInstance() {
        return factory;
    }

    public AccountingAdapter createAccountingAdapter(String name) {

        //propriedade que será lida de um arquivo
        String className = System.getProperty("accountingProperty");

        try {

            accountingAdapter = (AccountingAdapter) Class.forName(className).newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException erro) {
            System.out.println("Erro: "+ erro.getMessage());
        }

        return accountingAdapter;

    }

    public InventoryAdapter createInventoryAdapter(String name) {

        //propriedade que será lida de um arquivo
        String className = System.getProperty("inventoryProperty");
           
        try {
           
            
            inventoryAdapter = (InventoryAdapter) Class.forName(className).newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException erro) {
            
            System.out.println("Erro: "+ erro.getMessage());
            erro.printStackTrace();
        }
        return inventoryAdapter;
    }
}
