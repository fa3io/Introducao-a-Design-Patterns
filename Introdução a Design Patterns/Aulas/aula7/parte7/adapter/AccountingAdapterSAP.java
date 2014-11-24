package aula7.parte7.adapter;

import aula7.AccountSystem;

public class AccountingAdapterSAP extends AccountingAdapter{
	
	public AccountingAdapterSAP() {
		accountSystem = new AccountSystem("SAP");
	}
}
