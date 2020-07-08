package com.biz.bank.service;

/*
 * 은행의 내 계좌에 입출금 처리
 * 초기 계좌 잔액dmf 100000으로 하고, inputBalance()를 호출하여 입금처리 수행.
 * outputBalance()를 호출하여 출금처리 수행(계좌의 잔액보다 큰 금액을 출금 시도시 출금 불가, 잔액보다 적은 금액만 출금 가능)
 * llistBalance()를 호출하여 현재까지의 입출금 내역과 잔액 표시
 */
public interface BankService {
	
	public boolean inputBalance(); //입금처리
	public boolean outputBalance(); //출금처리
	public void listBalance(); //입출금내역 출력

}
