package com.biz.grade;

import java.util.Random;

public class Grade_05 {
	public static void main(String[] args) {
		
		Random random=new Random();
		
		int intKor1=random.nextInt(50)+51;
		int intKor2=random.nextInt(50)+51;
		int intKor3=random.nextInt(50)+51;
		int intKor4=random.nextInt(50)+51;
		int intKor5=random.nextInt(50)+51;
		int intKor6=random.nextInt(50)+51;
		int intKor7=random.nextInt(50)+51;
		int intKor8=random.nextInt(50)+51;
		int intKor9=random.nextInt(50)+51;
		int intKor10=random.nextInt(50)+51;
		
		int intSum=0;

		intSum=intKor1+intKor2+intKor3+intKor4+intKor5+intKor6+intKor7+intKor8+intKor9+intKor10;
		
		System.out.println("국어 점수");
		System.out.println("1번 학생 : "+intKor1);
		System.out.println("2번 학생 : "+intKor2);
		System.out.println("3번 학생 : "+intKor3);
		System.out.println("4번 학생 : "+intKor4);
		System.out.println("5번 학생 : "+intKor5);
		System.out.println("6번 학생 : "+intKor6);
		System.out.println("7번 학생 : "+intKor7);
		System.out.println("8번 학생 : "+intKor8);
		System.out.println("9번 학생 : "+intKor9);
		System.out.println("10번 학생 : "+intKor10);
		System.out.println();
		System.out.println("총점 : "+intSum);
		System.out.println("평균 : "+intSum/10);
		
	}

}
