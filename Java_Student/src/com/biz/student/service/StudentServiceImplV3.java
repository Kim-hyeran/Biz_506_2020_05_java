package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentServiceImplV3 extends StudentServiceImplV2 {

	/*
	 * V2는 V1을 상속받아 studentList() method를 재정의(Override)한 상태
	 * V3는 V2를 상속받아 V2에 구현된 studentList() method는 그대로 사용하고, V1에 있는 inputStudent() method만 재정의하여 V3 생성
	 * 
	 * V3에서는 student.txt 파일을 읽어서 학생정보를 가져오고, studentList() method 를 사용하여 출력
	 */
	public boolean inputStudent() {
		
		String studentFile="src/com/biz/student/exec/student.txt";
		
		//FileReader 클래스로 fileReader 객체(인스턴스)를 선언하고 clear
		//문자열, 숫자 등이 아닌, 정체를 알 수 없는 클래스로 객체를 선언할 때는 가급적 null로 clear 시켜주는 것이 좋다
		FileReader fileReader=null;	//null : clear와 같은 개념으로 인식

		//로컬 디스크에 저장된 파일을 읽을 때, FileReader만으로 읽을 수 있지만 파일을 읽어들이는 성능상의 이점을 주기 위해서 BufferdReader를 연결
		BufferedReader buffer=null;
		
		try {	//stream 구조
			//읽어들일 파일을 열고, 파일과 관련된 정보를 fileReader 객체에 저장
			fileReader=new FileReader(studentFile);
			//fileReader 객체에 저장된 정보를 buffer 관리자에게 전달하여 파일을 읽도록 지시
			//buffer 관리자는 파일을 몽땅 읽어서 자신이 관리하는 buffer 장치에 임시 보관
			buffer=new BufferedReader(fileReader);
			//buffer 장치로부터 text 내용을 한 줄 씩 읽어들임(=readLine())
			String reader="";	//문자열 변수의 경우 for, while 반복문 내에서 계속 선언되는 것은 메모리 관리상 좋지 않기 때문에 반복문 수행 전 선언(clear)한다
			/*
			 * 파일의 라인 수가 몇 개인지 정확히 안다면 아래와 같이 충분히 작성 가능
			 * for(int i=0; i<200; i++) {
				reader=buffer.readLine();
				System.out.println(reader);
			}
			 * 하지만 파일의 상황에 따라 라인 수가 변동되거나, 수를 예측하지 못할 가능성이 존재하기 때문에
			 * (반복문을 수행해야 할 횟수를 정하지 못할 수 있음)
			 * for 반복문보다는 while 반복문을 사용하는 것이 좋다
			 */
			while(true) {
				//buffer.readLine() method는 호출될 때마다 buffer로부터 파일을 한 줄씩 읽어서 reader 변수에 담는다
				//buffer로부터 파일을 모두 읽었는데도 불구하고 또 readLine() method를 호출하면 null값이 return되고, reader 변수에는 null 값이 담기게 된다
				//reader 변수에 null 값이 담겨 있는지 확인하여 반복문을 중단할 수 있다
				reader=buffer.readLine();
				if(reader==null) {
					break;
				}
				System.out.println(reader);
			}
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
