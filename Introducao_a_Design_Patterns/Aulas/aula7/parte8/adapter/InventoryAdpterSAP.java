package aula7.parte8.adapter;

import service.InventorySystem;

public class InventoryAdpterSAP extends InventoryAdapter{
	
	public InventoryAdpterSAP() {
		inventorySystem = new InventorySystem("SAP");
	}
}
