package com.asiazeu.uilayer;

import java.util.Date;
import java.util.Scanner;

import com.asiazeu.applicationlayer.ExamScoreController;
import com.asiazeu.applicationlayer.ExamTypeController;
import com.asiazeu.applicationlayer.StudentController;
import com.asiazeu.entity.ExamScoreEntity;
import com.asiazeu.entity.ExamTypeEntity;
import com.asiazeu.entity.StudentEntity;

public class ExamScoreMenu extends CommonMenu{
public void start() {
	try {
		ExamScoreController examscorecontroller=new ExamScoreController(); 
	    StudentController studentController=new StudentController();
		ExamTypeController examTypeController=new ExamTypeController();
	    int choice=super.OperationsMenu();
	    switch(choice) {
	    case 1:{
	    	System.out.println("Student Information");
	    	System.out.println("============================================");
	    	studentController.getAll();
	    	System.out.println("============================================");
	    	System.out.println("Exam Type Information");
	    	System.out.println("============================================");
	    	examTypeController.getAll();
	    	System.out.println("============================================");
	    	ExamScoreEntity examScoreEntity=new ExamScoreEntity();
	    	System.out.print("Enter Student Id");
	    	Scanner sc=new Scanner(System.in);
	    	int studentid=sc.nextInt();
	    	System.out.print("Enter Exam Type Id");
	    	int examtypeid=sc.nextInt();
	    	System.out.print("Enter Exam mark:");
	    	int mark=sc.nextInt();
	    	System.out.print("Enter remark");
	    	sc=new Scanner(System.in);
	    	String remark=sc.nextLine();
	    	//part-of-relationship passing(StudentEntity)
	    	StudentEntity student=new StudentEntity();
	    	student.setId(studentid);//2	    	
	    	examScoreEntity.setStudent(student);//setting the student obj
	        //part-of-relationship passing (ExamTypeEntity)
	    	ExamTypeEntity examtype=new ExamTypeEntity();
	    	examtype.setId(examtypeid);//3	    		    	
	    	examScoreEntity.setExamtype(examtype);//setting the examtype obj
	    	
	    	examScoreEntity.setMark(mark);
	    	examScoreEntity.setRemark(remark);
	    	examScoreEntity.setCreatedDate(new Date());
	    	examscorecontroller.create(examScoreEntity);
	    	
	    } break;
	    case 2: break;
	    case 3: break;
	    case 4: break;
	    }//end of switch  
	}catch(Exception e) {
		
	}
}
}
