package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV4 extends StudentServiceImplV2 {
	
	public StudentServiceImplV4() {
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
				//System.out.println(reader);
				
				//읽어들인 라인을 분해하여 학생 정보로 변환
				String[] students=reader.split(":");
				
				StudentVO sVO=new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				
				studentList.add(sVO);
			}
			//파일을 읽기, 쓰기로 열었으면 모두 닫아서 종료해주어야 한다
			buffer.close();
			fileReader.close(); //닫는 순서는 열었던 순서와 역순
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
