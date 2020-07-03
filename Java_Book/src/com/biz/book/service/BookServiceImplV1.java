package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

/*
 * BookService Interface를 implements하여 작성
 * 구체적인 method의 코드를 작성해야 함
 * 
 * interface를 implements하면 interface에 정의된 method를 모두 override하여 구현해야 하는 규칙 존재
 * implements를 수행한 다음에는 반드시 add unimplemented method를 실행하여야 함
 */
public class BookServiceImplV1 implements BookService {
	
	List<BookVO> bookList;
	//Scanner scan;
	
	public BookServiceImplV1() {
		
		bookList=new ArrayList<BookVO>();
		//scan=new Scanner(System.in);
		
	}

	public boolean inputBook() {
		
		Scanner scan=new Scanner(System.in);
		// : scanner class를 inputBook() 내에서만 사용이 예상되므로 method의 지역변수로 선언 및 초기화
		//	 지역변수로 선언하면 inputBook() method의 수행이 끝나고 변수가 자동으로 해제되는 효과
		
		BookVO bookVO=new BookVO();
		
		System.out.print("도서명(입력종료 : END)>> ");
		String strTitle=scan.nextLine();
		
		//사용자가 도서명에 "END"를 입력하면 입력을 중단하겠다(false)는 신호를 호출한 곳에 알림(return)
		if(strTitle.equals("END")) {
			return false;
		}
		
		System.out.print("출판사>> ");
		String strComp=scan.nextLine();
		
		System.out.print("저자>> ");
		String strWriter=scan.nextLine();
		
		System.out.print("출판연도>> ");
		String strYear=scan.nextLine();
		//VO에서 출판연도 필드변수를 int로 지정했기 때문에 입력받은 문자열을 숫자로 바꿀 필요
		int intYear=0;
		try {
			intYear=Integer.valueOf(strYear);
		} catch (Exception e) {
			//만약 연도를 문자열로 잘못 입력해서 오류가 발생할 경우, 현재 입력하고 있는 도서명부터 다시 입력하도록 설정
			System.out.println("출판연도는 숫자로만 입력할 수 있습니다.");
			System.out.println(bookVO.getTitle()+"의 도서정보부터 다시 입력하세요.");
			return true;
		}
		
		System.out.print("도서 가격>> ");
		String strPrice=scan.nextLine();
		int intPrice=0;
		try {
			intPrice=Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println("도서 가격은 숫자로만 입력할 수 있습니다.");
			System.out.println(bookVO.getTitle()+"의 도서정보부터 다시 입력하세요.");
			return true;
		}
		
		/*
		 * bokkList.add(bookVO) 코드가 실행되기 전에 return true를 수행하면 현재 method가 실행되면서
		 * 입력했던 도서정보(도서명, 출판사 등)가 아직 list에 추가되기 전이므로 현재 입력된 정보는 모두 무시된다
		 * main에서는 true가 return 되었으므로 아무런 판단 없이 다시 입력을 수행하는 inputBook() method를 호출
		 * return하기 전에 현재 도서를 다시 입력하라는 메시지를 보여주었으므로, 입력하는 사용자는 당연히 현재 입력하던 도서를 다시 입력하게 된다
		 */
		
		bookVO.setTitle(strTitle);
		bookVO.setComp(strComp);
		bookVO.setWriter(strWriter);
		bookVO.setYear(intYear);
		bookVO.setPrice(intPrice);
		
		bookList.add(bookVO);
		
		return true; // 모든 항목이 입력 완료되고, 다음 정보를 입력받겠다는 신호를 호출한 곳에 알림(return)
	}

	public void bookKist() {
		
		System.out.println();
		System.out.println("\t\t<도서정보일람>");
		System.out.println("================================================================");
		System.out.println("도서명\t출판사\t저자\t출판연도\t가격");
		System.out.println("----------------------------------------------------------------");
		
		int listSize=bookList.size();
		for(int i=0; i<listSize; i++) {
			BookVO bVO=bookList.get(i);
			System.out.print(bVO.getTitle()+"\t");
			System.out.print(bVO.getComp()+"\t");
			System.out.print(bVO.getWriter()+"\t");
			System.out.print(bVO.getYear()+"\t");
			System.out.println(bVO.getPrice());
		}
		
		System.out.println("================================================================");
		
	}

}
