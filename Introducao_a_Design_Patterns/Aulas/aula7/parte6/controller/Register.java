package aula7.parte6.controller;


import aula7.parte6.adapter.AccountingAdapterIBM;
import aula7.parte6.adapter.AccountingAdapterItauTec;
import aula7.parte6.adapter.AccountingAdapterSAP;
import aula7.parte6.adapter.IAccountingAdapter;
import aula7.parte6.adapter.IInventoryAdapter;
import aula7.parte6.adapter.InventoryAdpterIBM;
import aula7.parte6.adapter.InventoryAdpterItauTec;
import aula7.parte6.adapter.InventoryAdpterSAP;


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
		}else if (name.equals("SAP")){
			accountingAdapter = new AccountingAdapterSAP();
		}
	}
	
	public void createInventoryAdpter(String name){
		if(name.equals("IBM")){
			inventoryAdapter = new InventoryAdpterIBM();
		}else if (name.equals("ItauTec")){
			inventoryAdapter = new InventoryAdpterItauTec();
		}else if (name.equals("SAP")){
			inventoryAdapter = new InventoryAdpterSAP();
		}
	}
	
	public void decreaseItemQuantity(){
		inventoryAdapter.decreaseItemQuantity();
	}
	
	public void registerSaleAccountSystem(){
		accountingAdapter.finalizeSale();
	}
	
	
	
}
