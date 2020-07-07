package com.biz.word.domain;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV1;

public class WordEx_01 {

	public static void main(String[] args) {
		
		WordGameService wService = new WordGameServiceImplV1();
		
		wService.loadWord();
		wService.playGame();
		wService.gameOver();
	}
}
