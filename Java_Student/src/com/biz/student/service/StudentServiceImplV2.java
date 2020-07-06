package com.biz.student.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.student.domain.StudentVO;

//StudentServiceImplV1에 정의된 필드변수, method를 상속받아 작성하는 class
//이 때 필드변수와 method는 public, protected로 되어 있는 경우만 상속된다
public class StudentServiceImplV2 extends StudentServiceImplV1 {
	
	protected PrintStream outPut;
	
	public StudentServiceImplV2() {
		///Java_Student/src/com/biz/student/exec/StudentEx_02.java : Copy Qualified Name(파일 경로 복사)
		String studentFile="src/com/biz/student/exec/student_list.txt";
		//Exception Handling(예외처리)
		//파일을 작성하는 과정에서 아무리 코드를 잘 작성해도 운영체제 차원에서 발생하는 exception은 처리가 어려움
		//이러한 점을 컴파일러가 알고 있기 때문에 개발자에게 의무적인 예외처리를 요구하도록 규정되어 있음
		try {
			outPut=new PrintStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			///e.printStackTrace();
			System.out.println(studentFile+"파일을 생성할 수 없습니다.");
			
			return; //return 없이 진행할 경우 다음 코드에서 오류 발생
		}
	}
	
	//V1에 선언된 studentList는 protected로 되어있기 때문에 그대로 접근 가능
	//V1의 생성자에서 생성(초기화)이 되어있기 때문에 V2에서는 바로 접근하여 읽기, 쓰기를 수행하면 된다

	//Source-Override/Implements Methods...
	//V1에서 구현된 studentList() method를 다시 새롭게 구현
	//List를 Console에 보여주는 방식 대신 List 결과를 file에 저장하여, 프로젝트가 종료되어도 언제든지 결과를 확인할 수 있도록 구현
	//데이터나 결과를 파일로 저장하는 것은 영구 보관 목적 : persistence 관리
	public void studentList() {
		
		outPut.println("\t\t<학생일람표>");
		outPut.println("=======================================");
		outPut.println("학번\t이름\t학년\t학과");
		outPut.println("---------------------------------------");
		
		for(StudentVO sVO:studentList) {
			outPut.print(sVO.getNum()+"\t");
			outPut.print(sVO.getName()+"\t");
			outPut.print(sVO.getGrade()+"\t");
			outPut.println(sVO.getDept());
		}
		
		outPut.println("=======================================");
		outPut.close();
		
	}

}
