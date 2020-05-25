package com.biz.hello;

public class Var_08 {
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		int sum=0;
				
		for(i=2;i<=100;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				sum+=i;
			}
		} //for(i)문이 끝나는 곳
		System.out.println(sum);
	}

}
