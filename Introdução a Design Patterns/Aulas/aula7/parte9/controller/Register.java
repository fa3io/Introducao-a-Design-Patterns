package aula7.parte9.controller;

import aula7.parte9.adapter.AccountingAdapter;
import aula7.parte9.adapter.AdapterFactory;
import aula7.parte9.adapter.InventoryAdapter;

public class Register {

	private InventoryAdapter inventoryAdapter;
	private AccountingAdapter accountingAdapter;
	private AdapterFactory factory;

	public Register() {
		System.out.println("Register Controller Created !!");
		factory = AdapterFactory.getInstance();
	}

	public void createAccountAdpter(String name) {

		accountingAdapter = factory.createAccountingAdapter(name);
	}

	public void createInventoryAdpter(String name) {
		inventoryAdapter = factory.createInventoryAdapter(name);

	}

	public void decreaseItemQuantity() {
		inventoryAdapter.decreaseItemQuantity();
	}

	public void registerSaleAccountSystem() {
		accountingAdapter.finalizeSale();
	}

}
