package aula7.parte7.controller;


import aula7.parte6.adapter.IInventoryAdapter;
import aula7.parte6.adapter.InventoryAdpterIBM;
import aula7.parte6.adapter.InventoryAdpterItauTec;
import aula7.parte6.adapter.InventoryAdpterSAP;

public class InventoryController {
	
	IInventoryAdapter inventoryAdapter;
	
	public InventoryController() {
	System.out.println("Inventory Controller Created \n");
	}
	

	public void createInventoryAdpter(String name){
		if(name.equals("IBM")){
			inventoryAdapter = new InventoryAdpterIBM();
		}else if(name.equals("ItauTec")) {
			inventoryAdapter = new InventoryAdpterItauTec();
		}else if(name.equals("SAP")) {
			inventoryAdapter = new InventoryAdpterSAP();
		}
	}
	
	public void UpdateInventory(){
		inventoryAdapter.updateInventoryQuantity();
	}
}
