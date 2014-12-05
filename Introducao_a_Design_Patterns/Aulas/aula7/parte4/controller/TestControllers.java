package aula7.parte4.controller;

public class TestControllers {
	
	public static void main(String[] args) {
	//	testingAccountingController();
		testingInventoryController();
	}

	private static void testingInventoryController() {
		System.out.println("Criando Inventory Controller");
		
		InventoryController inventoryController = new InventoryController();
		System.out.println("Teste de Integração do AccountController com ItauTec Account System");
		inventoryController.createInventoryAdpter("ItauTec");
		inventoryController.UpdateInventory();
		
		System.out.println("Teste de Integração do AccountController com IBM Account System");
		inventoryController.createInventoryAdpter("IBM");
		inventoryController.UpdateInventory();
	}

	private static void testingAccountingController() {
		System.out.println("Criando Account Controller");
		AccountingController accountingController = new AccountingController();
		
		System.out.println("Teste de Integração do AccountController com ItauTec Account System");
		accountingController.createAccountingAdapter("ItauTec");
		accountingController.calculateTax();
		
		System.out.println("Teste de Integração do AccountController com IBM Account System");
		accountingController.createAccountingAdapter("IBM");
		accountingController.calculateTax();
		
	}

}
