package com.biz.service;

/*
 * 클래스 중에서 main() method가 없는 클래스는 혼자서 아무런 기능을 수행하지 못한다.
 * main() method가 없는 클래스의 기능을 이용하고 싶으면 main() method가 있는 곳에서 클래스의 인스턴스를 생성해야 한다.
 * 그리고 인스턴스를 통해서 기능을 "호출(method 사용)"해야 한다.
 * instance.method() 형식으로 점(.) 연산자를 통해서 호출한다.
 */
public class MethodService {
	
	/*
	 * method() 선언문
	 * print(int num)라는 method를 선언해두고 누군가 호출해서 사용하도록 만드는 절차
	 * print() 괄호 안에 선언된 변수를 "매개변수"라고 한다.
	 * 매개변수는 print() method를 호출할 때 전달하는 정수값을 수신할(받을) 곳이다.
	 * 
	 * 만약 instance.print(50)이라고 호출하면, 정수 50이 num변수에 담겨서 print() method 내부로 전달된다.
	 * print() method 내부의 코드에서는 num 변수에 담긴 값을 사용하여 연산을 수행할 수 있다.
	 */
	
					//int num : 매개변수
	public void print(int num) {
		//System : 인스턴스를 생성하지 않아도 사용할 수 있다
		System.out.println(num);
		System.out.println(100);
	}

}
