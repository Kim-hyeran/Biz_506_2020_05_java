package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.biz.student.domain.StudentVO;

public class StudentServiceimplV6 implements ScoreService {
	
	List<StudentVO> studentList;
	FileReader fileReader=null;
	BufferedReader buffer=null;

	@Override
	public void inputStudent() {
		String studentFile="src/com/biz/student/exec/student.txt";
		
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
				sVO.setName(students[1]);
				
				student
				
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
		
	}

	@Override
	public void inputScore() {
		String scoreFile="src/com/biz/student/exec/Score.txt";
		
		try {
			fileReader=new FileReader(scoreFile);
			buffer=new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scoreList() {
		// TODO Auto-generated method stub
		
	}

}
