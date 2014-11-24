package aula7.parte7.adapter;

import aula7.AccountSystem;

public abstract class AccountingAdapter {

	protected AccountSystem accountSystem;

	public void finalizeSale() {
		accountSystem.registerSale();
		
	}

	public void registerTax() {
		accountSystem.calculeTax();
		
	}	
}
