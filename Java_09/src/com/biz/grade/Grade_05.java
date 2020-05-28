package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<10000000;i++) {
			sum=100;
		}
		//sum은 얼마인가?
		System.out.println(sum);
		/*
		 * for 반복문 밖에서 정수형 변수가 선언되었기 때문에 for 반복문과 상관 없이
		 * 가장 마지막에 할당된 값을 출력한다.
		 */
		
		for(int i=0;i<10;i++) {
			System.out.println(sum);
		}
		
		Student student=new Student();
		
		//Student 클래스에 선언된 make() method를 호출하기
		student.make();
		
		String strN=student.getName();
		/*
		 * public class Student {
		 * String strName="홍길동";
		 * public void make() {
		 * strName="이몽룡";
		 * 		}
		 * 		strName 출력=>이몽룡
		 * 
		 * public String getName() {
		 * 		return strName;
		 *		} 
		 * }
		 * strName 출력=>오류 발생(변수가 괄호 안에서 선언되었기 때문에 괄호를 벗어나면 소멸된다. 따라서 값을 읽을 수 없어 오류가 발생한다.)
		 */
		System.out.println(strN);
		
		Random rnd=new Random();
		rnd.nextInt();
		
	}

}
