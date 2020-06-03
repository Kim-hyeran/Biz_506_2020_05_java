package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		//성적을 보관할 scores배열 10개 생성 및 초기화
		ScoreVO[] scores=new ScoreVO[10];
		Random random=new Random();
		
		for(int i=0;i<scores.length;i++) {
			scores[i]=new ScoreVO();
			
			scores[i].setNum((i+1)+"");
		
			//각 과목에 임의의 51~100점 부여
			scores[i].setKor(random.nextInt(50)+51);
			scores[i].setEng(random.nextInt(50)+51);
			scores[i].setMath(random.nextInt(50)+51);
			scores[i].setMusic(random.nextInt(50)+51);
		}
		
		//ScoreServiceV1 클래스 import
		ScoreServiceV1 scoreService=new ScoreServiceV1();
		
		/*
		 * ScoreServiceV1에 선언되어 있는 ScoreVO[] scores는 아직 선언만 되고 초기화 등이 전혀 이루어지지 않은 상태이다.
		 * 때문에 scores 인스턴스 배열이 초기화되거나 값이 저장되지 않으면 이후에 호출되는 method에서
		 * 	'NullPointerException'이 발생하고 코드가 진행되지 않는다.
		 */
		scoreService.setScoreList(scores);
		//ScoreServiceV1에서 계산한 코드를 불러와 출력
		scoreService.scoreSum();
		scoreService.scoreList();
		
		/*
		 * ScoreServiceV1에서는 scores 배열을 주입하는 setScore() method를 작성해두었는데, 사용하기 위해 작성하는 과정에서
		 * 	setScore()를 먼저 호출해서 scores를 전달해야 하는 것을 자주 잊어버리게 된다.
		 * 그래서 NullPointerException이 발생하는 경우가 많기 때문에 ScoreServiceV2에서는 성적처리를 하는 과정에서 반드시 호출할 수 밖에 없는 method들 중에
		 * 	항상 제일 먼저 호출할 것으로 생각되는 scoreSum() method에 매개변수를 전달하는 역할을 수행하도로 코드 변경
		 */
		ScoreServiceV2 scoreService2=new ScoreServiceV2();
		scoreService2.scoreSum(scores);
		scoreService2.scoreList();
		
		//error null : 아무것도 아닌, 아무도 모르는
		//				변수에 어떠한 값도 저장되지 않았는데 읽기를 시도하였을 때 console에 나타나는 오류(NullPointerException)
		
	}

}
