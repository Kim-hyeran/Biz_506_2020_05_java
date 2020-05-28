package com.biz.grade;

import java.util.Random;

public class Grade_02 {
	public static void main(String[] args) {
		
		//rnd : 인스턴스(instance), 객체(object)
		//변수이면서 일반적인 변수와는 다른 성질을 갖는다.
		Random rnd=new Random();
		//점(. dot) 연산자를 사용하여 또 다른 기능의 명령어를 연결하고 명령문을 이룰 수 있다.
		//아래의 명령문은 현재 아무 일도 수행하지 않는 것처럼 보이지만 실제로는 무언가 기능을 수행하게 된다.
		//이 명령문은 Console에 표시하는 기능이 없기 때문에 수행된 결과를 확인할 수 없을 뿐이다.
		//점 연산자를 사용하여 연결되는 명령문 중 괄호()가 부착되는 명령문을 Method라고 부른다.
		rnd.nextInt(); //rnd 객체의 nextInt() Method라고 부른다.
						//Random 클래스의 nextInt() Method라고도 부른다.
		
		//명령문이 수행된 결과를 Console에 나타내고 싶으면 일단 어떤 변수와 연결하여 사용한다.
		//아래의 코드는 nextInt() Method를 실행한 후 결과를 num라는 변수에 보관한다.
		int num=rnd.nextInt();
		
		System.out.println(num);
		
		//nextInt()는 사칙연산자와 혼합하여 연산을 수행할 수 있는데, 이 때는 반드시 그 결과를 다른 변수에 보관해야 한다.
		num=rnd.nextInt()/10;
		
		//System, out, println() 라는 세 개의 명령어가 점(.) 연산자로 연결되어 하나의 명령문이 된 형태
		//이 명령문은 끝의 println() Method의 괄호 안에 있는 값, 연산 결과, 변수에 담긴 값 등을 Console에 보여주는 명령문
		System.out.println(num);
		
	}

}
