package aula7.parte9.adapter;

import service.InventorySystem;

public abstract class InventoryAdapter {
	
	protected InventorySystem inventorySystem;
	



	public void decreaseItemQuantity() {
		inventorySystem.decrease();
	}


	public void updateInventoryQuantity() {
		inventorySystem.include();
		
	}

}
