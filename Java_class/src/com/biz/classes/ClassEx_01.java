package com.biz.classes;

/*
 * 클래스(Class)
 * Java 언어를 사용하여 코딩을 할 때 가장 기본적인 파일의 단위
 * 
 * 클래스의 이름 짓기
 * 첫 글자는 반드시 영문 대문자를 사용한다.
 * 두 번째 글자부터 영문 대소문자, 숫자, 언더바(_)를 사용할 수 있다.
 * 한글로도 작성할 수 있지만 대소문자 구분 문제로 잘 사용하진 않는다.
 * 클래스와 파일 이름은 항상 같아야 한다.
 * 한 개의 파일에는 한 개의 클래스만 작성하는 것이 좋다.
 * 
 * 클래스 중에서 main() method가 있는 클래스는 Run했을 때 제일 먼저 실행된다.
 * main() method를 진입점, 시작점이라고 한다.
 * 
 * main() method가 없는 클래스는 혼자서 코드 작동이 되지 않는다.
 */
public class ClassEx_01 {

	public static void main(String[] args) {
		
		//코드가 실행된다=코드가 컴파일되어 내부적으로 연산이 이루어진다.
		int num1=10;
		int num2=20;
		
		System.out.println(num1+num2);
		
	}

}
