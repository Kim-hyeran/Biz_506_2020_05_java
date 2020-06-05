package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.ScoreVO;
import com.biz.list.service.ScoreServiceV1;
import com.biz.list.service.ScoreServiceV2;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		List<ScoreVO> scoreList=new ArrayList<ScoreVO>();
		
		ScoreVO scoreVO;
		
		for(int i=0;i<10;i++) {
			scoreVO=new ScoreVO(); //VO 인스턴스를 초기화(다시 생성)
			
			//필드변수에 값을 setting
			scoreVO.setNum(""+(i+1));
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			
			//리스트에 추가
			scoreList.add(scoreVO);
		}
		
		ScoreServiceV1 sService=new ScoreServiceV1();
		
		sService.scoreList(scoreList);
		
		//ScoreServiceV2에 생성한 method 출력
		ScoreServiceV2 sService2=new ScoreServiceV2();
		
		sService2.stSum(scoreList);
		sService2.stAvg(scoreList);
		sService2.scoreList();
		
	}

}
