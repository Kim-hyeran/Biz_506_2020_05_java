package com.biz.addr.exec;

public class Number_Ex {
	
	public static void main(String[] args) {
		
		/*
		 * 숫자형 Wrapper class의 valueOf() method를 사용하면 숫자형 문자열을 숫자형 데이터로 변환시킬 수 있다
		 * 오래된 자바 버전에서는 valueO()와 parse***() method 간의 성능 차이가 있었으나
		 * 	java1.6 이상에서는 내부 매커니즘이 같아져 성능 차이가 없다
		 */
		
		//Integer.valueOf() : 숫자형 문자열을 정수로 변환시키는 method(String→Integer→int), 자바 1.5 이후 탄생
		Integer.valueOf("34"); //정수 34
		Float.valueOf("34.3");
		Double.valueOf("34.3");
		Long.valueOf("333333");
		
		//parse : java1.5 이전 사용(String→int)
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("34.3");
		Long.parseLong("333333");
		
		//NumberFormatException을 발생시키는 코드 예시
		Integer.valueOf("");
		Integer.valueOf("34 "); //숫자 앞뒤 공백(white space) 문제
		Integer.valueOf("A34"); //숫자 앞뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); //숫자 중간에 space나 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); //하나의 문자열이 연산식처럼 보일 때
		
	}

}
