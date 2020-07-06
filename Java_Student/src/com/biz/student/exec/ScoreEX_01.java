package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

/*
 * 학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여 엑셀에서 사용할 수 있도록 파일 작성
 * 엑셀은 xls, xlsx 파일 외에 *.csv라는 파일을 읽어 엑셀 데이터처럼 취급
 * *.csv 파일은 컴마(,)로 데이터들을 구분하는 문자열로 작성, 작성된 내용을 text 형식으로 저장
 */

//데이터를 엑셀 파일로 생성해보기
public class ScoreEX_01 {
	
	public static void main(String[] args) {
		
		PrintStream outPut=System.out;
		
		String outFile="src/com/biz/student/exec/Score.csv";
		
		//outFile 변수에 저장된 파일 이름으로 text를 기록하기 위해 파일 생성
		try {
			outPut=new PrintStream(outFile);
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
			int intAvg=intSum/3;
			
			//System.out.printf();와 같은 기능을 하지만 콘솔에 출력하지 않고 파일에 결과 저장
			String score=String.format("%d, %d, %d, %d, %d, %d", i+1, intKor, intEng, intMath, intSum, intAvg);
			
			outPut.println(score);
		}
		
		outPut.close();
		
		System.out.println("작업 완료");
		
	}

}