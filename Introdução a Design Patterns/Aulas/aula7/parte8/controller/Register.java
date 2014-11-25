package aula7.parte8.controller;

import aula7.parte8.adapter.AccountingAdapter;
import aula7.parte8.adapter.AdapterFactory;
import aula7.parte8.adapter.InventoryAdapter;



public class Register {

	private InventoryAdapter inventoryAdapter;
	private AccountingAdapter accountingAdapter;
	private AdapterFactory factory;

	public Register() {
		System.out.println("Register Controller Created !!");
		factory = new AdapterFactory();
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
