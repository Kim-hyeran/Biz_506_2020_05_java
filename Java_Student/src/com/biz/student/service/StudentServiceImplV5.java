package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.StudentVO;

/*
 * student.txt 파일을 읽어서 studentList에 저장하고, student_list.txt 파일에 학생 명부 출력
 * 
 * inputStudent method를 변경하여 전공이 컴퓨터공학인 학생들만 리스트 추출
 */

public class StudentServiceImplV5 extends StudentServiceImplV2 {
	
	public StudentServiceImplV5() {
		outPut=System.out;
	}

	public boolean inputStudent() {
		
		String studentFile="src/com/biz/student/exec/student.txt";
		
		FileReader fileReader=null;	//null : clear와 같은 개념으로 인식

		BufferedReader buffer=null;
		
		try {
			fileReader=new FileReader(studentFile);
			buffer=new BufferedReader(fileReader);
			String reader="";
			while(true) {
				reader=buffer.readLine();
				if(reader==null) {
					break;
				}
				
				String[] students=reader.split(":");
				
				StudentVO sVO=new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				
				//학과가 컴퓨터공학인 학생만 리스트에 출력
				if(sVO.getDept().equals("컴퓨터공학")) {
					studentList.add(sVO);
				}
				
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
}
