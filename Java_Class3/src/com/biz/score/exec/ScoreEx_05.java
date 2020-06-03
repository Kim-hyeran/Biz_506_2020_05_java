package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Array List 클래스 사용법(교재 p.222)
public class ScoreEx_05 {
	
	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<Integer>();
		Random rnd=new Random();
		
		//리스트에 임의의 수를 100개 추가
		for(int i=0;i<100;i++) {
			nums.add(rnd.nextInt(100)+1);
		}
		
		for(int i=0;i<100;i++) {
			System.out.printf("%d\t",nums.get(i));
			
			if((i+1)%5==0)
				System.out.println();
		}
		
	}

}
