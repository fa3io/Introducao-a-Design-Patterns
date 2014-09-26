package aula7.parte3.controller;

public class TestControllers {
	
	public static void main(String[] args) {
		testingAccountingController();
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
