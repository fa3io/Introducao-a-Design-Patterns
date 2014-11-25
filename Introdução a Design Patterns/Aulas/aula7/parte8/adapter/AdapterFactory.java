package aula7.parte8.adapter;


public class AdapterFactory {

	private AccountingAdapter accountingAdapter;
	private InventoryAdapter inventoryAdapter;

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
