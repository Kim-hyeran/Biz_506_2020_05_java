package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	private List<ScoreVO> scoreList;
	
	LineService line=new LineService();
	
	int listSize=scoreList.size();
	
	//학생별 총점 계산
	public void stSum(List<ScoreVO> scoreList) {
		for(int i=0;i<listSize;i++) {
			ScoreVO sVO=scoreList.get(i);
			sVO.setStSum(sVO.getKor()+sVO.getEng()+sVO.getMath());
		}
	}
	
	//학생별 평균 계산
	public void stAvg(List<ScoreVO> scoreList) {
		for(int i=0;i<listSize;i++) {
			ScoreVO sVO=scoreList.get(i);
			sVO.setStAvg(sVO.getStSum()/listSize);
		}
	}
	
	public void socreList() {
		System.out.println("\t\t<성적일람표>");
		System.out.println(line.do_line(60));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(60));
		
		for(int i=0;i<listSize;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\n");
		}
	}

}
