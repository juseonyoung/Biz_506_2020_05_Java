package com.biz.word.domain;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV3;

public class WordEx_02 {

	public static void main(String[] args) {
		
		WordGameService wService = new WordGameServiceImplV3();
		
		wService.loadWord();
		wService.playGame();
		wService.gameOver();
		
	}
}
