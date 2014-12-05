package aula7.parte12.adapter;

import service.InventorySystem;

public class InventoryAdpterIBM extends InventoryAdapter{
	
	public InventoryAdpterIBM() {
		inventorySystem = new InventorySystem("IBM");
	}
}
