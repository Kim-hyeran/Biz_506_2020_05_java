package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_08 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("================================================");
		System.out.println("\t\t자바 메뉴 시스템");
		System.out.println("================================================");
		System.out.println("1.학생정보 입력 처리");
		System.out.println("2.성적 입력 처리");
		System.out.println("3.성적 정보 출력");
		System.out.println("-1.종료");
		System.out.println("------------------------------------------------");
		System.out.print("업무선택>> ");
		
		String strMenu=scan.nextLine();
		int intMenu=0;
		
		//예외처리(Exception Handling)
		// : exception이 발생할 가능성이 100만 분의 1이라도 있으면 try-catch문을 사용하여 Handling을 수행,
		//	 사용자가 어플을 사용하는데 혼란 혹은 어려움을 겪지 않도록 해주어야 한다
		try {
			intMenu=Integer.valueOf(strMenu);
		} catch (Exception e) {
			System.out.println("입력한 값 : "+strMenu);
			System.out.println("숫자 1, 2, 3 또는 -1만 입력할 수 있습니다.");
			return; //exception이 발생했으니 더 이상 다음 코드를 진행하지 말고 종료하도록 명령
		}
		
		if(intMenu==1) {
			System.out.println("학생정보 입력 처리");
		} else if(intMenu==2) {
			System.out.println("성적 정보 입력");
		} else if(intMenu==3) {
			System.out.println("성적 정보 출력");
		} else if(intMenu==-1) {
			System.out.println("퇴근!");
		} else {
			System.out.println("선택된 업무가 없습니다.");
		}
	}

}
