package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_06 {
	
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		//Character형 리스트 : 문자 데이터를 포함하는 리스트
		List<Character> charList=new ArrayList<Character>();
		
		//알파벳 갯수 : 26개
		char char1=(char)(rnd.nextInt(26)+'A'); //A의 char 코드값 : 96
			
		System.out.println(char1);
		
		//0부터 25까지 정수를 만들고 여기에 영문자 A의 char(ASCII) 코드 값을 더하여 'A'부터 'Z'까지의 값을 리스트에 저장하는 코드
		for(int i=0;i<100;i++) {
			charList.add((char)(rnd.nextInt(26)+'A'));
		}
		
		//size() method를 호출하면 리스트 전체 갯수의 값을 알 수 있다.
		for(int i=0;i<charList.size();i++) {
			char char2=charList.get(i);
			
			if(char2=='F') {
				System.out.println("문자 'F'의 최초 위치 : "+i);
				break;
			}
		}
		
		//size() method 또한 변수에 담아 효율적인 코드 작성
		int charSize=charList.size();
		
		for(int i=0;i<charSize;i++) {
			char charGet=charList.get(i);
			
			if(charGet=='F') {
				System.out.println("문자 'F'의 최초 위치 : "+i);
				break;
			}
		}
		
	}

}
