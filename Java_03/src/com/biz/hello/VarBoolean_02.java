package com.biz.hello;

public class VarBoolean_02 {
	
	/*
	 * 코드 작성할 때 들여쓰기 생활화
	 */
	public static void main(String[] args) {
		
		int num1=18;
		int num2=7;
		
		int numP=num1+num2;
		int numM=num1-num2;
		int numT=num1*num2;
		int numD=num1/num2;
		
		boolean bVar1=(numP)%2==0;
		boolean bVar2=(numM)%2==0;
		boolean bVar3=(numT)%2==0;
		boolean bVar4=(numD)%2==0;
		
		System.out.println(bVar1);
		System.out.println(bVar2);
		System.out.println(bVar3);
		System.out.println(bVar4);
		
		if(bVar1==true) {
			System.out.println("덧셈 결과는 짝수이다");
		}
		if(bVar2==true) {
			System.out.println("뺄셈 결과는 짝수이다");
		}
		if(bVar3) {
			System.out.println("곱셈 결과는 짝수이다");
		}
		if(bVar4) {
			System.out.println("나눗셈 결과는 짝수이다");
		}
	}

}
