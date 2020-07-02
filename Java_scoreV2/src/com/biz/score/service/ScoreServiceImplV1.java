package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService**** 클래스를 정의할 때
 * 반드시 ScoreService Interface를 참조(implements)하도록 규칙을 정해놓는다
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인 된 method를 implement해서 작성되어야하는 규칙이 작동된다
 * 따라서 모든 method에 이름이 통일되는 효과를 얻게 된다
 * 
 * interface(ScoreService)를 implements하여 작성된 클래스는 interface에 정의된 method의 규칙을 그대로 준수하여 작성해야할 의무가 있다
 * 모양은 interface의 모양을 그대로 가지고 있으며, 하는 일은 실제 클래스의 method에 구현되어 있다
 */
//ScoreServiceImplV1을 만들면서 ScoreService Interface를 참조하겠다는 뜻
public class ScoreServiceImplV1 implements ScoreService {

	//private으로 선언했던 필드변수를 protected로 변경
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList=new ArrayList<ScoreVO>();
		scan=new Scanner(System.in);
	}
	
	//성적 입력
	public boolean inputScore() {
		
		ScoreVO scoreVO=new ScoreVO();
		
		System.out.print("학번(입력 종료 : END)>> ");
		String strNum=scan.nextLine();
		
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어>> ");
		String strKor=scan.nextLine();
		int intKor=0;
		try {
			intKor=Integer.valueOf(strKor);
			
		} catch (Exception e) {
			System.out.println("성적은 숫자로만 입력할 수 있습니다.");
			System.out.println("올바르지 않은 값이 입력되어 0점으로 임시저장됩니다.");
		}
		
		System.out.print("영어>> ");
		String strEng=scan.nextLine();
		int intEng=0;
		try {
			intEng=Integer.valueOf(strEng);
			
		} catch (Exception e) {
			System.out.println("성적은 숫자로만 입력할 수 있습니다.");
			System.out.println("올바르지 않은 값이 입력되어 0점으로 임시저장됩니다.");
		}
		
		System.out.print("수학>> ");
		String strMath=scan.nextLine();
		int intMath=0;
		try {
			intMath=Integer.valueOf(strMath);
			
		} catch (Exception e) {
			System.out.println("성적은 숫자로만 입력할 수 있습니다.");
			System.out.println("올바르지 않은 값이 입력되어 0점으로 임시저장됩니다.");
		}
		
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);
		
		return true;
	}

	//총점 계산
	public void calcSum() {
		
		int sum=0;
		int listSize=scoreList.size();
		
		for(int i=0; i<listSize; i++) {
		ScoreVO vo=scoreList.get(i);
		sum=vo.getKor()+vo.getEng()+vo.getMath();
		
		/*
		 * vo.setSum() method에 총점을 전달함으로써 socreList에 저장된 요소의 총점 변수에 값을 저장하는 효과
		 * 별도로 저장하는 등의 절차가 필요하지 않다
		 */
		vo.setSum(sum);
		}
		
	}

	//평균 계산
	public void calcAvg() {
		
		float avg=0;
		int listSize=scoreList.size();
		
		for(int i=0; i<listSize; i++) {
		ScoreVO vo=scoreList.get(i);
		avg=(float)vo.getSum()/3;
		
		vo.setAvg(avg);
		}
		
	}

	//성적 리스트 작성
	public void scoreList() {
		
		System.out.println();
		System.out.println("\t\t<성적일람표>");
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		int listSize=scoreList.size();
		for(int i=0; i<listSize; i++) {
			ScoreVO vo=scoreList.get(i);
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMath()+"\t");
			System.out.print(vo.getSum()+"\t");
			System.out.println(vo.getAvg());
		}
		
		System.out.println("====================================================");
		
	}

}
