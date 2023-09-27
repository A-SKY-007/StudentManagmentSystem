package Controller;

import java.util.Scanner;

import Dao.Student_dao;
import Dto.Student_dto;

public class Update {
	
	public static void main(String[] args) {
		Student_dto studentdto=new Student_dto();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id to be update");
		int sid=sc.nextInt();
		System.out.println("Enter the name to be updated");
		String sname=sc.next();
		System.out.println("Enter the mob to be updated");
		long smob=sc.nextLong();
		System.out.println("Enter the email id to be updated");
		String seid=sc.next();
		
		studentdto.setSid(sid);
		studentdto.setSname(sname);
		studentdto.setSmob(smob);
		studentdto.setSeid(seid);
		
		Student_dao studentdao=new Student_dao();
		studentdao.update(studentdto);
		
		System.out.println("Data has been updated successfully");
	}
}
