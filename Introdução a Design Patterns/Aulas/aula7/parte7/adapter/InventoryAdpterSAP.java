package aula7.parte7.adapter;

import service.InventorySystem;

public class InventoryAdpterSAP implements IInventoryAdapter{

	private InventorySystem inventorySystem;
	
	public InventoryAdpterSAP() {
		inventorySystem = new InventorySystem("SAP");
	}
	
	@Override
	public void decreaseItemQuantity() {
		inventorySystem.decrease();
		
	}

	@Override
	public void updateInventoryQuantity() {
		inventorySystem.include();
		
	}

}
