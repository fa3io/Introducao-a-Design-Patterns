package aula7.parte8.controller;

import aula7.parte8.adapter.AdapterFactory;
import aula7.parte8.adapter.InventoryAdapter;
import aula7.parte8.adapter.InventoryAdpterIBM;
import aula7.parte8.adapter.InventoryAdpterItauTec;
import aula7.parte8.adapter.InventoryAdpterSAP;




public class InventoryController {
	
	InventoryAdapter inventoryAdapter;
	AdapterFactory factory;
	
	public InventoryController() {
	System.out.println("Inventory Controller Created \n");
	factory = new AdapterFactory();
	}
	

	public void createInventoryAdpter(String name){
	inventoryAdapter = factory.createInventoryAdapter(name);
	}
	
	public void UpdateInventory(){
		inventoryAdapter.updateInventoryQuantity();
	}
}
