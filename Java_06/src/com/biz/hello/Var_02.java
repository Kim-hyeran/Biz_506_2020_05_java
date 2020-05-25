package com.biz.hello;

public class Var_02 {
	public static void main(String[] args) {
		
		int num=0;
		int sum=0;
		
		for(num=0,sum=0;num<=100;num++) {
			if(num%3==0) {
				sum+=num;
			}
		}
		System.out.println("3의 배수의 합 : "+sum);
		
		sum=0;
		
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 합 : "+sum);
		
	}

}
