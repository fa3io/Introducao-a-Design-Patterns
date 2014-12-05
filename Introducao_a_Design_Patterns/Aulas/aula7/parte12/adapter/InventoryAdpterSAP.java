package aula7.parte12.adapter;

import service.InventorySystem;

public class InventoryAdpterSAP extends InventoryAdapter{
	
	public InventoryAdpterSAP() {
		inventorySystem = new InventorySystem("SAP");
	}
}
