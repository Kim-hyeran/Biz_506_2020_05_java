package com.biz.score.service;

/*
 * ScoreService 클래스 디자인하기
 * 		boolean inputScore()
 * 		void calcSum()
 * 		void calcAvg()
 * 		void scoreList()
 * 
 * Interface
 * java class의 한 형태
 * method의 원형(prototype)을 정의만 할 수 있음
 * method가 하는 일(코드)은 구체적으로 작성 불가
 * 모든 method는 {} 없이 method에서 바로 문장이 종료됨
 * 인터페이스를 implements할 클래스에 규칙 지정
 * 인터페이스를 implements한 클래스는 인터페이스에 정의된 method를 모두 구현해야 함
 * 		인터페이스에 정의된 모든 method를 의무적으로 포함해야 함
 * 		인터페이스에 정의된 method 이름을 변경하여 사용할 수 없음
 * 		자신이 어떤 method를 만들어야 하는지 명확히 파악 가능
 * 인터페이스를 implements한 class를 사용하는 곳에서는 현재 호출한 method는 어떤 클래스를 사용하든 같은 이름일 것이라는 기대
 * 		지금 호출하는 method가 반드시 존재하는 method일 것이라는 기대
 * 		만약 다른 클래스를 사용해서 객체(인스턴스)를 생성했을 때, 나머지 코드를 (거의) 변경 없이 테스트, 사용 가능하다는 기대
 * 인터페이스를 사용해서 (Service)클래스와 (Main)클래스 간의 결합도는 낮아지고 응집도는 높아져 개발생산성, 유지보수성 등 성능 향상
 * 인터페이스를 잘 디자인해두면 어플리케이션 제작 과정 후반부로 갈 수록 시간과 비용이 절약됨
 */
public interface ScoreService {
	
	public boolean inputScore();	//class의 경우 : method() {}
	public void calcSum();
	public void calcAvg();
	public void scoreList();

}
