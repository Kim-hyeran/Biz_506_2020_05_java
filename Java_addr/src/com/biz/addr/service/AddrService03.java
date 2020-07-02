package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO_1;

public class AddrService03 {
	
	private List<AddrVO_1> addrList;
	
	private Scanner scan;
	
	public AddrService03() {
		addrList=new ArrayList<AddrVO_1>();
		scan=new Scanner(System.in);
	}
	
	/*
	 * 현재 코드는 main에서 지정된 for 반복문의 갯수만큼 입력을 수행해야 한다
	 * 입력하는 도중 입력을 중단하고 싶을 경우 중단할 수 있도록 코드를 개선
	 * 
	 * 입력하는 도중 이름 항목에 이름 대신 END 문자열을 입력하면 입력을 중단한다
	 */
	public boolean inputAddr() {
		System.out.print("이름(중단:END)>> ");
		String strName=scan.nextLine();
		
		//만약 이름을 입력할 때 문자열 END를 입력하면 더 이상 진행하지 말고 false return하고 method를 중단시키는 명령
		//문자열 비교는 비교연산자로 비교해서는 안된다(객체자료형 변수이기 때문)
		//if(strName=="END") {
		if(strName.equals("END")) {
			return false;
		}

		System.out.print("전화번호>> ");
		String strTel=scan.nextLine();
		
		System.out.print("주소>> ");
		String strAddr=scan.nextLine();
		
		System.out.print("나이>> ");
		String strAge=scan.nextLine();
		int intAge=0;
		try {
			intAge=Integer.valueOf(strAge);
		} catch (Exception e) {
			System.out.println("나이 입력은 숫자만 가능합니다.");
			System.out.println("나이 입력이 잘못되어 0으로 임시저장합니다.");
		}
		
		System.out.print("관계>> ");
		String strNet=scan.nextLine();
		
		AddrVO_1 addrVO=new AddrVO_1();
		addrVO.setName(strName);
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setAge(intAge);
		addrVO.setNet(strNet);
		addrList.add(addrVO);
		
		return true;
	}
	
	public void addrList() {
		
		System.out.println();
		System.out.println("\t\t주소록");
		System.out.println("============================================================");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("------------------------------------------------------------");
		
		//i<5로 설정하게되면, 5명의 주소록을 표시할 땐 문제가 없으나 주소록 데이터 갯수가 변경되면 문제가 발생한다.
		//따라서 addrList의 갯수를 별도의 변수에 담고
		int addrSize=addrList.size();
		//배열의 크기만큼 반복문을 수행하도록 한다
		for(int i=0;i<addrSize;i++) {
			AddrVO_1 vo=addrList.get(i);
			System.out.printf("%s\t%s\t%s\t%d\t%s\n", vo.getName(), vo.getTel(), vo.getAddr(), vo.getAge(), vo.getNet());
		}
		
		System.out.println("============================================================");
		
	}

}