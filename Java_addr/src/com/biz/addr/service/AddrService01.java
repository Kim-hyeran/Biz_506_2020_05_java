package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO_1;

public class AddrService01 {
	
	/*
	 * 현재 AddrService01 클래스를 선언하면서 addrList라는 필드변수를 선언'만' 해둔 상태
	 * 선언만 된 필드변수 중에 객체 형태의 변수는 그 변수에 값을 저장 혹은 추가하려고 하면 NullPointerException이 발생하면서 코드가 진행되지 않는다.
	 * 
	 * 아래의 세 방법으로 반드시 변수를 초기화해주어야 한다
	 * 1. 필드 변수를 선언과 동시에 초기화(예 : List<AddrVO> addrList=new ArrayList<AddrVO>();)
	 * 		메모리 관리 상 여러가지 문제를 일으킬 수 있기 때문에 가급적 사용하지 않는다
	 * 2. 생성자(NewClass_01.java 및 하단 2번 참고)를 이용하여 초기화(권장)
	 * 3. 사용하기 직전에 초기화하기
	 * 
	 * 객체 형태의 변수란 클래스를 사용하여 선언된 변수들을 의미한다
	 * (int, float, boolean, double 등 기본형 변수 이외의 형태로 선언된 변수들)
	 */
	//new ArrayList<AddrVO> 
	private List<AddrVO_1> addrList;
	
	//2. 생성자를 이용하여 필드변수 초기화
	//클래스의 기본 생성자를 임의로 재작성
	//누군가 AddrService01 클래스를 객체로 선언하고 초기화를 위해 생성자를 호출하면
	//	자동으로 addrList 필드변수가 초기화되어 이후의 코드에서 NullPointerException이 발생하는 것을 방지한다
	public AddrService01() {
		this.addrList=new ArrayList<AddrVO_1>();
	}
	
	//5명의 주소를 생성하여 addrList에 추가
	public void makeAddr() {
		
		//3. 사용하기 직전에 필드변수 초기화
		//	이러한 방식은 유지보수가 어려워지는 코드가 된다(권장하지 않음)
		addrList=new ArrayList<AddrVO_1>();
		
		//한 명의 주소를 저장할 VO 객체(인스턴스)
		//AddrVO 클래스를 사용하여 addrVO 객체(인스턴스)를 선언, 생성자 method를 호출하여 객체를 초기화(사용 가능하도록)한다.
		AddrVO_1 addrVO=new AddrVO_1();
		addrVO.setName("홍길동");
		addrVO.setTel("010-1111");
		addrVO.setAddr("서울특별시");
		addrVO.setAge(33);
		addrVO.setNet("친구");
		addrList.add(addrVO); //새로 생성한 주소(VO)를 주소록(List)에 추가
		
		//또 한명의 주소를 저장할 VO 객체 만들기
		//이미 만들어진 addrVO를 재활용(재정의)한다.
		//홍길동의 주소를 담은 addrVO를 새롭게 재정의하여 저장공간을 비워주는 일을 실행한다.
		addrVO=new AddrVO_1(); //이전에 만들어진 객체(인스턴스)를 재활용하기 위해서는 반드시 다시 생성해야 한다.
		addrVO.setName("이몽룡");
		addrVO.setTel("010-2222");
		addrVO.setAddr("광주광역시");
		addrVO.setAge(22);
		addrVO.setNet("후배");
		addrList.add(addrVO);
		
		//데이터의 정확성을 중시하는 경우 입력 방식
		addrVO=new AddrVO_1();
		addrVO.setName("성춘향");
		addrVO.setTel("010-3333");
		addrVO.setAddr("부산광역시");
		addrVO.setAge(27);
		addrVO.setNet("후배");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1();
		addrVO.setName("콩쥐");
		addrVO.setTel("010-4444");
		addrVO.setAddr("대전광역시");
		addrVO.setAge(44);
		addrVO.setNet("선배");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1();
		addrVO.setName("팥쥐");
		addrVO.setTel("010-5555");
		addrVO.setAddr("울산광역시");
		addrVO.setAge(34);
		addrVO.setNet("친구");
		addrList.add(addrVO);
		
		//입력해야할 데이터가 방대한 양일 경우
		addrVO=new AddrVO_1("성춘향", "010-3333", "남원시", 20, "이몽룡 연인");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1("성춘향", "010-3333", "남원시", 20, "이몽룡 연인");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1("성춘향", "010-3333", "남원시", 20, "이몽룡 연인");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1("성춘향", "010-3333", "남원시", 20, "이몽룡 연인");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1("성춘향", "010-3333", "남원시", 20, "이몽룡 연인");
		addrList.add(addrVO);
		
		addrVO=new AddrVO_1("장보고", "010-1234");
		addrVO.setAge(30);
		addrList.add(addrVO);
		
	}

	public void addrList() {
		
		System.out.println("\t\t주소록");
		System.out.println("============================================================");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("------------------------------------------------------------");
		
		//i<5로 설정하게되면, 5명의 주소록을 표시할 땐 문제가 없으나 주소록 데이터 갯수가 변경되면 문제가 발생한다.
		//따라서 addrList의 갯수를 별도의 변수에 담고
		int addrSize=addrList.size();
		//배열의 크기만큼 반복문을 수행하도록 한다
		for(int i=0;i<addrSize;i++) {
			AddrVO_1 vo=addrList.get(i);
			System.out.printf("%s\t%s\t%s\t%d\t%s\n", vo.getName(), vo.getTel(), vo.getAddr(), vo.getAge(), vo.getNet());
		}
		
		System.out.println("============================================================");
		
	}

}
