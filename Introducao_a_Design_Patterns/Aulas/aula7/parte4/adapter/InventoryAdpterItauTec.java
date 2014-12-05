package aula7.parte4.adapter;

import service.InventorySystem;

public class InventoryAdpterItauTec implements IInventoryAdapter {

	private InventorySystem inventorySystem;

	public InventoryAdpterItauTec() {
		inventorySystem = new InventorySystem("ItauTec");
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
