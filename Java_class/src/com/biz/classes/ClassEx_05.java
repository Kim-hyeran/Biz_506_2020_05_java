package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_05 {
	
	public static void main(String[] args) {
		
		//Address클래스를 addr인스턴스로 생성
		Address addr=new Address();
		
		//addr인스턴스를 통해서 getAge() method를 호출하고 getAge() method가 return한 값을 age라는 변수를 선언하여 저장
		int age=addr.getAge(); //age 값을 setting하기 전에 읽었기 때문에 값이 0으로 출력
		addr.setAge(22);
		System.out.println(age);
		//클래스에 선언된 method들은 클래스에 선언된 순서와 아무런 영향이 없다
		//인스턴스를 만들고 인스턴스를 통해서 호출되는 순서대로 코드가 작동이 된다
		
		
	}

}
