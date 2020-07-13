package com.biz.grade;

import java.util.Random;

public class Array_06 {
	public static void main(String[] args) {
		
		//Random 클래스를 사용해서 rnd객체, rnd인스턴스를 선언하고 사용할 수 있도록 초기화하는 코드
		//			Random 클래스의 생성자
		Random rnd=new Random();
		
		//인스턴스(instance), 객체(object) : Random 클래스로 만든 rnd변수
		//.nextInt(100) : Random클래스의 Method라고 부른다
		//rnd 객체의 nextInt() Method 실행(호출) 명령이라 한다
		rnd.nextInt(100);
		
		String strN="홍길동"; //문자열 변수 strN
		String strM=new String(); //strM 인스턴스 혹은 객체라고 부른다
		
		int[] intNum=new int[100];
		
		for(int i=0;i<100;i++) {
			//rnd객체의 nextInt() Method를 실행(호출)하여 결과값을 배열 intNum의 i번째 위치에 저장(할당, 보관)하라
			intNum[i]=rnd.nextInt(100)+1;
		}
		
		//배열에 저장된 요소들 중 다섯개씩 덧셈을 수행할 변수를 선언
		int intSum=0;
		
		for(int i=0;i<100;i++) {
			System.out.printf("%d\t",intNum[i]);
			intSum+=intNum[i];
			
			if((i+1)%5==0) {
				System.out.println(intSum);
				intSum=0;
			}
		}
		
	}

}
