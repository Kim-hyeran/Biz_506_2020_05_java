package com.biz.word.service;

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

public class WordGameServiceImplV1 implements WordGameService {
	
	List<WordVO> wordList;
	FileReader fileReader=null;
	BufferedReader buffer=null;
	
	int count=0;
	int game=0;
	
	public WordGameServiceImplV1() {
		wordList=new ArrayList<WordVO>();
	}

	@Override
	public void loadWord() {
		String wordFile="src/com/biz/word/exec/word.txt";

		try {
			fileReader=new FileReader(wordFile);
			buffer=new BufferedReader(fileReader);
			
			String reader="";
			while(true) {
				reader=buffer.readLine();
				
				if(reader==null) {
					break;
				}
				
				String[] words=reader.split(":");
				
				WordVO wVO=new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]);
				wVO.setKor(words[SplitPosition.WORD_KOR]);
				
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
	}

	@Override
	public void playGame() {
		Random rnd=new Random();
		Scanner scan=new Scanner(System.in);
		
		int size=wordList.size();
		
		while(true) {
			int index=rnd.nextInt(size);
			System.out.println("다음에 해당하는 영어 단어는?(게임 종료 : END)");
			System.out.print(wordList.get(index).getKor()+">> ");

			String strEng=scan.nextLine();
			
			if(strEng.equals("END")) {
				break;
			}
			
			game++;
			
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("정답입니다.\n");
				count++;
			} else {
				System.out.println("\n오답입니다.");
				System.out.println("정답 : "+wordList.get(index).getEng()+"\n");
			}
		}
	}

	@Override
	public void gameOver() {
		System.out.println("\n게임이 종료되었습니다.");
		System.out.printf("%d게임 중 정답 개수는 %d개 입니다.", game, count);
	}

}
