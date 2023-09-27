package Controller;

import java.util.Scanner;

import Dao.Student_dao;
import Dto.Student_dto;

public class Student_controller {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id to be inserted: ");
		int sid=sc.nextInt();
		
		
		System.out.println("Enter the student name to be inserted: ");
		String sname=sc.next();
		
		
		System.out.println("Enter the student mobile number: ");
		long smob=sc.nextLong();
		
		
		System.out.println("Enter the student email ID to be inserted: ");
		String seid=sc.next();
		
		Student_dto studentdto=new Student_dto();
		studentdto.setSid(sid);
		studentdto.setSname(sname);
		studentdto.setSmob(smob);
		studentdto.setSeid(seid);
		
		Student_dao studentdao=new Student_dao();
		
		studentdao.Insert(studentdto);
		
		System.out.println("Data has been inserted!!!....");

		sc.close();
		
	}
}
