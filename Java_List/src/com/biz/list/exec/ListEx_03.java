package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_03 {
	
	public static void main(String[] args) {
		
		//임의의 수를 생성하는 인스턴스 초기화
		Random rnd=new Random();
		
		//intList 이름으로 Integer형 리스트 선언
		List<Integer> intList=new ArrayList<Integer>();
		
		//100개의 임의의 숫자 리스트에 추가
		for(int i=0;i<100;i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		int intCount=0;
		
		//리스트에 추가된 100개의 정수 중 짝수만 출력
		for(int i=0;i<100;i++) {
			int intNum=intList.get(i);
			if(intNum%2==0) {
				System.out.printf("%d\t",intNum);
				//짝수의 갯수 세기
				intCount++;
				
				if(intCount%5==0) {
					System.out.println();
				}
			
			}
			
		}
		
		System.out.println("\n짝수 갯수 : "+intCount);
	}

}
