package aula7.parte7.adapter;

import aula7.AccountSystem;

public class AccountingAdapterIBM extends AccountingAdapter {
	
	public AccountingAdapterIBM() {
		accountSystem = new AccountSystem("IBM");
	}
}
