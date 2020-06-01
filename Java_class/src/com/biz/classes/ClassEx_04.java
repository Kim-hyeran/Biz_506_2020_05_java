package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_04 {
	
	public static void main(String[] args) {
		
		Address address=new Address();
		
		//city 변수는 private이기 때문에 인스턴스를 통해서 직접 접근 불가
		//public이라면 address.city="광주광역시";로 작성 가능
		
		//city 변수에 값을 저장하기 위한 setter() method에게 값 저장을 요청
		address.setCity("광주광역시");
		
		//city 변수의 값을 읽기 위한 getter() method를 사용하여 값 가져오기
		String city=address.getCity();
		
		address.setCity("서울특별시");
		
		System.out.println(city);
		
	}

}
