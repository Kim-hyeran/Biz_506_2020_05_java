package com.biz.bank.service;

import java.io.File;

/*
 * V3를 상속받음으로써
 * inputBalance(), outputBalance()와 loadBalance(), saveBalance() method 사용 가능
 */
public class BankServiceImplV4 extends BankServiceImplV3 {
	
	private String accNum="";
	private String basePackage="";
	
	//사용자로부터 계좌번호를 입력받는 역할 수행
	public boolean account() {
		basePackage="src/com/biz/bank/exec/data";
		
		System.out.print("계좌번호 입력(정수값 5자리 이내)>> ");
		accNum=scan.nextLine();
		try {
			//BALANCE-%05D : 정수 한 개를 입력해도 BALANCE-00001과 같이 다섯자리 정수로 자동 생성
			accNum=String.format("BALANCE-%05d.txt", Integer.valueOf(accNum));
		} catch (Exception e) {
			System.out.println("계좌번호는 정수 5자리 값만 입력할 수 있습니다.");
			return false;
		}
		
		//src/com/biz/bank/exec/data 문자열과 계좌번호 파일 문자열을 연결하여
		//src/com/biz/bank/exec/data/BALANCE-00001.txt라는 파일 객체로 생성
		//객체가 생성한 파일 이름을 추출하여 bFileName 필드변수에 저장
		//File file=new File(basePackage, accNum);
		
		this.bFileName=basePackage+File.separator+accNum;
		
		System.out.println("계좌파일 : "+bFileName);
		this.loadBalance(); //새로 입력된 계좌번호에 해당하는 정보 로딩
		
		return true;
	}

}
