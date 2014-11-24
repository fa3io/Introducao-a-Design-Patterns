package aula7.parte7.controller;

import aula7.parte6.adapter.AccountingAdapterIBM;
import aula7.parte6.adapter.AccountingAdapterItauTec;
import aula7.parte6.adapter.AccountingAdapterSAP;
import aula7.parte6.adapter.IAccountingAdapter;
import aula7.parte6.adapter.InventoryAdpterSAP;





public class AccountingController {

	private IAccountingAdapter accountingAdapter;

	public AccountingController() {
		System.out.println("AccountingController Criado!");
	}

	public void createAccountingAdapter(String name) {
		if (name.equalsIgnoreCase("IBM")) {
			accountingAdapter = new AccountingAdapterIBM();
		} else if (name.equalsIgnoreCase("ItauTec")) {
			accountingAdapter = new AccountingAdapterItauTec();
		}else if(name.equals("SAP")) {
			accountingAdapter = new AccountingAdapterSAP();
		}
	}
	public void calculateTax(){
		accountingAdapter.registerTax();
	}
}
