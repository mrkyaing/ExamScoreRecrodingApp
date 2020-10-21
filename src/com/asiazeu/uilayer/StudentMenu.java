package com.asiazeu.uilayer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.asiazeu.applicationlayer.StudentController;
import com.asiazeu.entity.StudentEntity;

public class StudentMenu extends  CommunMenu{
	
	public void start() {
		try {
			StudentController stController=new StudentController();		
			int choice=super.OperationsMenu();
			if(choice==1) {			
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter student name:");
				String name=sc.nextLine();
				System.out.print("Enter student email:");
				String email=sc.nextLine();
				System.out.print("Enter student phone:");
				String phone=sc.nextLine();
				System.out.print("Enter student address:");
				String address=sc.nextLine();
				System.out.print("Enter student gender:");
				String gender=sc.nextLine();
				System.out.print("Enter student dob(dd-MM-yyyy):");
				String dobstr=sc.nextLine();
				
				StudentEntity entity=new StudentEntity();
				entity.setName(name);
				entity.setEmail(email);
				entity.setGender(gender);
				entity.setAddress(address);
				entity.setPhone(phone);
				SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
				Date dob=format.parse(dobstr);
				entity.setDob(dob);
				entity.setCreatedDate(new Date());//today date .
				
				stController.create(entity);//method calling StudentController 's create();
			}//end of if 1
			else if(choice==2) {
				stController.getAll();
			}
			else if(choice==3) {
				//showing all data .
				stController.getAll();
				
				System.out.print("Choose student id to update data:");
				Scanner sc=new Scanner(System.in);
				int id=sc.nextInt();
				System.out.print("Enter student name:");
				sc=new Scanner(System.in);
				String name=sc.nextLine();
				System.out.print("Enter student email:");
				String email=sc.nextLine();
				System.out.print("Enter student phone:");
				String phone=sc.nextLine();
				System.out.print("Enter student address:");
				String address=sc.nextLine();
				System.out.print("Enter student gender:");
				String gender=sc.nextLine();
				System.out.print("Enter student dob(dd-MM-yyyy):");
				String dobstr=sc.nextLine();
				
				StudentEntity entity=new StudentEntity();
				entity.setName(name);
				entity.setEmail(email);
				entity.setGender(gender);
				entity.setAddress(address);
				entity.setPhone(phone);
				SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
				Date dob=format.parse(dobstr);
				entity.setDob(dob);
				stController.update(id, entity);
			}//end of update
			else if(choice==4) {
				stController.getAll();
				System.out.print("Choose student id to delete data:");
				Scanner sc=new Scanner(System.in);
				int id=sc.nextInt();
				String reply=confirmDialog();
				if(reply.equals("y")) {
					stController.delete(id);
				}else {
					System.out.println("you had been canceled!!");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
