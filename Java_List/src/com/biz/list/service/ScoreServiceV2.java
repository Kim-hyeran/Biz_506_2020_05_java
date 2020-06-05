package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	private List<ScoreVO> scoreList;
	
	LineService line=new LineService();
	
	int lineCount=45;
	int listSize=0;
	
	//학생별 총점 계산
	public void stSum(List<ScoreVO> scoreList) {
		this.scoreList=scoreList;
		
		listSize=scoreList.size();
		
		for(int i=0;i<listSize;i++) {
			ScoreVO sVO=scoreList.get(i);
			sVO.setStSum(sVO.getKor()+sVO.getEng()+sVO.getMath());
		}
	}
	
	//학생별 평균 계산
	public void stAvg(List<ScoreVO> scoreList) {
		this.scoreList=scoreList;
		
		listSize=scoreList.size();
		
		for(int i=0;i<listSize;i++) {
			ScoreVO sVO=scoreList.get(i);
			sVO.setStAvg(sVO.getStSum()/3);
		}
	}
	
	public void scoreList() {
		
		listSize=scoreList.size();
		
		System.out.println("\t\t<성적일람표>");
		System.out.println(line.do_line(lineCount));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(lineCount));
		
		for(int i=0;i<listSize;i++) {
			ScoreVO sVO=scoreList.get(i);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					sVO.getNum(),sVO.getKor(),sVO.getEng(),sVO.getMath(),
					sVO.getStSum(),sVO.getStAvg());
		}
		
		System.out.println(line.do_line(lineCount));
	}

}
