package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImplV4;

public class BankEx_04 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		BankService bService=new BankServiceImplV4();
		
		while(true) {
			System.out.println("\n<빛고을 뱅크 계정계 시스템 v3>");
			System.out.println("============================================");
			System.out.println("1.입금처리");
			System.out.println("2.출금처리");
			System.out.println("3.입출금내역 출력");
			System.out.println("-1.업무종료");
			System.out.println("============================================");
			System.out.print("업무선택>> ");
			
			String strMenu=scan.nextLine();
			int intMenu=0;
			try {
				intMenu=Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴 선택은 숫자로만 할 수 있습니다.");
				continue;
			}
			
			if(intMenu==-1) {
				break;
			} else if(intMenu<1||intMenu>3) {
				System.out.println("선택된 업무가 없습니다.");
				continue;
			}
			
			/* Down Casting
			 * interface에 설정되지 않은(service class에만 존재하는) method를 호출하는 방법 
			 * interface를 설계할 당시 필요하지 않아 정의하지 않은 method는 보통 구현된 class 내에서만 사용하는 것으로, private, protected로 선언
			 * 	그러나 프로젝트가 진행되는 동안 구현된 class에 어떤 method를 추가하고,
			 * 	이 method를 외부에서 호출하여 어떤 행동을 수행해야 할 필요가 있을 경우 존재
			 * 객체를 선언할 때 interface로 선언을 하면 클래스에 구현된 method를 직접 호출하는 것이 불가능
			 * 이럴 경우 down Casting을 이용하여 해당 method를 사용 
			 */
			boolean bRet=((BankServiceImplV4)bService).account();
			if(!bRet) {
				continue;
			}
			
			if(intMenu==1) {
				//입금업무처리
				bService.inputBalance();
			} else if(intMenu==2) {
				//출금업무처리
				bService.outputBalance();
			} else if(intMenu==3) {
				//입출금내역 출력
				bService.listBalance();
			}
			
		}
		
	}

}