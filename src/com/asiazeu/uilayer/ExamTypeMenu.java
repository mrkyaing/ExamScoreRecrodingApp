package com.asiazeu.uilayer;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.asiazeu.applicationlayer.ExamTypeController;
import com.asiazeu.entity.ExamTypeEntity;

public class ExamTypeMenu  extends  CommonMenu{
	
public void start() {
	try {
		int choice =super.OperationsMenu();
		ExamTypeController examtypeController=new ExamTypeController();
		switch(choice) {
		case 1:{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter exam type :");
			String type=sc.nextLine();
			System.out.print("Enter exam name :");
			String name=sc.nextLine();
			System.out.print("Enter exam duration :");
			int duration=sc.nextInt();
			System.out.print("Enter exam examdate :");
			sc=new Scanner(System.in);
			SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
			String strdate=sc.nextLine();
			Date examdate=format.parse(strdate);
			System.out.print("Enter exam Total Questions :");
			int totalQuestions=sc.nextInt();
			System.out.print("Enter exam Remak :");
			sc=new Scanner(System.in);
			String remark=sc.nextLine();
			ExamTypeEntity entity=new ExamTypeEntity();		
			entity.setTotalQuestions(totalQuestions);
			entity.setType(type);
			entity.setName(name);
			entity.setDuration(duration);
			entity.setExamDate(examdate);
			entity.setRemark(remark);
			entity.setCreatedDate(new Date());
			
			examtypeController.create(entity);
		}
		break;
		case 2:{
			examtypeController.getAll();
		}break;
		}//end of switch 
	} catch (Exception e) {
		e.printStackTrace();
	}
}//end of start 

}
