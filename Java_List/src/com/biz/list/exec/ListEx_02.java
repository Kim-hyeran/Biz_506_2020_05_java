package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		//size가 0인 intList 새로 생성
		List<Integer> intList=new ArrayList<Integer>();
		
		int sum=0;
		
		//데이터를 생성하는 부분
		for(int i=0;i<100;i++) {
			//1부터 100까지 난수(임의의 수)를 생성
			int num1=rnd.nextInt(100)+1;
			//intList에 추가
			intList.add(num1);
		}
		//size() 100이 되고 정수값이 100개 추가된 intList
		
		//데이터를 계산하는 부분 (분리 이유 : {}내의 코드 양을 최소화하여 혼동 및 오류를 줄이기 위함)
		for(int i=0;i<100;i++) {
			//i번째 값을 읽어서 sum 변수에 누적
			sum+=intList.get(i);
			//intList[i] i=index(첨자, 위치값)
		}
		
		System.out.println("합계 : "+sum);
	}

}
