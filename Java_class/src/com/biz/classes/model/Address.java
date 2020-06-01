package com.biz.classes.model;

public class Address {
	
	//멤버(필드)변수가 private이기 때문에 인스턴스를 통해서 직접 접근이 불가능
	private String city;
	private String gu;
	private String dong;
	private String addr;
	
	private int age;
	
	//age변수에 값을 저장하기 위한 method
	public void setAge(int age) {
		this.age=age;
	}
	
	//age변수에서 값을 읽기 위한 method
	public int getAge() {
		return age;
	}
	
	//인스턴스를 통해서 필드 변수에 값을 저장하기 위한 setter() method
	//setter : 내부에 선언된 변수에 값을 저장
	//(String city) : 매개변수, 파라메터, argument
	//				인스턴스를 통해서 setCity() method에게 어떤 값을 전달하는 용도
	public void setCity(String city) {
		this.city=city;
	}
	
	//인스턴스를 통해서 필드 변수에 저장된 값을 읽기 위한 getter() method
	//getter : 값을 외부로 전달
	public String getCity() {
		//return 키워드가 있는 method는 return하고자 하는 값의 type을 method 이름 앞에 붙여주어야 한다.
		return city;
	}

}
