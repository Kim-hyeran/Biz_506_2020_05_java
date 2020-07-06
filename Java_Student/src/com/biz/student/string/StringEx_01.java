package com.biz.student.string;

/*
 * String형 변수는 primitive 변수처럼 사용하지만, 근본적인 형(type)은 클래스이다
 * 따라서 String형 변수는 일반변수라기보다는 객체(인스턴스)이다
 *  
 * 일반변수(primitive)와 객체의 차이
 * 일반변수 : 단지 데이터를 저장하는 용도의 메모리의 저장 공간
 * 객체 : 데이터를 저장하는 용도 외에도 다양한 method를 통하여 데이터를 가공, 연산하는 일들을 수행할 수 있다
 */
public class StringEx_01 {
	
	public static void main(String[] args) {
		
		String strNation="Republic of Korea";
		
		/*
		 * strNation은 문자열 변수이면서 String 클래스를 사용하여 만든 String type 객체
		 * 따라서 점(. dot) 연산자를 통하여 다양한 method를 사용할 수 있다
		 */
		
		//toUpperCase : strNation에 담긴 문자열을 모두 대문자로 치환해서 return하는 method
		System.out.println(strNation.toUpperCase());

		//toLowerCase : strNation에 담긴 문자열을 모두 소문자로 치환해서 return하는 method
		System.out.println(strNation.toLowerCase());
		
		//equals : strNation에 담긴 문자열과 입력한 문자열이 같은지 비교
		System.out.println(strNation.equals("Korea"));
		
		//equalsIgnoreCase : strNation에 담긴 문자열과 입력한 문자열의 대소문자 상관 없이 비교
		strNation="Korea";
		System.out.println(strNation.equalsIgnoreCase("korea"));
		
		//contains : strNation에 입력한 문자열이 존재하는지 확인
		strNation="Republic of Korea";
		System.out.println(strNation.contains("Korea"));
		
		//문자열은 별도로 객체에 담지 않아도 ""로 묶인 문자열은 문자열 객체로 취급되어 점(.) 연산자를 직접 사용할 수 있다
		System.out.println("Korea".equals("Korea"));
		System.out.println("KoRea".toUpperCase());
		
		//문자열을 전부 대문자로 치환하여 str1 변수에 담기
		String str1="rePublC oF KOrea".toUpperCase();
		
	}

}
