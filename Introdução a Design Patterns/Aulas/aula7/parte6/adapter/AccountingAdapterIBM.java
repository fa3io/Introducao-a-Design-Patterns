package aula7.parte6.adapter;

import aula7.AccountSystem;

public class AccountingAdapterIBM implements IAccountingAdapter {

	private AccountSystem accountSystem;
	
	public AccountingAdapterIBM() {
		accountSystem = new AccountSystem("IBM");
	}
	
	@Override
	public void finalizeSale() {
		accountSystem.registerSale();
	}

	@Override
	public void registerTax() {
		accountSystem.calculeTax();
	}

}
