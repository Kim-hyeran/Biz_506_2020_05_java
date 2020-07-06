package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService stuService=new StudentServiceImplV1();
		
		while(true) {
			//조건문 안에서 inputStudent() method를 호출하였기 때문에 아래에 한 번 더 호출할 필요가 없다
			if(!stuService.inputStudent()) {
				break;
			}
		}
		
		stuService.studentList();
		
	}

}