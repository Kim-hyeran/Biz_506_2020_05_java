package com.biz.grade;

public class Array_03 {
	public static void main(String[] args) {
		
		/*
		 * 1부터 100까지 범위의 수 중 짝수의 갯수는 몇개인가
		 * 1부터 100까지 범위의 수 중 3의 배수의 갯수는 몇개인가
		 */
		
		int intCount=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				intCount++;
			}
		}
		System.out.println("짝수의 갯수 : "+intCount);
		
		intCount=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				intCount++;
			}
		}
		System.out.println("3의 배수의 갯수 : "+intCount);
		
	}

}
