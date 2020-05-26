package com.biz.grade;

import java.util.Random;

public class Grade_13 {
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		int[] intNum=new int[100];
		int intSum=0;
		
		for(int i=0;i<100;i++) {
			intNum[i]=rnd.nextInt(100)+1;
		}
		
		for(int i=0;i<100;i++) {
			if(intNum[i]%3==0||intNum[i]%5==0) {
				intSum+=intNum[i];
			}
		}
		
		System.out.println("3의 배수 또는 5의 배수들의 합 : "+intSum);
	}

}
