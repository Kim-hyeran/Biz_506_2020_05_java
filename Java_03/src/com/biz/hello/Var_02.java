package com.biz.hello;

import java.util.Random;

public class Var_02 {

	public static void main(String[] args) {
		
		Random rnd=new Random();
		int num1=rnd.nextInt(100)+1;
		int num2=rnd.nextInt(100)+1;
		
		boolean bVar1=(num1+num2)%2==0;
		boolean bVar2=(num1-num2)%2==0;
		boolean bVar3=(num1*num2)%2==0;
		boolean bVar4=(num1/num2)%2==0;
		
		if(bVar1) {
			System.out.println("덧셈연산 결과는 짝수이다");
		}
		if(bVar2) {
			System.out.println("뺄셈연산 결과는 짝수이다");
		}
		if(bVar3) {
			System.out.println("곱셈연산 결과는 짝수이다");
		}
		if(bVar4) {
			System.out.println("나눗셈연산 결과는 짝수이다");
		}
		
	}
}
