package com.biz.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		//interface를 implements하여 만들어진 클래스는 선언할 때 interface로 선언하고, 실제 코드가 구현된 클래스로 초기화한다
		ScoreService sService=new ScoreServiceImplV1();
		
		sService.inputScore();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
		/*
		 * List interface는 ArrayList 클래스를 선언할 때 implements한 주체
		 * 따라서 ArrayList형 객체(인스턴스)를 생성할 경우 선언은 List로 하고, 초기화는 ArrayList로 수행
		 */
		List<String> strList=new ArrayList<String>();
		strList=new LinkedList<String>();	//복잡한 자료를 검색하기 쉽도록 도와줌
		strList=new Vector<String>();	//LinkedList의 향상된 클래스
		
		ArrayList<String> strList1=new ArrayList<String>();
		
	}

}
