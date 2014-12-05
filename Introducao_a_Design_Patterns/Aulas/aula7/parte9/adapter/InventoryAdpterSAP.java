package aula7.parte9.adapter;

import service.InventorySystem;

public class InventoryAdpterSAP extends InventoryAdapter{
	
	public InventoryAdpterSAP() {
		inventorySystem = new InventorySystem("SAP");
	}
}
