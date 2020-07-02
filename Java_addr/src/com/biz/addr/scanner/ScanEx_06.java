package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_06 {
	
	public static void main(String[] args) {
		
		/*
		 * scanner를 이용해서 nextInt(), nextLine() 메서드를 섞어 사용하면 내부 문제로 인해 코드가 의도하지 않는 방식으로 진행되어
		 * 숫자, 문자 모두 문자열을 입력 받는 nextLine() 메서드로 통일하여 사용한다
		 * 
		 * scanner의 내부 문제에 의한 코드 진행 문제를 해결하기 위해 키보드로부터 값을 읽는 method를 nextLine()만 사용하기로 하었다
		 * 그런데 숫자 2개를 입력받아 덧셈을 수행한 후 결과를 보고 싶은 코드를 작성하고 나니
		 * 숫자의 덧셈이 아닌 숫자형 문자열의 연결을 만드는 코드가 되어버렸다
		 * 
		 * 만약 키보드에서 입력받은 문자열을 숫자형(int, float)으로 변환할 수 있다면
		 * nextLine()을 사용하여 원하는 결과를 얻을 수 있을 것이다
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		String strNum1=scan.nextLine();
		
		//Integer.valueOf() method를 사용하여 숫자형으로 된 문자열 데이터를 정수형 데이터로 변환
		int intNum1=Integer.valueOf(strNum1);
		
		System.out.print("숫자2 : ");
		String strNum2=scan.nextLine();
		int intNum2=Integer.valueOf(strNum2);
		
		System.out.println(strNum1+strNum2);
		System.out.printf("%d+%d=%d\n", intNum1, intNum2, intNum1+intNum2);
		
		System.out.print("문자열 입력 : ");
		String strInput=scan.nextLine();
		System.out.println("입력된 문자열 : "+strInput);

		scan.close();
		
	}

}
