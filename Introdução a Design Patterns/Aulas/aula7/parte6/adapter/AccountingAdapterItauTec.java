package aula7.parte6.adapter;

import aula7.AccountSystem;

public class AccountingAdapterItauTec implements IAccountingAdapter{

	private AccountSystem accountSystem;
	
	public AccountingAdapterItauTec() {
		accountSystem = new AccountSystem("ItauTec");
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
