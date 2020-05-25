package com.biz.hello;

public class Var_06 {
	public static void main(String[] args) {

		int num=0;
		int index=0;

		for (num=2;num<=100;num++) {
			for (index=2; index<num;index++) {
				if (num%index==0) {
					break;
				}
			}
			if (num==index) {
				System.out.println(num);
				}
		}
		
		System.out.println();
		
		//2부터 100까지 반복
		for(int i=2;i<=100;i++) {
			int j=2;
			//2부터 i-1까지 반복
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println(i+"는 소수");
				}
		}

	}
}
