package com.asiazeu.uilayer;
import java.util.Scanner;
public class ExamScoreMainDemo {
	
	public static void main(String[] args) {		  
		int choice=mainMenu();
		if(choice==1) {
			StudentMenu studentmenu=new StudentMenu();
			studentmenu.start();
		}else if(choice==2) {
			ExamTypeMenu examTypemenu=new ExamTypeMenu();
			examTypemenu.start();
		}else if(choice==4) {
			System.out.println("Good bye !!");
			System.exit(0);
		}
	
	}

	private static int mainMenu() {
		System.out.println("Welcome to exam recrod system!!!");
		System.out.print("1)Student functions,2)Exam type Functions,Score Functions,4)Exist:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		return choice;	
	}
	
}
