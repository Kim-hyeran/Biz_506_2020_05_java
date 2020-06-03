package com.biz.score.exec;

//List를 import할 때는 반드시 util 항목을 import한다.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.score.vo.ScoreVO;

//Array List 클래스 사용법(교재 p.222)
public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		//선언할 때는 List를 사용해서 선언하고, 초기화는 new ArrayList()를 사용해서 생성한다.
		//str1과 int1은 갯수가 정해지지 않은 특별한 배열과 같은 존재가 된다.
		//List Type의 instance(object) 혹은 str1(int1) List라고 칭한다.
		
		//Generic :<> 안에 들어가는 키워드 문법 형식
		//			리스트의 타입을 결정 짓는 문법 형식
		
		//String형 데이터들을 포함할 리스트를 생성하는 명령문
		List<String> str1=new ArrayList<String>(); //size(배열의 length와 비슷한 개념)=0(기본값)
													//즉, String형 데이터들을 포함할, size가 0인 리스트
		//add() method를 호출해서 데이터를 매개변수로 전달하면, 그 때마다 size가 1씩 증가하는 리스트로 변경된다.
		//코드가 진행되는 동안에도 add() method를 몇 번이고 호출해서 리스트의 size를 조정할 수 있다. 
		str1.add("대한민국"); //size=1
		str1.add("우리나라"); //size=2
		str1.add("Republic Of Korea"); //size=3
		str1.add(90+"");
		
		//Integer형 데이터들을 포함할 리스트
		List<Integer> int1=new ArrayList<Integer>();
		int1.add(90);
		int1.add(100);
		int1.add(200);
		
		//char1 리스트, Character형 데이터들을 포함할 리스트
		List<Character> char1=new ArrayList<Character>();
		char1.add('a');
		char1.add('가');
		char1.add('1');
		
		//b1 리스트, Boolean형 데이터들을 포함할 리스트
		List<Boolean> b1=new ArrayList<Boolean>();
		
		//f1 리스트, Float형 데이터들을 포함할 리스트
		List<Float> f1=new ArrayList<Float>();
		
		//d1 리스트, Double형 데이터들을 포함할 리스트
		List<Double> d1=new ArrayList<Double>();
		
		//l1 리스트, Long형 데이터들을 포함할 리스트
		List<Long> l1=new ArrayList<Long>();
		
		//개발자가 작성한 ScoreVO 클래스 type의 인스턴스를 포함할 수 있는 리스트
		List<ScoreVO> scoreList=new ArrayList<ScoreVO>();
		//JDK에서 제공되는 Random 클래스 type의 인스턴스를 포함할 수 있는 리스트
		List<Random> rndList=new ArrayList<Random>();
		//java1.8 이상에서는 초기화 코드(new ArrayList)에 Generic을 생략할 수 있다.
		List<ScoreVO> score18=new ArrayList<>();
		
	}

}
