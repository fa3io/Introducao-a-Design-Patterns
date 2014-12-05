package aula7.parte8.adapter;

import service.InventorySystem;

public class InventoryAdpterItauTec extends InventoryAdapter {

	public InventoryAdpterItauTec() {
		inventorySystem = new InventorySystem("ItauTec");
	}
}
