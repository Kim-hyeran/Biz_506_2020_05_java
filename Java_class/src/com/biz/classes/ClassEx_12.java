package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankService;

public class ClassEx_12 {
	
	public static void main(String[] args) {
		
		BankVO[] bankList=new BankVO[5];
		
		for(int i=0;i<bankList.length;i++) {
<<<<<<< HEAD
			bankList[i]=new BankVO();
=======
>>>>>>> f232900e54b2537918aba55fb3a10fecedfb4809
			bankList[i].setStrNum("001");
		}
		
		bankList[0].setStrDate("2020-05-01");
		bankList[1].setStrDate("2020-05-02");
		bankList[2].setStrDate("2020-05-03");
		bankList[3].setStrDate("2020-05-04");
		bankList[4].setStrDate("2020-05-05");
		
		bankList[0].setIntInput(5000);
		bankList[2].setIntInput(5000);
		
		bankList[1].setIntOutput(1000);
		bankList[3].setIntOutput(1000);
		bankList[4].setIntOutput(1000);
		
		//기본형 변수들(Primitive Variable)
		int num=0; //integer형 변수 num를 선언하고 0으로 clear
		long num1=0; //long형 변수 num1을 선언하고 0으로 clear
		float num2=0.0f;
		double num3=0.0;
		boolean bYes=false;
		char char1='c'; //character형 변수 char1을 선언하고 문자 c를 저장
		
		//String(문자열)형 변수는 변수처럼 사용하지만 일반 변수와 달리 String 클래스로 만든 String형 인스턴스라고 해야 한다.
		String strName="홍길동";
		//String strName=new String("홍길동");
		String strNation=new String(); //String Class형의 인스턴스
		
		//BankService 클래스를 사용해서 bankService라는 변수 선언
		//이 때 bankService 변수를 "객체(Object)", "인스턴스(Instance)"라고 한다.
		BankService bankService=new BankService();
								//초기화
		//bankService 인스턴스를 통해서 bankService() method를 호출하면
		//BankService 클래스 내에 정의된 bankList() method 내의 코드들이 순서대로 실행된다.
		
		bankService.bankList(bankList);
		
	}

}
