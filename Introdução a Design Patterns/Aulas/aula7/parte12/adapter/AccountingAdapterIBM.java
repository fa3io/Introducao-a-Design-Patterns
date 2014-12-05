package aula7.parte12.adapter;

import aula7.AccountSystem;

public class AccountingAdapterIBM extends AccountingAdapter {
	
	public AccountingAdapterIBM() {
		accountSystem = new AccountSystem("IBM");
	}
}
