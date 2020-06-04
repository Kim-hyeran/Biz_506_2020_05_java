package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_05 {
	
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		List<Integer> intList=new ArrayList<Integer>();
		
		for(int i=0;i<100;i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		for(int i=0;i<100;i++) {
			int intNum=intList.get(i);

			/*
			 * <검색 알고리즘(Search Algorithm)>
			 * 리스트(배열)의 처음부터 순차적으로 하나씩 비교하면서 값을 찾다가 발견하면 위치를 알려주고 검색을 중단함
			 * 리스트의 데이터가 무작위로(순서가 없이) 저장되어 있을 때 비교적 쉽게 찾을 수 있는 방식이다.
			 * 하지만 찾고자 하는 값이 마지막에 위치해 있을 때는 전체 리스트를 모두 비교해야 하기 때문에 비효율적이지만,
			 * 	값이 제일 처음에 존재할 때는 최고의 효율을 보인다.
			 * 
			 */
			if(intNum==55) {
				System.out.println(intNum);
				System.out.println("정수 55의 위치 : "+i+"번째"); //위치를 기억하고 있는 변수 : i
				break; //정수 55를 찾아내면 명령문 수행 중단(=정수가 자리한 첫 번째 위치를 알 수 있게 된다)
			}
			
		}
		
	}

}
