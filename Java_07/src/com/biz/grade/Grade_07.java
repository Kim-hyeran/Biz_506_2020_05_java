package com.biz.grade;

public class Grade_07 {
	
	/*
	 * 100명 학생의 국어 점수를 임의로 만들어서 변수에 담고 총점과 평균 구하기
	 */
	public static void main(String[] args) {
		
		int intKor01=0;
		intKor01=99;
		int intKor02=0;
		intKor02=77;
		
		int[] intKorScore=new int[100];
		intKorScore[0]=88;
		intKorScore[88]=100;
		
		System.out.println(intKorScore[0]);
		System.out.println(intKorScore[88]);
		
	}

}
