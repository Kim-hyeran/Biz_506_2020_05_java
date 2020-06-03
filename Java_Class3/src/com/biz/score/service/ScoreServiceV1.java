package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV1 {
	/*
	 * <scores 인스턴스 배열을 필드 변수로 선언한 이유>
	 * Ex 클래스나 Service클래스에서 총점, 평균 계산, 리스트 출력을 요청할 때마다 scores 인스턴스 배열을 매개변수로 전달할 수 있지만
	 * 	한 번만 변수로 전달해 Service 클래스가 scores 인스턴스를 보관하도록 하고, 요청하는 나머지 method에서는 변수를 받는 부분을 제거하기 위함
	 * Ex 클래스에서 요청을 할 때마다 scores배열을 매개변수로 전달하면 요청과 요청 사이에서
	 * 	다른 코드에 의해 scores 배열 값이 변형되어 결과가 엉뚱하게 나타나는 것을 방지하는 목적도 있다.
	 */
	
	LineService lineService=new LineService();
	
	//scores 배열을 필드 변수로 선언
	private ScoreVO[] scoreList;
	
	/*
	 * ScoreServiceV1 클래스를 사용해서 어떤 연산을 수행하려고 할 때, 반드시 setScore() method를 통해서 scores 값을 매개변수로 주입해야 한다.
	 * 그렇지 않으면 scores 인스턴스 필드 변수가 아직 준비되지 않은 상태이기 때문에, 이후에 호출되는 method()들에서 NullPointerException이 발생한다. 
	 */
	
	//scores 배열을 setScoreList() method를 통해 scoreVO 배열에 setting
	//아래 public void method에서 계산된 값을 scoreList라는 필드 변수에 저장, 공유
	public void setScoreList(ScoreVO[] scoreList) {
		this.scoreList=scoreList;
		//this. : 현재 이 클래스 내에 선언되어 있는
	}
	
	//과목별 총점, 총점의 총점, 평균의 총점을 구하기 위한 변수 선언
	int korSum=0;
	int engSum=0;
	int mathSum=0;
	int musicSum=0;
	int sumSum=0;
	int avgSum=0;
	
	/*
	 * 필드변수로 scores 선언이 되어있기 때문에 학생 총점과 평균을 계산한 후 어디에 저장해야할지 고민하지 않아도 된다.
	 */
	
	//학생별 총점과 평균, 과목별 총점과 평균
	public void scoreSum() {
		for(int i=0;i<scoreList.length;i++) {
			scoreList[i].setSum(scoreList[i].getKor()+scoreList[i].getEng()+scoreList[i].getMath()+scoreList[i].getMusic());
			scoreList[i].setAvg(scoreList[i].getSum()/4);
			
			korSum+=scoreList[i].getKor();
			engSum+=scoreList[i].getEng();
			mathSum+=scoreList[i].getMath();
			musicSum+=scoreList[i].getMusic();
			sumSum+=scoreList[i].getSum(); //총점의 총점
			avgSum+=scoreList[i].getAvg(); //평균의 총점
		}
	}
	
	//성적 일람표를 출력하는 코드
	public void scoreList() {
		System.out.println("\t\t<성적 일람표>");
		System.out.println(lineService.do_line(55));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(lineService.single(55));
		
		//학생별 과목 점수 리스트 출력(for 반복문 사용)
		for(int i=0;i<scoreList.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",scoreList[i].getNum(),
					scoreList[i].getKor(),scoreList[i].getEng(),scoreList[i].getMath(),scoreList[i].getMusic(),
					scoreList[i].getSum(),scoreList[i].getAvg());
		}
		
		//총점과 평균, 총점의 총점과 평균의 평균 출력
		System.out.println(lineService.single(55));
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","총점",korSum,engSum,mathSum,musicSum,sumSum);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\t%d\n","평균",
				korSum/scoreList.length,engSum/scoreList.length,mathSum/scoreList.length,musicSum/scoreList.length,"",avgSum/scoreList.length);
		System.out.println(lineService.do_line(55));
	}

}
