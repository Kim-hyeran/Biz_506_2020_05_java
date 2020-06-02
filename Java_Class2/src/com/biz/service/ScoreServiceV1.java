package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {
	
	public void scoreList(ScoreVO[] scoreList) {
		
		LineService lineService=new LineService();
		String d_line=lineService.do_line(45);
		String s_line=lineService.single(45);
		
		System.out.println(d_line);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(s_line);
		
		//sum 변수가 for 반복문 안에서 선언된다면 명령문이 종료된 후 참조할 수 없게 됨
		int sum=0;
		
		for(int i=0;i<scoreList.length;i++) {
			sum=scoreList[i].getKor();
			sum+=scoreList[i].getEng();
			sum+=scoreList[i].getMath();
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",scoreList[i].getName(),scoreList[i].getKor(),scoreList[i].getEng(),scoreList[i].getMath(),sum,sum/3);
		}
		
		System.out.println(d_line);
		
	}

}
