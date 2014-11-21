package aula7.parte5.controller;

public class TestControllers {

	public static void main(String[] args) {
		// testingAccountingController();
		// testingInventoryController();
		testingRegister();
	}

	private static void testingRegister() {
		System.out.println("Criando Inventory Controller");

		Register register = new Register();
		
		System.out.println("Teste de Integração do Register Controller com ItauTec Inventory System");
		register.createInventoryAdpter("ItauTec");
		register.decreaseItemQuantity();
		System.out.println("");
		
		System.out.println("Teste de Integração do Register Controller com IBM Inventory System");
		register.createInventoryAdpter("IBM");
		register.decreaseItemQuantity();
		System.out.println("");
		
		System.out.println("Teste de Integração do Register Controller com ItauTec  Account System");
		register.createAccountAdpter("ItauTec");
		register.registerSaleAccountSystem();
		System.out.println("");
		
		System.out.println("Teste de Integração do Register Controller com IBM  Account System");
		register.createAccountAdpter("IBM");
		register.registerSaleAccountSystem();
	}

	private static void testingInventoryController() {
		System.out.println("Criando Inventory Controller");

		InventoryController inventoryController = new InventoryController();
		System.out
				.println("Teste de Integração do AccountController com ItauTec Account System");
		inventoryController.createInventoryAdpter("ItauTec");
		inventoryController.UpdateInventory();

		System.out
				.println("Teste de Integração do AccountController com IBM Account System");
		inventoryController.createInventoryAdpter("IBM");
		inventoryController.UpdateInventory();
	}

	private static void testingAccountingController() {
		System.out.println("Criando Account Controller");
		AccountingController accountingController = new AccountingController();

		System.out
				.println("Teste de Integração do AccountController com ItauTec Account System");
		accountingController.createAccountingAdapter("ItauTec");
		accountingController.calculateTax();

		System.out
				.println("Teste de Integração do AccountController com IBM Account System");
		accountingController.createAccountingAdapter("IBM");
		accountingController.calculateTax();

	}

}
