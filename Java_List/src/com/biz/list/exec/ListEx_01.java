/*
 * com.biz.list : 3단계 Package, Base Package
 * com.biz.list.exec : 4단계 Package, 업무적인 분류를 나타냄
 */
package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		//Random 클래스를 사용해서 무언가 수행하기 위한 준비
		//Random : 클래스
		//rnd : Random 클래스의 인스턴스(Instance), 객체(Object)
		//new : rnd 인스턴스를 초기화 
		//Random() : 생성자(Constructor) method
		Random rnd=new Random();
		//Random 클래스를 사용해서 rnd 인스턴스를 선언하고, Random() 생성자를 호출하여 rnd 인스턴스를 초기화(새로 생성new)
		
		/*
		 * 다른 클래스와 달리 선언하는 클래스와 초기화하는 생성자의 이름이 다른 형태를 갖는다.
		 * 클래스에 <Generic> 키워드를 포함하여 사용한다.
		 * java에는 기본 배열형 데이터를 사용하는 데 어려움이 있어 JDK에서 새로운 도구를 사용하여 많은 갯수의 데이터를 관리하기 위한 방법 제공 
		 */
		//Integer형 데이터를 포함할 intList를 선언하고 초기화하는 코드
		List<Integer> intList=new ArrayList<Integer>(); //Integer Type List
		//List를 처음 생성하면 size()값이 0인 데이터, 즉 아무것도 없는 List가 만들어진다.
		
		int intSum=0;
		
		for(int i=0;i<100;i++) {
			intList.add(rnd.nextInt(100)+101);
			intSum+=intList.get(i);
		}
		
		System.out.println(intSum); 
		
	}

}
