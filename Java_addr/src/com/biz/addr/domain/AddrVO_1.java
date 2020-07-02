package com.biz.addr.domain;

/*
 * domain 객체
 * 주로 한 개의 데이터를 담아서 이동 및 처리하는 용도로 사용하는 클래스(객체)
 * 
 * 클래스를 객체로 선언하고 초기화할 때 호출하는 생성자는 매개변수가 없는 기본 생성자이다
 * 필드변수 리스트를 매개변수로 받아서 필드변수 값을 지정하는 필드생성자를 만들 수 있다
 * 
 */
public class AddrVO_1 {

	/*
	 * 필드변수가 String을 포함한 primitive(기본형) 변수형일 때는 초기화가 자동으로 이루어진다
	 * 문자열은 "", 숫자는0으로 초기화된다
	 * 
	 * Primitive 변수형
	 *  : int, float, double, long, boolean, char
	 * Wrapper Class(기본 확장형) 변수형
	 *  : Integer, Float, Double, Long, Boolean, Character
	 * 클래스이면서 Primitive처럼 동작하는 변수형
	 *  : String
	 */
	
	private String name;
	private String tel;
	private String addr;
	private int age;
	private String net;
	
	//객체가 생성될 때 기본 생성자에서 필드변수들에 특별히 값을 만들어주고 싶을 경우
	//임의로 기본 생성자를 만들고 필드변수들에 값을 Setting할 수 있다
	public AddrVO_1() {
		this.name="";
		this.tel="";
		this.addr="";
		this.age=0;
		this.net="";
	}
	
	/* 
	 * 필드(변수) 생성자
	 * 객체를 초기화하면서 동시에 데이터를 Setting하고자 할 때 호출하는 생성자
	 */
	public AddrVO_1(String name, String tel, String addr, int age, String net) {
		super();	//생략해도 무방
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
		this.net = net;
	}
	
	/*
	 * 필드(변수) 생성자
	 * 객체를 초기화할 때 필수적으로 필요한 이름과 전화번호 값만 저장하여 주소 생성이 필요한 경우
	 * 이 때 호출하여 사용하는 생성자
	 */
	public AddrVO_1(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public AddrVO_1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}

}
