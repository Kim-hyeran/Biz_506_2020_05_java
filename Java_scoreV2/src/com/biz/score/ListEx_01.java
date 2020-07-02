package com.biz.score;

import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		//객체(인스턴스)들의 묶음 객체
		//List<Generic> 리스트에 포함된 객체가 무엇인지 명시
		List<String> strList;	//String 객체(문자열)이 요소로 포함된 리스트
		strList=new ArrayList<String>();
		
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라만세");
		
		int size=strList.size();
		for(int i=0; i<size; i++) {
			String str=strList.get(i);
			System.out.println(str);
		}
		
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("홍길동");
		
		size=strList.size();
		for(int i=0; i<size; i++) {
			System.out.println(strList.get(i));
		}
		
		/*
		 * for문이 strList 갯수만큼 반복 수행되는 동안 계속해서 size() method를 호출하여 연산 수행
		 *strList 갯수가 for 반복문 내에서 변경되지 않는 경우 매우 불필요한 연산을 반복 수행하게 된다
		 * for(int i=0; i<strList.size(); i++) {
		 *	System.out.println(strList.get(i));
		 * }
		 */
		
		/* 
		 * list 갯수를 한 번만 조회하고 for 반복문 수행하기
		 * 이 코드는 갯수를 한 번만 조회하고 for 반복문을 수행하기 때문에 size() method를 직접 호출하는 것보다 효율적
		 * 하지만 갯수를 조회하는 코드를 생략하면 리스트 갯수가 변경되었을 때 for반복문 연산 수행에 문제 발생 가능성 존재
		 * size=strList.size();
		 * for(int i=0; i<size; i++) {
		 * 	System.out.println(strList.get(i));
		 * }
		 */
		
		/* 확장된 for 반복문(=forEach)
		 *	: list 전체에 대해서 for 반복문을 수행할 경우 사용할 수 있는 향상된 for 반복문
		 * 1. strList 갯수만큼 알아서 for문이 반복된다
		 * 2. for문이 반복되면서 strList.get(현재)를 str 변수에 할당
		 * 3. for 반복문 내에서 str 변수 값을 읽어서 사용
		 */
		for(String str:strList) {
			System.out.println(str);
		}
		
		//배열도 향상된 for문을 사용하여 반복문을 수행할 수 있다
		int[] intArray=new int[100];
		for(int i:intArray) {
			System.out.println(i);
		}
		
	}

}
