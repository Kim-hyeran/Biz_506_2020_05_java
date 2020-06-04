package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {
	
	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		//intList 이름으로 Integer형 리스트 선언
		List<Integer> intList=new ArrayList<Integer>();
		
		//임의의 숫자 100개를 생성하여 리스트에 추가
		for(int i=0;i<100;i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		/*
		 * <intList.get(i) method>
		 * 	public int get(int i) {
		 * 		return x;
		 * 	}
		 */
		
		//리스트에 추가된 100개의 정수 중 값에 "55"가 있으면 출력
		for(int i=0;i<100;i++) {
			//getter method를 변수에 담아 불필요한 호출을 줄임(=java에 가는 부담을 줄임)
			int intNum=intList.get(i);
			
			/*
			 * intList.get(i) method를 호출하여 값을 가져오는데 여러 번 반복해서 실행해도 항상 같은 값이 return 된다.
			 * 그렇게 실행하면 같은 일을 여러 번 실행하여 결과를 가져오게 되면서 비효율적인 코드가 된다.
			 * intList.get(i) method를 변수에 저장하여 사용하는 편이 좋다.
			 */
			if(intNum==55) {
				System.out.println(intNum);
			}
		}
		
	}

}
