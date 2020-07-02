package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * 성적을 입력 받아서 scoreList에 저장하고 성적 리스트를 출력하는 부분 정의
 */
public class ScoreService01 {
	
	//성적 리스트를 저장하기 위한 객체 선언
	List<ScoreVO> scoreList;
	
	//키보드를 이용하여 값을 입력받기 위한 객체 선언
	Scanner scan;
	
	//선언한 객체를 사용할 수 있도록 생성자 안에서 두 객체 초기화
	//이 과정을 생략하면 NullPointerException이 발생하기 쉽다
	public ScoreService01() {
		scoreList=new ArrayList<ScoreVO>();
		scan=new Scanner(System.in);
	}
	
	//한 학생의 성적을 입력 받아서 scoreList에 추가하는 method
	//학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을 입력하게 되면 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		
		System.out.print("학번(END : 입력 종료)>> ");
		String strNum=scan.nextLine();
		
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어>> ");
		String strKor=scan.nextLine();
		int intKor=0;
		try {	//숫자가 아닌 값을 입력하게 되면 미리 초기화한 변수의 값(0)으로 유지된다
			intKor=Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("점수 입력은 숫자로만 가능합니다.");
			System.out.println("잘못된 입력으로 점수가 0점으로 임시저장됩니다.");
			System.out.println();
		}
		
		System.out.print("영어>> ");
		String strEng=scan.nextLine();
		int intEng=0;
		try {	//숫자가 아닌 값을 입력하게 되면 미리 초기화한 변수의 값(0)으로 유지된다
			intEng=Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("점수 입력은 숫자로만 가능합니다.");
			System.out.println("잘못된 입력으로 점수가 0점으로 임시저장됩니다.");
			System.out.println();
		}
		
		System.out.print("수학>> ");
		String strMath=scan.nextLine();
		int intMath=0;
		try {	//숫자가 아닌 값을 입력하게 되면 미리 초기화한 변수의 값(0)으로 유지된다
			intMath=Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("점수 입력은 숫자로만 가능합니다.");
			System.out.println("잘못된 입력으로 점수가 0점으로 임시저장됩니다.");
			System.out.println();
		}
		
		//키보드에서 입력 받은 점수를 int형으로 변환하여 변수에 담은 상태
		//int형으로 변환된 점수를 ScoreVO에 일단 담기
		
		ScoreVO scoreVO=new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		//총점 계산
		int sum=intKor+intEng+intMath;
		//scoreVO.setSum(intKor+intEng+intMath);
		scoreVO.setSum(sum);
		
		//평균 계산을 float형으로 소수점까지 계산하기 위해 먼저 총점을 float형으로 변환하고 나눗셈을 수행해서 결과를 도출한다
		float avg=(float)sum/3;
		//scoreVO.setAvg(scoreVO.getSum()/3);
		scoreVO.setAvg(avg);
		//한 명의 학생 성적을 입력받아 VO에 담기 완료
		
		scoreList.add(scoreVO);
		
		return true;
		
	} //inputScore END
	
	public void scoreList() {
		
		System.out.println("\t\t<성적일람표>");
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		//scoreList의 갯수가 몇 개인지 파악하여 변수에 저장
		int listSize=scoreList.size();
		
		for(int i=0; i<listSize; i++) {
			//list에서 ScoreVO 추출
			ScoreVO vo=scoreList.get(i);
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMath()+"\t");
			System.out.print(vo.getSum()+"\t");
			System.out.print(vo.getAvg()+"\n");
			// = System.out.println(vo.getAvg());
		}
		
		System.out.println("====================================================");
		
	}

}
