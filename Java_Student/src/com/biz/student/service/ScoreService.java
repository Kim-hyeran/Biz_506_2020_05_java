package com.biz.student.service;

/*
 * inputStudent() : Student.txt 파일을 읽어서 studentList 작성
 * inputScore() : Score.txt 파일을 읽어서 scoreList 작성
 * 
 * calcSum(), calcAvg() : 총점과 평균 계산
 * 
 * scoreList() : 학생별 과목 점수, 총점, 평균 리스트 출력 
 */
public interface ScoreService {
	
	public void inputStudent();
	public void inputScore();
	
	public void calcSum();
	public void calcAvg();
	
	/*
	 * 						성적일람표
	 * =======================================================
	 * 학번		이름	국어	영어	수학	총점	평균
	 * -------------------------------------------------------
	 * 학번 : Student.txt Score.txt
	 * 이름 : Student.txt
	 * 성적 : Score.txt
	 * Student.txt와 Score.txt를 합쳐 한 개의 리스트를 생성(30번까지)
	 */
	public void scoreList();

}
