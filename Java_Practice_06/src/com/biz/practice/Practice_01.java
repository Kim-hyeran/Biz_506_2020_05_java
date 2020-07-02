package com.biz.practice;

import java.util.Random;

public class Practice_01 {
	
	public static void main(String[] args) {
		
		//임의의 숫자 세 개의 크기 비교
		
		Random rnd=new Random();
		
		//1부터 100까지 중 임의의 숫자를 변수에 저장
		int a=rnd.nextInt(100)+1;
		int b=rnd.nextInt(100)+1;
		int c=rnd.nextInt(100)+1;
		
		//변환하기 전 값을 저장할 변수 선언
		int temp=0;
		
		//변수 a에 가장 작은 값이 담기도록 코드 작성
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
			} if(a>c) {
				temp=a;
				a=c;
				c=temp;
			}
			
		//변수 c에 가장 큰 값이 담기도록 코드 작성
			if(b>c) {
				temp=b;
				b=c;
				c=temp;
			}
		
		System.out.println(a+"<"+b+"<"+c);
		
	}

}
