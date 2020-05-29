package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명의 5과목 성적 처리
 */
public class Grade_01 {
	public static void main(String[] args) {
		
		//임의의 점수를 만들기 위한 도구 생성
		Random rnd=new Random();
		
		int stdCount=20;
		
		//stdCount만큼의 배열을 과목 수대로 생성
		int[] intKor=new int[stdCount];
		int[] intEng=new int[stdCount];
		int[] intMath=new int[stdCount];
		int[] intMusic=new int[stdCount];
		int[] intArt=new int[stdCount];
		
		int intKorSum=0;
		int intEngSum=0;
		int intMathSum=0;
		int intMusicSum=0;
		int intArtSum=0;
		
		//학생들의 점수를 임의 생성하여 배열에 저장
		for(int i=0;i<stdCount;i++) {
			intKor[i]=rnd.nextInt(50)+51;
			intEng[i]=rnd.nextInt(50)+51;
			intMath[i]=rnd.nextInt(50)+51;
			intMusic[i]=rnd.nextInt(50)+51;
			intArt[i]=rnd.nextInt(50)+51;
		}
		
		//20명 학생의 과목별 총점 계산
		for(int i=0;i<stdCount;i++) {
			intKorSum+=intKor[i];
			intEngSum+=intEng[i];
			intMathSum+=intMath[i];
			intMusicSum+=intMusic[i];
			intArtSum+=intArt[i];
		}
		
		//학생별 총점, 평균을 계산하여 저장할 배열 추가 생성
		int[] stdSum=new int[stdCount];
		int[] stdAvg=new int[stdCount];
		
		//학생별 총점 및 평균 계산
		for(int i=0;i<stdCount;i++) {
			stdSum[i]=intKor[i];
			stdSum[i]+=intEng[i];
			stdSum[i]+=intMath[i];
			stdSum[i]+=intMusic[i];
			stdSum[i]+=intArt[i];
			
			stdAvg[i]=stdSum[i]/5;
		}
		
		System.out.println("\t\t학생 성적 리스트");
		System.out.println("==============================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("==============================================================");
		
		for(int i=0;i<stdCount;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",(i+1),intKor[i],intEng[i],intMath[i],intMusic[i],intArt[i],stdSum[i],stdAvg[i]);
		}
		
		System.out.println("--------------------------------------------------------------");
		//printf에서 format 기호
		//%d(Decimal) : 정수, 십진수 등을 표현
		//%s(String) : "문자열"을 표현
		//%c(Character) : '문자'를 표현
		//\t : tab(8칸)만큼 빈칸 생성
		//\n : Enter를 누른 것처럼 줄바꿈
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","총점",intKorSum,intEngSum,intMathSum,intMusicSum,intArtSum);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","평균",intKorSum/stdCount,intEngSum/stdCount,intMathSum/stdCount,intMusicSum/stdCount,intArtSum/stdCount);
		System.out.println("==============================================================");
		
	}

}
