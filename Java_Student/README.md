# 파일에 Text 기록하기
 * 자바에서는 파일에 text를 기록하는 여러 가지 방법이 있다
 * 이 중 가장 쉬운 방법으로 PrintStream 클래스가 있다
 * PrintStream 클래스는 콘솔 출력 Stream인 System.out과 부모가 같다
 * PrintStream outPut=System.out;을 사용하면 outPut 객체를 사용하여 Console에 text를 출력할 수 있다
 * PrintStream outPut=new PrintStream(파일이름);으로 PrintStream 객체를 재정의하면, Console에 출력될 결과를 "파일이름" 파일에 text로 기록할 수있다
 
 * PrintStream outPut=new PrintStream(파일이름); 생성코드는 반드시 try-catch구문으로 exception handling을 수행해야 한다
 
 * 프로젝트의 패키지(폴더)에 파일을 저장하기 위해 파일 이름을 작성할 때 일일이 타이핑하지 않고, 이미 존재하는 특정 파일에서 Copy Qualified Name 명령을 수행하여 파일명을 복사해 **작성할 파일 이름으로 변경**하여 사용  
 	- 이름을 수정하지 않을 경우 존재하던 파일은 삭제됨
 
 
# Text File, BIN(Binary, 이진) File

### Text File
 * 메모장으로 파일을 열었을 때, 일반 문자열로 쉽게 읽을 수 있는 파일
 * 파일에 기록된 값이 문자열의 ASCII 코드로 저장된 파일
 * Text File인지 알아보기 위해서는 윈도우의 메모장에 연결해서 열기
 * 파일명.txt
 * java에서 어떤 데이터를 text file에 기록할 때 여러가지 클래스의 도움을 받을 수 있다
 * 그 중 Print로 시작되는 클래스의 사용법이 가장 쉬움
 * System.out.println() method는 PrintStream 클래스에 내장된 콘솔 출력 method
 * System.out 대신 파일을 대상으로 출력하면 text를 파일에 기록할 수 있다

### BIN File
 * 메모장으로 파일을 열었을 때 읽을 수 없는 기호들이 보이는 파일
 * 이진수의 나열로 만들어진 파일
 * BIN 파일을 열어서 내용을 확인하려면 그 파일을 열 수 있는 어플리케이션이 컴퓨터에 설치되어 있어야 한다
 * sublime text로 파일을 열면 16진수로 되어 있는 데이터 나열을 확인할 수 있다
 * 이미지, 동영상, 음악, hwp, doc xls, ppt, ps 등