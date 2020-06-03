package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;

//Array List 클래스 사용법(교재 p.222)
public class ScoreEx_04 {
	
	public static void main(String[] args) {
		
		List<String> strList=new ArrayList<String>();
		
		strList.add("대한민국만세"); //저장된 위치 : 0번(배열과 유사)
		strList.add("우리나라만세"); //저장된 위치 : 1번
		strList.add("Republic of Koera"); //저장된 위치 : 2번
		
		//.get(int index) String - List :  정수형 index에 위치 값을 입력, 데이터는 String형 List에 저장되어 있다.
		//get() method는 index에 해당하는 정수값을 매개변수로 주입(전달)하고, 다른 변수에 값을 복수해 올 수 있는 구조
		String s1=strList.get(0);
		String s2=strList.get(1);
		String s3=strList.get(2);
		//getter의 값을 s1 변수에 저장
		System.out.println(s1);
		
		List<Integer> nums=new ArrayList<Integer>();
		
		nums.add(900);
		
		int num1=nums.get(0);
		System.out.println(num1); //변수에 담아 출력하는 방법
		
		System.out.println(nums.get(0)); //변수에 담지 않고 직접 입력해 출력
		
	}

}
