package com.biz.hello;

import java.util.Random;

public class Var_03 {
	public static void main(String[] args) {
		
		Random rnd=new Random();
		int num=rnd.nextInt((1000)+1)*10;
		
		System.out.println("VAT 포함 가격 : "+num);
		System.out.println("VAT 별도 가격 : "+(int)(num/1.1));
		System.out.println("VAT : "+(num-(int)(num/1.1)));
		
	}

}
