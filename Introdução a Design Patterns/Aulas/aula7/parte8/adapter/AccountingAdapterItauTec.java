package aula7.parte8.adapter;

import aula7.AccountSystem;

public class AccountingAdapterItauTec extends AccountingAdapter{


	
	public AccountingAdapterItauTec() {
		accountSystem = new AccountSystem("ItauTec");
		}
}
