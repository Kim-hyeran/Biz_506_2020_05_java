package com.biz.grade;

import java.util.Random;

public class Grade_12 {
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		int[] intNum=new int[10];
		int intSum=0;
		
		for(int i=0;i<10;i++) {
			intNum[i]=rnd.nextInt(50)+51;
			
			if(intNum[i]%2==0) {
				intSum+=intNum[i];
			}
		}
		System.out.println("임의의 짝수 합 : "+intSum);
	}

}
