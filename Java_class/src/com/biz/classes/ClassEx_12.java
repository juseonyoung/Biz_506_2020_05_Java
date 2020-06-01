package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_12 {

	public static void main(String[] args) {
		
		BankVO[] banklist = new BankVO[5];
		
		banklist[0] = new BankVO();
		banklist[1] = new BankVO();
		banklist[2] = new BankVO();
		banklist[3] = new BankVO();
		banklist[4] = new BankVO();
		
		banklist[0].setStrdate("2020-05-01");
		banklist[1].setStrdate("2020-05-02");
		banklist[2].setStrdate("2020-05-03");
		banklist[3].setStrdate("2020-05-04");
		banklist[4].setStrdate("2020-05-05");
		
		for(int i =0; i<banklist.length; i++) {
		banklist[i].setStrnum("001");
		}
		
		banklist[0].setIntInput(5000);
		banklist[2].setIntInput(5000);
		
		banklist[1].setIntOutput(1000);
		banklist[3].setIntOutput(1000);
		banklist[4].setIntOutput(1000);
		
		
	}
}
