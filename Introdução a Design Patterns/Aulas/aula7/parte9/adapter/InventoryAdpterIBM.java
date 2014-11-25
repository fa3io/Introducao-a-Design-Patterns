package aula7.parte9.adapter;

import service.InventorySystem;

public class InventoryAdpterIBM extends InventoryAdapter{
	
	public InventoryAdpterIBM() {
		inventorySystem = new InventorySystem("IBM");
	}
}
