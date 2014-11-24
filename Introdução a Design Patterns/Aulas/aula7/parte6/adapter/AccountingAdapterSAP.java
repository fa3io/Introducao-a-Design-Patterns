package aula7.parte6.adapter;

import aula7.AccountSystem;

public class AccountingAdapterSAP implements IAccountingAdapter{
	
	private AccountSystem accountSystem;
	
	public AccountingAdapterSAP() {
		accountSystem = new AccountSystem("SAP");
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
