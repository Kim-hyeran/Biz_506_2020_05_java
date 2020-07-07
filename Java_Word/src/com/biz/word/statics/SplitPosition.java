package com.biz.word.statics;

/*
 * 클래스에 정의된 필드변수, method에 static keyword가 부착되면 이 클래스를 static class라고 한다
 * static class는 초기화 과정을 수행할 필요 없이 사용할 수 있다
 * 		SplitPosition sPos=new SplitPosition(); 과 같은 코드를 사용할 필요가 없다
 * static class는 프로젝트가 run(시작)되는 순간 자동으로 객체를 한 번 생성하여 method 기억영역에 보관
 * 한 번만 생성되기 때문에 메모리 공간을 한 번만 차지하는 효과를 내고, 프로젝트의 어떠한 클래스나 method에서든지 직접 접근하여 사용 가능
 * 
 */
public class SplitPosition {
	
	//final
	//static으로 선언된 변수는 누구나 어디에서든지 접근하여 읽기, 쓰기 가능
	//어딘가에서 WORD_ENG 변수를 0이 아닌 다른 값으로 변경하면 WORD_ENG 변수를 정말 사용해야할 곳에서 문제 발생 가능성 존재
	//그렇기 때문에 final 키워드를 사용하여 다른 곳에서는 읽기만 가능하도록, 값을 변경할 수 없도록 설정
	public static final int WORD_ENG=0;
	public static final int WORD_KOR=1;
	
	public static void out(String str) {
		System.out.println(str);
	}

}
