package com.biz.student.string;

public class StringEx_02 {
	
	public static void main(String[] args) {
		
		String strNation="Republic of Korea";
						//문자열 맨 앞(R의 앞)을 0으로 두고 센다
		//strNation에 담긴 문자열에서 (9<=x<11)의 범위의 문자열을 잘라 subNation에 담기
		String subNation=strNation.substring(9, 11);	//9번째 글자부터 11번째 글자 앞까지
		System.out.println(subNation);
		
		//length : 문자열의 갯수 세기
		int strLength=strNation.length();
		//strNation의 문자열을 한 글자씩 잘라서 Console에 출력
		for(int i=0; i<strLength; i++) {
			String s=strNation.substring(i, i+1);
			System.out.println(s);
		}
		
		//문자열을 한 글자씩 분해하여 문자배열로 변환, charNations에 담기
		char[] charNations=strNation.toCharArray();
		for(int i=0; i<charNations.length; i++) {
			System.out.print(charNations[i]+"\t");
		}
		System.out.println();
		
		//문자열을 한 글자씩 분해하여 문자열 배열로 변환, strNations에 담기
		String[] strNations=strNation.split("");
		for(int i=0; i<strNations.length; i++) {
			System.out.print(strNations[i]+"\t");
		}
		
	}

}
