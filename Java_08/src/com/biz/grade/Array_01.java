package com.biz.grade;

import java.util.Random;

/*
 * 1. 20명 학생의 국어, 영어, 수학, 음악 점수를 저장하기 위한 배열 선언
 * 2. 각 배열에 51~100점의 점수를 생성하여 저장
 * 3. 각 학생의 점수 총점, 평균을 계산하고
 * 4. 과목별 점수 총점, 평균을 계산하여
 * 5. 성적 리스트를 Console에 표시하시오
 */
public class Array_01 {
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		//20개의 저장 공간을 가진 변수 선언
		//integer형 배열 20개씩을 선언 : 20개의 저장 공간을 가진 변수
		//intKor라는 배열을 20개의 저장 공간을 갖는 integer형 배열을 생성
		int[] intKor=new int[20];
		int[] intEng=new int[20];
		int[] intMath=new int[20];
		int[] intMusic=new int[20];

		//과목별로 총점을 계산하여 보관할 변수를 선언
		int intKorSum=0;
		int intEngSum=0;
		int intMathSum=0;
		int intMusicSum=0;
		
		//임의의 숫자를 생성하기 위한 도구 선언
		//Random이라는 클래스를 이용해서 rnd라는 변수(도구)를 선언하고 new Random() 초기화 코드를 사용 준비
		
		//이 명령 코드가 실행될 때마다 임의의 정수를 만들어낸다.
		rnd.nextInt();
		
		//이 명령 코드가 실행될 때마다 0부터 99까지의 임의의 정수를 만들어낸다.
		rnd.nextInt(100);
		
		/*
		 * 위에서 생성한 네 개의 배열에 각각 20개의 점수를 할당하기 위해 배열의 개수만큼 반복문을 실행하고,
		 * 반복문이 실행되면서 만들어지는 i변수의 값을 각 배열의 index로 주입하여
		 * 배열[0]부터 배열[19]까지의 저장 공간에 값을 할당하기 위해 시작하는 반복문 코드
		 * 
		 * intKor[0]~intKor[19], intEng[0]~intEng[19]...
		 * 이러한 위치가 지정된 변수에 임의의 정수값을 생성하여 할당한다.
		 * 성적 처리를 테스트하기 위한 임의의 점수를 만들어서 배열에 저장하는 코드
		 */
		for(int i=0;i<20;i++) {
			intKor[i]=rnd.nextInt(50)+51;
			intEng[i]=rnd.nextInt(50)+51;
			intMath[i]=rnd.nextInt(50)+51;
			intMusic[i]=rnd.nextInt(50)+51;
		}
			
		for(int i=0;i<20;i++) {
			intKorSum+=intKor[i];
			intEngSum+=intEng[i];
			intMathSum+=intMath[i];
			intMusicSum+=intMusic[i];
		}
		
		/*
		 * 국어			영어		수학		음악			총점
		 * intKor[0] +	intEng[0] +	intMath[0]	+ intMusic[0] =	intStSum[0]
		 * intKor[1]	intEng[1]	intMath[1]	intMusic[1]		intStSum[1]
		 * intKor[2]	intEng[2]	intMath[2]	intMusic[2]		intStSum[2]
		 * intKor[3]	intEng[3]	intMath[3]	intMusic[3]		intStSum[3]
		 */
		
		//학생들의 과목별 총점을 계산하여 저장할 배열을 또 20개 선언
		int[] intStSum=new int[20];
		for(int i=0;i<20;i++) {
			//총점 배열에 학생들의 성적 총점을 계산하여 저장
			intStSum[i]=intKor[i];
			intStSum[i]+=intEng[i];
			intStSum[i]+=intMath[i];
			intStSum[i]+=intMusic[i];
		}
		
		System.out.println("\t\t학생 성적 리스트");
		System.out.println("=======================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		
		for(int i=0;i<20;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",i+1,intKor[i],intEng[i],intMath[i],intMusic[i],intStSum[i],intStSum[i]/4);
		}
		
		System.out.println("=======================================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n",intKorSum,intEngSum,intMathSum,intMusicSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\n",intKorSum/20,intEngSum/20,intMathSum/20,intMusicSum/20);
		
	}

}
