package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class StudentServiceimplV6 implements ScoreService {
	
	List<ScoreVO> scoreList;
	List<StudentVO> studentList;
	FileReader fileReader=null;
	BufferedReader buffer=null;
	
	public StudentServiceimplV6() {
		scoreList=new ArrayList<ScoreVO>();
		studentList=new ArrayList<StudentVO>();
	}

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
				sVO.setNum(students[SplitPos.STUDENT.ST_NUM]);
				sVO.setName(students[SplitPos.STUDENT.ST_NAME]);
				
				studentList.add(sVO);
				
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
			
			String reader="";
			while(true) {
				reader=buffer.readLine();
				if(reader==null) {
					break;
				}
				
			String[] scores=reader.split(":");
			
			ScoreVO sVO=new ScoreVO();
			sVO.setNum(scores[SplitPos.SCORE.SC_NUM]);
			sVO.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));
			sVO.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
			sVO.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
			
			scoreList.add(sVO);
						
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
	public void calcSum() {
		int sum=0;
		int listSize=scoreList.size();
		
		for(int i=0; i<listSize; i++) {
			ScoreVO sVO=scoreList.get(i);
			sum=sVO.getKor()+sVO.getEng()+sVO.getMath();
			
			sVO.setSum(sum);
		}
		
	}

	@Override
	public void calcAvg() {
		float avg=0;
		int listSize=scoreList.size();
		
		for(int i=0; i<listSize; i++) {
			ScoreVO sVO=scoreList.get(i);
			avg=(float)sVO.getSum()/3;
			
			sVO.setAvg(avg);
		}
		
	}

	@Override
	public void scoreList() {
		System.out.println("\t\t<성적일람표>");
		System.out.println("=======================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		
		int listSize=scoreList.size();
		
		//data의 join
		//socreList, studentList를 join해서 데이터를 출력하는 코드
		for(int i=0; i<listSize; i++) {
			ScoreVO sVO=scoreList.get(i);
			
			System.out.print(sVO.getNum()+"\t");
			
			//score.txt의 학번(무작위)으로 studentList에서 일치하는 학번 찾기
			for(StudentVO stuVO:studentList) {
				//데이터에 존재하는 학번이 일치하는지 확인
				if(sVO.getNum().equals(stuVO.getNum())) {
					System.out.print(stuVO.getName()+"\t");
					break;
				}
			}
			
			System.out.print(sVO.getKor()+"\t");
			System.out.print(sVO.getEng()+"\t");
			System.out.print(sVO.getMath()+"\t");
			System.out.print(sVO.getSum()+"\t");
			System.out.printf("%6.2f\n", sVO.getAvg());
			
		}
		
		System.out.println("=======================================================");
	}

}
