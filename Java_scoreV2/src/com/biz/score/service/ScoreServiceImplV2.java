package com.biz.score.service;

import com.biz.score.domain.ScoreVO;

/*
 * 클래스를 상속받아서 작성
 * extends : 확장하다
 * = inherit : 상속받다
 * 
 * JAVA에서의 클래스 상속
 * java 객체지향 개념에서 가장 중요한 개념으로, 기존에 만들어진 클래스를 상속받아(inherit) 그 중 일부 method를 개별적으로 수정하고 싶을 때
 * 클래스를 확장하여(extends) 참조하고, 필요한 method를 재정의(override)하여 사용한다
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	
	/*
	 * 이곳에는 보이지 않아도 ScoreServiceImplV1의 모든 기능(필드변수, 메서드)이 복사되어 있는 것과 같다
	 * extends ScoreServiceImplV1 명령문을 클래스 뒤에 붙였기 때문이다
	 */
	
	/*
	 *  ScoreServiceImplV!의 모든 기능 중 scoreList() method의 코드를 수정해서 작성
	 *  단, 나머지 기능은 그대로 V1의 것을 그대로 사용
	 */
	
	public void scoreList() {
		
		System.out.println();
		System.out.println("\t\t<성적일람표 ver.2>");
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		for (ScoreVO scoreVO : scoreList) {
			System.out.print(scoreVO.getNum()+"\t");
			System.out.print(scoreVO.getKor()+"\t");
			System.out.print(scoreVO.getEng()+"\t");
			System.out.print(scoreVO.getMath()+"\t");
			System.out.print(scoreVO.getSum()+"\t");
			System.out.println(scoreVO.getAvg());
		}
		
		System.out.println("====================================================");
		
	}
	
}
