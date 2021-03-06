package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV2 {
	
	//ScoreServiceV2 클래스의 필드 변수 선언
	//ScoreVO 클래스의 인스턴스 배열을 필드 변수로 선언
	private ScoreVO[] scoreList;
	
	//scoreList 필드 변수의 setter method()
	public void setScoreList(ScoreVO[] scoreList) {
		this.scoreList=scoreList;
	}
	
	public void scoreSum() {
		for(int i=0;i<scoreList.length;i++) {
			scoreList[i].setSum(scoreList[i].getKor()+scoreList[i].getEng()+scoreList[i].getMath());
			scoreList[i].setAvg(scoreList[i].getSum()/3);
		}
	}
	
	public void scoreList() {
		for(int i=0;i<scoreList.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scoreList[i].getName(),scoreList[i].getKor(),scoreList[i].getEng(),scoreList[i].getMath(),
					scoreList[i].getSum(),scoreList[i].getAvg());
		}
	}

}
