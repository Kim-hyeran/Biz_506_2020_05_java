# 객체지향(Object Oriented Programming : OOP)의 특징

### 상속(확장, Extends)
 * 기존에 **'잘'** 만들어진 클래스에서 일부 method를 수정 혹은 개선하고 싶을 때, 기존의 클래스를 extends하여 새로운 클래스를 선언하고 일부 method만 다시 코딩하여 기능을 개선 및 변경
 * 객체지향의 매우 중요한 특징
 
### 재정의(Override)
 * 기존 클래스를 상속(extends)하여 일부 method의 이름을 그대로 사용하면서, 내부 작동 코드만 새로 만드는 일
 * extends와 overriding은 한꺼번에 생각해야 하는 개념
 
### 정보은닉(Information Hiding)
 * 클래스에 선언된 필드변수를 private으로 선언하고, 외부에서 직접 접근하는 것을 막는 개념
 
### 캡슐화(Encapsulation)
 * 데이터와 데이터를 처리하는 method를 하나로 묶어두는 개념
 * getter() method 호출 : 객체 필드변수의 값을 읽는 것
 * setter(값) method 호출 : 객체 필드변수에 값을 저장하는 것
 * getter(), setter() 또는 기타 여러 method들의 내부에서 어떤 작업이 수행되는지 몰라도 사용자가 원하는 일을 수행할 수 있음

### 다형성(Polymorphism)
 * method의 매개변수의 갯수, type이 다르면 같은 클래스 내에서 같은(중복) 이름의 method를 정의하여 사용 가능
 * 같은 인터페이스를 상속받은 클래스들은 생성자만 교환하여 같은 객체를 초기화(생성)하여 사용 가능
 * 이름이 같은 method는 항상 같은 일을 수행할 것  
		add(3, 4) add(3.4, 4.5)

### 추상화(Abstraction)
 * 클래스를 선언(설계, 디자인)할 때 불필요한 부분을 생략, 삭제하고 **꼭 필요한 부분**만 추출하여 클래스로 선언하는 절차