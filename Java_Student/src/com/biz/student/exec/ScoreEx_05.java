package com.biz.student.exec;

import com.biz.student.service.ScoreService;
import com.biz.student.service.StudentServiceimplV6;

public class ScoreEx_05 {
	
	public static void main(String[] args) {
		
		ScoreService sService=new StudentServiceimplV6();
		
		sService.inputStudent();
		sService.inputScore();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
	}

}
