# 빛고을 Bank Service Project

 	1. 빛고을 Bank의 계정계 서비스 프로젝트 진행  
 	2. 프로젝트를 시작하고 입금, 출금, 거래내역 업무 선택  
 	3. 각각의 업무를 선택 시 계좌번호 입력 요청  
 	4. 해당 계좌가 존재하면 거래내역을 읽어 다음 업무 수행  
 	5. 만약 계좌가 존재하지 않는 경우 계좌를 자동으로 생성하여 개설, 다음 업무 수행

 * 각 계좌의 거래내역은 BALANCE-00001.txt 형식으로 파일을 생성하여 com.biz.bank.exec.data 폴더에 저장