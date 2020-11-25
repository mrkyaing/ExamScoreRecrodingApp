package com.asiazeu.uilayer;
import java.util.Scanner;
public class ExamScoreMainDemo {
	
	public static void main(String[] args) {		  
		int choice=0;  
		    do {
		    	choice=mainMenu();	    	
		    	if(choice==1) {
					StudentMenu studentmenu=new StudentMenu();
					studentmenu.start();
				}else if(choice==2) {
					ExamTypeMenu examTypemenu=new ExamTypeMenu();
					examTypemenu.start();
				}else if(choice==3) {
					ExamScoreMenu examScoreMenu=new ExamScoreMenu();
					examScoreMenu.start();
				}
				else if(choice==4) {
					System.out.println("Good bye !!");
					System.exit(0);
				}		
		    }while(choice!=4);			
	}

	private static int mainMenu() {
		System.out.println("Welcome to exam recrod system!!!");
		System.out.print("1)Student functions\n2)Exam type Functions\n3)Score Functions\n4)Exists:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		return choice;	
	}
	
}
