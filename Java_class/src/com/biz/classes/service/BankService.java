package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {

	public void banklist (BankVO[] banklist) {
		
		System.out.println("계좌번호\t 날짜\t 입금\t 출금\t 잔액");
		
		for(int i=0; i<banklist.length; i++) {
			System.out.printf("%s\t %s\t %d\t %d\t %d\t\n",
					banklist[i].getStrnum(),
					banklist[i].getStrdate(),
					banklist[i].getIntInput(),
					banklist[i].getIntOutput(),
					banklist[i].getIntValance());
			
		}
		
		
	}
}
