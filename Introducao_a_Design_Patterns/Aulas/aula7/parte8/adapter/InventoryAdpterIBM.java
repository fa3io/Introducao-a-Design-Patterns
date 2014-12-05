package aula7.parte8.adapter;

import service.InventorySystem;

public class InventoryAdpterIBM extends InventoryAdapter{
	
	public InventoryAdpterIBM() {
		inventorySystem = new InventorySystem("IBM");
	}
}
