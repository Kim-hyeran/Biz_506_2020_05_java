package com.biz.student.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.ScoreVO;

public class ScoreEx_04 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList=new ArrayList<ScoreVO>();
		//파일을 불러와 변수에 경로 주소와 함께 저장
		String scoreFile="src/com/biz/student/exec/Score.txt";
		
		//file과 관련된 클래스들은 객체로 선언하는 코드와 객체를 초기화(생성)하는 코드를 분리한다
		//선언할 때는 null 값을 이용해 clear만 수행하고 다음으로 진행
		FileReader fileReader=null;
		BufferedReader buffer=null;
		
		try {
			//파일을 읽기 위해서 open
			fileReader=new FileReader(scoreFile);
			//open된 파일에 대한 정보가 담긴 fileReader 객체를 buffer에 연결하여 파일을 읽도록 지시
			buffer=new BufferedReader(fileReader);
			
			//파일을 읽기 전, 파일 한 줄의 문자열을 읽어 담을 문자열 변수 선언
			//파일을 읽어서 처리할 문자열은 반복문 밖에서 선언 및 초기화 후 사용
			String reader="";
			while(true) {
				reader=buffer.readLine(); //buffer로부터 파일에서 데이터를 한 줄씩 읽기
				if(reader==null) { //파일의 데이터 마지막에 도달했을 경우
					break;		//파일 읽기 중단
				}
				
				String[] scores=reader.split(":");
				
				ScoreVO sVO=new ScoreVO();
				sVO.setNum(scores[0]);
				sVO.setKor(Integer.valueOf(scores[1]));
				sVO.setEng(Integer.valueOf(scores[2]));
				sVO.setMath(Integer.valueOf(scores[3]));
				
				scoreList.add(sVO);
				
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(scoreFile+"파일을 읽기 위해 여는 중 오류가 발생하였습니다.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("점수를 숫자로 변환하는 과정에서 오류가 발생하였습니다.");
		} catch (IOException e) {	//IO : input output
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Buffer로부터 데이터를 읽는 데 문제가 발생하였습니다.");
		} //try : 파일 읽기 end
		
		//scoreList에는 score.txt 파일에서 읽어들인 성적 리스트가 담김
		//socreList에 학번 00010인 학생의 성적 사항을 찾아서 Console에 출력
		
		int listSize=scoreList.size();
		for(int i=0; i<listSize; i++) {
			ScoreVO sVO=scoreList.get(i);
			if(sVO.getNum().equals("00010")) {
				System.out.println("학번 : "+sVO.getNum());
				System.out.println("국어 : "+sVO.getKor());
				System.out.println("영어 : "+sVO.getEng());
				System.out.println("수학 : "+sVO.getMath());
				break;
			}
			
		}
		
		for(ScoreVO sVO:scoreList) {
			if(sVO.getNum().equals("00010")) {
				System.out.println("학번 : "+sVO.getNum());
				System.out.println("국어 : "+sVO.getKor());
				System.out.println("영어 : "+sVO.getEng());
				System.out.println("수학 : "+sVO.getMath());
				break;
			}
		}
		
	}

}
