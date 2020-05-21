package com.biz.hello;

public class VarBoolean_01 {
	
	public static void main(String[] args) {
		
		int num1;
		num1=56;
		
		if(num1%2==0) {
			System.out.println(num1+"은(는) 짝수이다");
		}
		if(num1%2!=0) {
			System.out.println(num1+"은(는) 짝수가 아니다");
		}
		
		int num2=30;
		boolean bVar=(num2%2)==0;

		//bVar만 입력해도 된다
		if(bVar==true) {
			System.out.println(num2+"은(는) 짝수이다");
		}
	}

}
