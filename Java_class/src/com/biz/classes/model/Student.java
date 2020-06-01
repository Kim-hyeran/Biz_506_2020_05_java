package com.biz.classes.model;

/*
 * 클래스에는 변수, method가 존재한다.
 */
public class Student {
	
	//클래스 내의 method 밖에서 선언된 변수들 : 멤버 변수, 필드 변수, 속성(Property)
	public String name;
	private int age;
	public String tel;
	private String addr;
	public int grade;
	
	String rem;
	
	//임의로 생성한 method
	//setName() method라고 칭한다.
	//현재는 하는 일이 정해지지 않고 이름만 있는 상태
	//public : 접근 제한자, 누구나 접근할 수 있는 상태
	//<->private : 접근 제한자, public과 반대되는 개념으로 나 외에는 아무도 접근하지 못함
	public void setName() {
		
	}

}
