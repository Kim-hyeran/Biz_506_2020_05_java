package com.biz.hello;

import java.util.Random;

public class VarBoolean_05 {
	public static void main(String[] args) {
		
		Random rnd=new Random();
		int num1=rnd.nextInt(100);
		boolean bVar=(num1%2)==0;
		
		if(bVar) {
		System.out.println(num1+"은(는) 짝수이다");
		}
		if(!bVar) {
		System.out.println(num1+"은(는) 짝수가 아니다");
		}
	}
}
