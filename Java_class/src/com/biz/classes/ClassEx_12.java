package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_12 {
	
	public static void main(String[] args) {
		
		BankVO[] bankList=new BankVO[5];
		
		bankList[0]=new BankVO();
		bankList[1]=new BankVO();
		bankList[2]=new BankVO();
		bankList[3]=new BankVO();
		bankList[4]=new BankVO();
		
		for(int i=0;i<bankList.length;i++) {
			bankList[i].setStrDate("001");
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
		
	}

}
