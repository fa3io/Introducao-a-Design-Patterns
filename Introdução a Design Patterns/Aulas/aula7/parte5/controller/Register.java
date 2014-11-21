package aula7.parte5.controller;

import aula7.parte5.adapter.AccountingAdapterIBM;
import aula7.parte5.adapter.AccountingAdapterItauTec;
import aula7.parte5.adapter.IAccountingAdapter;
import aula7.parte5.adapter.IInventoryAdapter;
import aula7.parte5.adapter.InventoryAdpterIBM;
import aula7.parte5.adapter.InventoryAdpterItauTec;

public class Register {
	
	private IInventoryAdapter inventoryAdapter;
	private IAccountingAdapter accountingAdapter;
	
	
	public Register() {
		System.out.println("Register Controller Created !!");
	}
	
	public void createAccountAdpter(String name){
		if(name.equals("IBM")){
			accountingAdapter = new AccountingAdapterIBM();
		}else if (name.equals("ItauTec")){
			accountingAdapter = new AccountingAdapterItauTec();
		}
	}
	
	public void createInventoryAdpter(String name){
		if(name.equals("IBM")){
			inventoryAdapter = new InventoryAdpterIBM();
		}else if (name.equals("ItauTec")){
			inventoryAdapter = new InventoryAdpterItauTec();
		}
	}
	
	public void decreaseItemQuantity(){
		inventoryAdapter.decreaseItemQuantity();
	}
	
	public void registerSaleAccountSystem(){
		accountingAdapter.finalizeSale();
	}
	
	
	
}
