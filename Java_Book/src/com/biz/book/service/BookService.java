package com.biz.book.service;

public interface BookService {
	
	/*
	 * input() method
	 * 어떤 정보를 키보드로 입력 받기
	 * - 무작정 입력받기
	 * - 입력하는 과정에서 END 문자열을 입력하면 입력을 중단하는 신호를 호출한 곳으로 return
	 * 
	 * input() method에서 모든 항목이 정상적으로 이루어지면 return true
	 * 만약 중단하기 위해 END 문자열을 입력하면 호출한 곳에 false를 return하여 더 이상 입력하지 않겠다는 신호 전달
	 * 호출한 곳에 true, false를 return하기 위해서 input() method의 return type을 void에서 boolean으로 변경
	 */
	public boolean inputBook();
	public void bookKist();

}
