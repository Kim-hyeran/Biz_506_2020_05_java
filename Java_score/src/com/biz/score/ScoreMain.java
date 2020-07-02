package com.biz.score;

import com.biz.score.service.ScoreService02;

public class ScoreMain {
	
	public static void main(String[] args) {
		
		ScoreService02 scoreService=new ScoreService02();
		
		while(true) {
			if(!scoreService.inputScore()) {
				break;
			}
		}
		System.out.println("입력이 완료되었습니다.");
		System.out.println();
		
		scoreService.scoreList();
		
	}

}
