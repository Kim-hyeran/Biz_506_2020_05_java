package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordGameServiceImplV3 extends WordGameServiceImplV2 {
	
	/*
	 * List, ArrayList와 같은 클래스 종류를 Collection이라고 한다
	 * 다수의 데이터를 담을 수 있는 클래스이며, VO들을 담아서 연산을 수행하는 목적으로 사용
	 * 
	 * Collection 클래스들은 Collections라는 클래스의 자손
	 * 
	 */
	
	//List<WordVO> wordList, count, game 변수 및
	//loadGame(), playGame(), gameOver() method를 상속받음
	
	//playGame() 재정의
	@Override
	public void playGame() {
		Scanner scan=new Scanner(System.in);
		
		count=0;
		game=0;
		
		while(true) {
			//shuffle()을 사용하여 wordList를 무작위로 섞고(Random과 같은 기능)
			Collections.shuffle(wordList);
			//그 중 0번째 위치(무조건 값이 존재하므로 오류 발생이 거의 없음)의 값을 추출
			WordVO wordVO=wordList.get(0);
			
			//VO에서 영단어를 추출하여 split()으로 분해한 후, words 배열에 담기
			String[] words=wordVO.getEng().split("");
			List<String> wordList=Arrays.asList(words);
			Collections.shuffle(wordList);
			
			System.out.println("다음 알파벳을 단어 순서에 맞게 나열하시오.(게임 종료 : END)");
			System.out.println(wordList);
			System.out.print("답 : ");
			String strInput=scan.nextLine();
			
			if(strInput.equals("END")) {
				break;
			}
			
			if(wordVO.getEng().equalsIgnoreCase(strInput)) {
				System.out.println("정답입니다.");
				System.out.println("해석 : "+wordVO.getKor());
				count++;
			} else {
				System.out.println("오답입니다.");
				System.out.println("정답 : "+wordVO.getEng()+" / "+wordVO.getKor());
			}
		}
	}

}
