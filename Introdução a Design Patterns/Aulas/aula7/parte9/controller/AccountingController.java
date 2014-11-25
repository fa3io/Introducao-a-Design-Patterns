package aula7.parte9.controller;

import aula7.parte9.adapter.AccountingAdapter;
import aula7.parte9.adapter.AdapterFactory;



public class AccountingController {

	private AccountingAdapter accountingAdapter;
	private AdapterFactory factory;
	
	public AccountingController() {
		System.out.println("AccountingController Criado!");
		factory = AdapterFactory.getInstance();
	}

	public void createAccountingAdapter(String name) {
		accountingAdapter = factory.createAccountingAdapter(name);
	}
	public void calculateTax(){
		accountingAdapter.registerTax();
	}
}
