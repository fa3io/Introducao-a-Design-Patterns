package aula7.parte12.controller;

import aula7.parte12.adapter.AdapterFactory;
import aula7.parte12.adapter.InventoryAdapter;



public class InventoryController {
	
	InventoryAdapter inventoryAdapter;
	AdapterFactory factory;
	
	public InventoryController() {
	System.out.println("Inventory Controller Created \n");
	factory = AdapterFactory.getInstance();
	}
	

	public void createInventoryAdpter(String name){
	inventoryAdapter = factory.createInventoryAdapter(name);
	}
	
	public void UpdateInventory(){
		inventoryAdapter.updateInventoryQuantity();
	}
}
