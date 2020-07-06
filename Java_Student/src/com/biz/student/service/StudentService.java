package com.biz.student.service;

/*
 * Service
 * Business Login
 * 실제 어떤 일을 수행하는 주요 method를 모아두는 package
 * 프로젝트에서 주요 연산을 수행하는 코드를 구현할 때 Service class에 구현
 * Service 클래스는 특별한 경우가 아니면 먼저 interface를 만들어 어떤 method를 만들 것인가 디자인하는 것이 좋다
 */
public interface StudentService {
	
	/*
	 * 학생 정보를 키보드로 입력하는 method
	 * 1. 학생 한 명의 정보를 키보드로 입력 받고
	 * 2. 학생 list에 추가하는 코드 작성
	 * 3. 학생 정보를 입력받는 과정에서 입력을 중단하고, 중단되었다는 사실을 호출한 곳에 통보(return)하는 기능 구현
	 */
	public boolean inputStudent();
	public void studentList();

}
