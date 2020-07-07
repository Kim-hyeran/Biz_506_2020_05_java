package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV1;

public class WordEx_02 {
	
	public static void main(String[] args) {
		
		WordGameService wService=new WordGameServiceImplV1();
		
		wService.loadWord();
		wService.playGame();
		wService.gameOver();
		
	}

}
