package com.biz.bank.exec;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImplV2;

public class BankEx_02 {

	public static void main(String[] args) {
		
		BankService bService = new BankServiceImplV2();
		
	
		
		//bService.inputBalance();
		
		
		//bService.outputBalance();	
		bService.listBalance();
		
	}
}
