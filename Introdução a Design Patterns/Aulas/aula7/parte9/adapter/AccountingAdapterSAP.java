package aula7.parte9.adapter;

import aula7.AccountSystem;

public class AccountingAdapterSAP extends AccountingAdapter{
	
	public AccountingAdapterSAP() {
		accountSystem = new AccountSystem("SAP");
	}
}
