package aula7.parte3.controller;

import aula7.parte3.adapter.AccountingAdapterIBM;
import aula7.parte3.adapter.AccountingAdapterItauTec;
import aula7.parte3.adapter.IAccountingAdapter;



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
		}
	}
	public void calculateTax(){
		accountingAdapter.registerTax();
	}
}
