package aula7.parte2.adapter;

import aula7.AccountSystem;

public class AccountingAdapterItauTec implements IAccountingAdapter{

	private AccountSystem accountSystem;
	
	
	@Override
	public void finalizeSale() {
		accountSystem.registerSale();
	}

	@Override
	public void registerTax() {
		accountSystem.calculeTax();
	}

}
