package com.biz.word.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		String wordFile="src/com/biz/word/exec/word.txt";
		
		List<WordVO> wordList=new ArrayList<WordVO>();
		
		//file을 열기 위한 객체
		FileReader fileReader=null;
		//파일을 읽어올 때 fileReader와 연동하여 효율적으로 데이터를 가져오기 위한 Helper class 
		BufferedReader buffer=null;
		
		//fileReader를 사용하여 wordFile을 읽기 용도로 열기
		//운영체제와 통신을 하여 파일을 여는 과정에서 갑작스러운 문제로 파일을 열 수 없게 될 가능성이 매우 높음
		//그렇기 때문에 try-catch 구문으로 묶어 예외처리가 반드시 필요
		try {
			fileReader=new FileReader(wordFile);
			//buffer는 파일을 읽어서 임시 buffer영역에 보관
			buffer=new BufferedReader(fileReader);
			//buffer.readLine() method를 호출하여 buffer로부터 데이터를 한 줄씩 읽어오기
			//이 때 데이터의 갯수가 몇 개인지 알 수 없으므로 while 반복문으로 코드를 실행
			String reader="";
			while(true) {
				reader=buffer.readLine(); //반드시 try-catch 구문을 수행(이미 try-catch 구문 내에 존재하므로 catch구문만 추가)
				
				if(reader==null) {
					break;
				}
				
				//읽어들인 데이터를 콜론(:) 기준으로 문자열을 분해하여 words 배열에 담기
				String[] words=reader.split(":");
				
				WordVO wVO=new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]);	//=words[0]
				wVO.setKor(words[SplitPosition.WORD_KOR]);	//=words[1]
				
				wordList.add(wVO);
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
		
		Random rnd=new Random();
		int size=wordList.size();
		Scanner scan=new Scanner(System.in);
		
		int count=0;
		int game=0;
		
		while(true) {
			int index=rnd.nextInt(size); //0~(wordList size-1) 중 한 가지 수
			System.out.println("다음에 해당하는 영어 단어는?(입력 종료 : END)");
			System.out.print(wordList.get(index).getKor()+">> ");
			String strEng=scan.nextLine();
			
			if(strEng.equals("END")) {
				break;
			}
			
			game++;
			
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("정답입니다.");
				count++;
			} else {
				System.out.println("오답입니다.");
				System.out.println(wordList.get(index).getEng());
			}
		}
		System.out.println("GAME OVER");
		System.out.printf("%d게임 중 정답 개수는 %d개 입니다.", game, count);
		
	}

}
