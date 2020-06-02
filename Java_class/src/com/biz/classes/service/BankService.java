package com.biz.classes.service;

import com.biz.classes.model.BankVO;

/*
 * main method가 없는 클래스는 직접 Run을 수행할 수 없다.
 * main method가 있는 코드에서 클래스를 인스턴스 선언하고, 인스턴스를 통해서 method를 호출해 사용해야 한다.
 */
public class BankService {

	/*
	 * method()
	 * 어떤 코드들의 묶음을 만들어두고 사용할 때 한두 줄의 명령문만으로 기능을 수행하고자 하는 경우 작성하는 코드
	 */
	
	/*
	 * BankVO 클래스로 생성한 인스턴스 "배열"에 담긴 데이터들을 매개변수로 받아서 무언가를 처리하는 method
	 */
	public void bankList(BankVO[] bankList) {
		System.out.println("입출금내역");
		System.out.println();
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");
		
		int sum=0;
		
		//bankList에 담긴 인스턴스 배열 갯수만큼 반복문 실행
		for(int i=0;i<bankList.length;i++) {
			sum+=bankList[i].getIntInput();
			sum-=bankList[i].getIntOutput();
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",bankList[i].getStrNum(),bankList[i].getStrDate(),
					bankList[i].getIntInput(),bankList[i].getIntOutput(),sum);
		}	
	}
	
	/*
	 * bankVO 클래스로 생성한 인스턴스에 담긴 데이터들을 매개변수로 받아서 무언가 처리하는 method
	 */
	public void bankList(BankVO bankVO) {
	}
	
}
