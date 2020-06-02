package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {
// 배열을 매개변수로 받음
	
	public void address(AddressVO[] address) {
		//똑같은 형태로([])로 매개변수 받아야 한다.
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("주소록");
		System.out.println(s_line);
		System.out.println("나이\t주소\t이름\t번호");
        System.out.println(s_line);
        
		for(int i=0; i<address.length; i++) {
			System.out.printf("%d\t %s\t %s\t %s\t\n",
					address[i].getAge(),
					address[i].getAddr(),
					address[i].getName(),
					address[i].getTel()
					);
		}
		System.out.println(d_line);
	}
}
