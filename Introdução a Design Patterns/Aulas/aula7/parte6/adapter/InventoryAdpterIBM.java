package aula7.parte6.adapter;

import service.InventorySystem;

public class InventoryAdpterIBM implements IInventoryAdapter{
	
	InventorySystem inventoySystem;
	
	public InventoryAdpterIBM() {
		inventoySystem = new InventorySystem("IBM");
	}

	@Override
	public void decreaseItemQuantity() {
		inventoySystem.decrease();
	}

	@Override
	public void updateInventoryQuantity() {
		inventoySystem.include();
		
	}

}
