package com.biz.hello;

import java.util.Random;

public class Var_04 {
	public static void main(String[] args) {
		
		Random rnd=new Random();
		int num=rnd.nextInt(100)+1;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.printf("%d로 나눈 나머지가 0이므로 %d은(는) 소수가 아님\n",i,num);
				break;
			/*
			 * 2부터 num-1까지 범위의 값으로 num를 나누어 한 번이라도 나머지가 0이 아닌 경우가 나타나면
			 * num는 소수가 아니므로 나머지 범위의 값은 검사할 필요가 없다
			 * 그러므로 더 이상 for 반복문을 진행할 필요가 없다
			 * 그렇기 때문에 break문을 사용하여 for 반복문을 중단한다
			 */
				}
		}
		
	}

}
