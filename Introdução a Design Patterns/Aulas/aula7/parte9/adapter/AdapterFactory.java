package aula7.parte9.adapter;


public class AdapterFactory {

	private AccountingAdapter accountingAdapter;
	private InventoryAdapter inventoryAdapter;
	private static AdapterFactory factory = new AdapterFactory();
	
	private AdapterFactory() {
	
	}
	
	public static AdapterFactory getInstance(){
		return factory;
	}
	

	public AccountingAdapter createAccountingAdapter(String name) {

		if (name.equalsIgnoreCase("IBM")) {
			accountingAdapter = new AccountingAdapterIBM();
		} else if (name.equalsIgnoreCase("ItauTec")) {
			accountingAdapter = new AccountingAdapterItauTec();
		} else if (name.equals("SAP")) {
			accountingAdapter = new AccountingAdapterSAP();
		}
		return accountingAdapter;
	}
	
	public InventoryAdapter createInventoryAdapter(String name){
		
		if(name.equals("IBM")){
			inventoryAdapter = new InventoryAdpterIBM();
		}else if(name.equals("ItauTec")) {
			inventoryAdapter = new InventoryAdpterItauTec();
		}else if(name.equals("SAP")) {
			inventoryAdapter = new InventoryAdpterSAP();
		}
		return inventoryAdapter;
	}

}
