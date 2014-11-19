package aula7.parte4.controller;

import aula7.parte4.adapter.IInventoryAdapter;
import aula7.parte4.adapter.InventoryAdpterIBM;
import aula7.parte4.adapter.InventoryAdpterItauTec;

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
		}
	}
	
	public void UpdateInventory(){
		inventoryAdapter.updateInventoryQuantity();
	}
}
