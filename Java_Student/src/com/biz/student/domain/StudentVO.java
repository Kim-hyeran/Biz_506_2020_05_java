package com.biz.student.domain; //model, vo, domain, command : 데이터를 추상화한 클래스 모음(package)

/*
 * VO class는 실제 프로젝트에서 주로 다루게 될 데이터를 추상화한 class
 * 필드변수가 매우 중요한 클래스
 * method의 역할보다는 필드변수의 역할을 주로 사용함
 */

public class StudentVO { //VO, DTO
	
	private String num; //학번을 정수형으로 선언할 경우 맨 앞에 0을 사용할 수 없게 된다
	private String name;
	private int grade;
	private String dept;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
