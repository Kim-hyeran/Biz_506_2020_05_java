package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.service.ScoreServiceV2;

public class Ex_05 {
	
	public static void main(String[] args) {
		
		ScoreVO[] score=new ScoreVO[20];
		Random random=new Random();
		
		for(int i=0;i<score.length;i++) {
			score[i]=new ScoreVO();
		}
		
		for(int i=0;i<score.length;i++) {
							//""+i : 문자열로 처리되면서 정수만 출력됨
			score[i].setName((i+1)+"번");
			score[i].setKor(random.nextInt(50)+51);
			score[i].setEng(random.nextInt(50)+51);
			score[i].setMath(random.nextInt(50)+51);
		}
		
		ScoreServiceV2 scoreService=new ScoreServiceV2();
		
		scoreService.setScoreList(score);
		scoreService.scoreSum(); //총점, 평균 호출
		scoreService.scoreList(); //과목별 점수 호출
		
	}

}
