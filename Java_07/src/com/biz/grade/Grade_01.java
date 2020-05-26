package com.biz.grade;

public class Grade_01 {
	public static void main(String[] args) {
		
		/*
		 * 변수 명명 규칙
		 * 1. 첫글자는 반드시 영문 소문자
		 * 		클래스와 혼동하는 것을 방지하기 위한 방안
		 * 2. 두 번째 글잡루터는 영문 대소문자, 숫자 언더바 가능
		 * 		한글로 변수를 선언할 수도 있지만 코드 읽기가 불편할 수 있어 권장하지 않는다.
		 * 3. 변수 이름을 지을 때는 변수가 하는 일이 단어에 담기도록 지어주는 것이 좋다.
		 * 4. 두 개 이상의 단어를 묶어서 변수 이름을 작성한다.
		 * 5. 변수명의 접두사를 변수의 type 키워드로 시작하면 코드가 커졌을 때
		 * 		변수의 type이 혼동되어 오류를 발생시키는 경우가 줄어든다.
		 * 6. 변수를 선언할 때 가급적이면 어떤 값을 미리 저장하여 변수를 선언만 하고,
		 * 		사용하려고 할 때 발생하는 오류도 막을 수 있다.
		 */
		int intKor=0;
		int intEng=0;
		int intMath=0;
		
		System.out.println(intKor);
		
		intKor=80;
		intKor=90;
		intKor=88;
		
		System.out.println(intKor);
		
		//원래 변수에 저장된 값에 90을 더하여 다시 변수에 저장 : 변수의 누적 연산
		intKor=intKor+90;
		intKor+=90;
		
		//세 개의 변수(intKor, intEng, intMath)에 담긴 값을 모두 더하여 intSum에 저장하라
		int intSum=intKor+intEng+intMath;
		
		intSum=intKor;
		intSum+=intEng;
		intSum+=intMath;
		
	}

}
