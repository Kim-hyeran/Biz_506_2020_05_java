package com.biz.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {
	
	List<AccountVO> accList;
	Scanner scan;
	AccountVO accVO;
	int sum=100000;
	
	public BankServiceImplV1() {
		accList=new ArrayList<AccountVO>();
		scan=new Scanner(System.in);
		accVO=new AccountVO();
	}

	@Override
	public boolean inputBalance() {
		//System.out.print("계좌번호>> ");
		//String strNum=scan.nextLine();
		
		//System.out.print("날짜>> ");
		//String strDate=scan.nextLine();
		
		System.out.print("입금액>> ");
		String strInput=scan.nextLine();
		int intInput=0;
		try {
			intInput=Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("금액은 숫자로만 입력할 수 있습니다.");
		}
		
		//accVO.setNum(strNum);
		//accVO.setDate(strDate);
		accVO.setInput(intInput);
		
		accList.add(accVO);
		
		return true;
	}

	@Override
	public boolean outputBalance() {
		System.out.print("출금액>> ");
		String strOutput=scan.nextLine();
		int intOutput=0;
		try {
			intOutput=Integer.valueOf(strOutput);
		} catch (Exception e) {
			System.out.println("금액은 숫자로만 입력할 수 있습니다.");
		}
		if(intOutput>sum) {
			System.out.println("잔액보다 큰 금액은 출금할 수 없습니다.");
			return true;
		}
		
		accVO.setOutput(intOutput);
		
		accList.add(accVO);
		
		return true;
	}

	@Override
	public void listBalance() {
		
		int listSize=accList.size();
		
		System.out.println("\n\t<입출금내역>");
		System.out.println("==============================");
		System.out.println("입금\t출금\t잔액");
		System.out.println("------------------------------");
		
		for(int i=0; i<listSize; i++) {
			//System.out.print(accVO.getNum()+"\t");
			//System.out.print(accVO.getDate()+"\t");
			System.out.print(accVO.getInput()+"\t");
			System.out.print(accVO.getOutput()+"\t");
			
			sum+=accVO.getInput();
			sum-=accVO.getOutput();
			
			System.out.println(sum);
		}
		
		System.out.println("==============================");
		
	}

}
