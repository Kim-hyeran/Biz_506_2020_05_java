package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	
	//필드변수
	//class Scope의 변수 선언
	//필드변수 영역에 선언된 변수는 현재 클래스의 모든 method들이 공유 및 참조(쓰기, 읽기)할 수 있음	
	//필드변수를 선언할 때 접근제한자(public, private, protected) 중에 한 가지로 설정할 수 있다
	//필드변수 선언 시 가급적 public으로 선언하는 것을 지양해야 한다
	//	public으로 선언해 놓으면 외부에서 필드변수에 직접 접근하여 값을 변형시킬 수 있다는 문제 존재(예기치 못한 결과 발생 가능)
	//필드변수를 private으로 선언하는 것은 객체의 정보은닉, 캡슐화 패턴에 적합
	//	외부에서 접근하지 못하도록 차단하고, 현재 클래스에 선언된 method에서만 접근을 허용
	//	만약 필드변수를 외부에서 접근할 필요가 있는 경우 getter, setter 생성
	//protected로 선언하는 것은 private 접근제한자와 유사한 형태
	//	현재 클래스로 다른 클래스를 만들 때, 상속(extends)받아 사용하려는 경우 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속 받아 사용하기 위함
	//	현재 클래스에서는 private처럼 작동하고, 상속받은 클래스에서도 마치 자신이 변수를 선언한 것처럼 사용 가능
	//	현재 클래스 상속을 염두에 두고 구현한다면 필드변수를 protected로 선언한다
	//	만약 private으로 선언하게 되면 변수는 상속받은 클래스에서 다시 선언해주어야 한다
	protected List<StudentVO> studentList;
	//변수의 Scope
	//변수를 선언할 때 어디에 선언하느냐에 따라 변수의 참조 여부가 결정됨
	
	//클래스 생성자
	//클래스를 객채(인스턴스)로 만들 때 호출되는 method
	//클래스를 객체로 생성할 때 한 번 호출되는 method로 반드시 생성(초기화)가 필요한 필드변수들을 생성하는 코드 작성
	public StudentServiceImplV1() {
		studentList=new ArrayList<StudentVO>();
	}

	//학생 정보 입력, 입력된 값 리스트에 추가
	public boolean inputStudent() {
		
		Scanner scan=new Scanner(System.in);
		StudentVO studentVO=new StudentVO();
		
		System.out.print("학번(입력종료:END)>> ");
		String strNum=scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("이름>> ");
		String strName=scan.nextLine();
		
		System.out.print("학년>> ");
		String strGrade=scan.nextLine();
		int intGrade=0;
		//유효성 검사
		//현재 입력된 정보가 정상범위(Validate)에 있는지 검사하여 데이터 사용 여부를 결정하고,
		//입력하는 사용자에게 결과를 통보하고 다른 행동을 취할 수 있도록 하는 것
		//개발자 입장에서는 매우 귀찮은 단순노동일 경우가 많으나, 사용자 입장에서는 유효성검사가 많은만큼 잘못된 데이터 입력을 방지(최소화)할 수 있다
		try {
			intGrade=Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자로만 입력할 수 있습니다.");
			System.out.println("학번부터 다시 입력하시기 바랍니다.\n");
			
			return true;
		}
		if(intGrade<1||intGrade>4) {
			System.out.println("학년은 1에서 4 사이의 숫자만 입력할 수 있습니다.");
			System.out.println("학번부터 다시 입력하시기 바랍니다.\n");
			
			return true;
		}
		
		System.out.print("전공>> ");
		String strDept=scan.nextLine();
		System.out.println();
		
		studentVO.setNum(strNum);
		studentVO.setName(strName);
		studentVO.setGrade(intGrade);
		studentVO.setDept(strDept);
		
		//모든 입력이 정상처리 되었으면 List에 학생 정보 추가
		studentList.add(studentVO);
		
		//가장 마지막 return문은 한 학생의 정보가 모두 정상입력이 되면 다음 학생의 정보를 입력하도록(true) 호출한 곳에 통보(return)
		return true;
	}

	//리스트 출력
	public void studentList() {
		
		System.out.println("\n\t\t<학생정보>");
		System.out.println("===========================================");
		System.out.println("학번\t이름\t학년\t전공");
		System.out.println("-------------------------------------------");
		
		int listSize=studentList.size();
		for(int i=0; i<listSize; i++) {
			StudentVO vo=studentList.get(i);
			
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getGrade()+"\t");
			System.out.println(vo.getDept());
		}
		
		System.out.println("===========================================");
		
	}
	
	

}
