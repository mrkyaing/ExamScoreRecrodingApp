package com.asiazeu.uilayer;

import java.util.Scanner;

public class CommunMenu {
	
	public  String confirmDialog() {
		String reply="n";
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you sure to delete this data?");
		reply=sc.nextLine();
		return reply;		
	}

	public  int OperationsMenu() {
		System.out.println("Choice Operations:");
		System.out.print("1)Add,2)show all,3)update,4)delete:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		return choice;	
	}
}
