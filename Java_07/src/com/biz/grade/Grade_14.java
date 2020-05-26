package com.biz.grade;

import java.util.Random;

public class Grade_14 {
	public static void main(String[] args) {
		
		//중복되지 않는 여섯 자리의 무작위 수 출력
		
		Random rnd=new Random();
		
		int[] intNums=new int[6];
		
		for(int i=0;i<6;i++) {
			int intNum=rnd.nextInt(45)+1;
			
			int index=0;
			for(index=0;index<6;index++) {
				if(intNums[index]==intNum)
					break;
			}
			
			if(index==6) {
				intNums[i]=intNum;
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(intNums[i]);
		}
		
	}

}
