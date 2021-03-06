package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {
	
	public static void main(String[] args) {
		
		String nation="KOREA";
		String[] nations=nation.split(""); //알파벳 단위로 분해
		
		//Arrays.asList(배열) : 배열을 List형 데이터로 변환
		List<String> words=Arrays.asList(nations);
		//Collections 클래스의 기능을 사용하기 위해서 배열을 List형 데이터로 변환
		
		//String, Integer, Long, Float, Character, Boolean과 같은 Wrapper class를 포함하는 List 데이터를 오름차순으로 정렬
		//Collections의 sort() method는 내부 알고리즘이 Quick Sort이므로 사용하는 데 아무런 제약 없이 사용 가능
		Collections.sort(words);
		System.out.println(words);
		
		//List에 포함된 item들을 무작위로 섞는 기능을 수행
		Collections.shuffle(words);
		System.out.println(words);
		
	}

}
