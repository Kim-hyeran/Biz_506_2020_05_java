package com.biz.grade;

public class Char_02 {
	public static void main(String[] args) {
		
		int intCount=0;
		for(int i='가';i<='힣';i++) {
			System.out.printf("%c : %d\t\t",i,i);
			
			//if()명령문 안에서 갯수를 세어놓았기 때문에 바로 출력 가능
			if(++intCount%5==0) {
				System.out.println();
			}
		}
		System.out.println("한글 글자 갯수 : "+intCount);
		
	}

}
