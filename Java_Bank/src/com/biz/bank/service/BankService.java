package com.biz.bank.service;

public interface BankService {

	/*
	 * 은행의 내 계좌에 입출금을 처리 할 텐데 초기의 내 계좌잔액 100,000으로 설정하고
	 * inputBalance() 호출하여 입금처리를 수행하고
	 * 
	 * outputBalance() 호출하여 출금처리를 수행!
	 * 이때, 출금할 때 내 계좌에 잔액보다 큰 금액을 출금하려고 하면 출금이 안되도록 하고
	 * 잔액보다 적은 금액을 출금하면 출금이 이루어지도록 하는메서드(boolean?)
	 * 
	 * listbalance 호출하여 현재까지의 입출금 내역과 잔액을 표시하도록 한다
	 * 
	 */
	public boolean inputBalance(); //입금처리
	// return 타입 모르겠으면 처음에 void 해놓고 나중에 boolean 필요하면 불린으로
	//정확히 수행 되었는지 알 수 있도록..
	
	public boolean outputBalance(); // 출금처리
	public void listBalance(); // 입출금내역 
	
}
