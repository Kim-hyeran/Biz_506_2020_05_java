package com.biz.addr.exec;

public class NewEx_01 {
	
	public static void main(String[] args) {
		
		//NewClass_01 클래스는 기본 생성자를 임의로 만들지 않았지만 자동으로 기본생성자가 선언되므로 생성자를 호출하여 nc 객체를 초기화할 수 있다
		NewClass_01 nc=new NewClass_01();
		
		/* NewClass_02 클래스에는 int num값을 매개변수로 받아야하는 필드생성자를 임의로 작성
		 * 필드 생성자를 임의로 작성하게 되면 클래스의 기본생성자는 사라진다
		 * 따라서 이 클래스는 new NewClass_02() 생성자를 호출하여 객체를 초기화할 수 없게 된다
		 * 이 생성자를 호출하여 객체를 초기화하려면 매개변수로 임의의 숫자를 넣어야 한다
		 */
		//NewClass_02 nc2=new NewClass_02(); : 오류발생
		NewClass_02 nc2=new NewClass_02(5);
		
	}

}
