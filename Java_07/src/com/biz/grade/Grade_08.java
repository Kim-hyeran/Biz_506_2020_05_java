package com.biz.grade;

import java.util.Random;

public class Grade_08 {
	public static void main(String[] args) {
		
		Random random=new Random();
		
		int[] intKorScore=new int[10];
		intKorScore[0]=random.nextInt(50)+50;
		intKorScore[1]=random.nextInt(50)+50;
		intKorScore[2]=random.nextInt(50)+50;
		intKorScore[3]=random.nextInt(50)+50;
		intKorScore[4]=random.nextInt(50)+50;
		intKorScore[5]=random.nextInt(50)+50;
		intKorScore[6]=random.nextInt(50)+50;
		intKorScore[7]=random.nextInt(50)+50;
		intKorScore[8]=random.nextInt(50)+50;
		intKorScore[9]=random.nextInt(50)+50;
		
		/*
		 *intKorScore배열을 10개 생성하여 각 변수에 점수를 저장하려고 명령을 수행하는 과정에서 ArrayIndexOutOfBoundsExcepotion이 발생했다.
		 *그 이유는 intKorScore배열은 10개만 생성되어 실제 index값은 0부터 9까지만 사용할 수 있다.
		 *그런데 10번 index에 값을 저장하려고 명령을 수행했기 때문에 Exception이 발생한 것이다.
		 */
		//intKorScore[10]=random.nextInt(50)+50;
		
	}

}
