package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여 Score.txt 파일로 저장
 */

//데이터를 엑셀 파일로 생성해보기
public class ScoreEX_03 {
	
	public static void main(String[] args) {
		
		PrintWriter outPut=null;	//=System.out;
		
		String outFile="src/com/biz/student/exec/Score.txt";
		
		//지금부터 outFile 변수에 저장된 파일 이름으로 text를 기록하기 위해 파일 생성
		try {
			outPut=new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random random=new Random();
		
		for(int i=0; i<30; i++) {
			int intKor=random.nextInt(50)+51;
			int intEng=random.nextInt(50)+51;
			int intMath=random.nextInt(50)+51;
			
			int intSum=intKor+intEng+intMath;
			float floatAvg=(float)intSum/3;
			
			//%05d : 전체 문자열을 다섯 개로 만들어 값을 넣고, 남은 빈 칸에 0을 채워넣음
			//%d : 정수값
			//%06.2f : 전체 여섯자리를 만들어(6) 가운데는 소수점(.), 소수점 아래는  두 자리(2)인 실수로 표현
			//	0을 넣는 이유 : 0을 생략하면 숫자 앞에 공백이 생기고, 나중에 데이터 활용 시 숫자로 인식하지 못해 오류 발생
			String score=String.format("%05d:%d:%d:%d:%d:%06.2f", i+1, intKor, intEng, intMath, intSum, floatAvg);
			
			outPut.println(score);
		}
		
		outPut.close();
		
		System.out.println("작업 완료");
		
	}

}