package Controller;

import java.util.Scanner;

import Dao.Student_dao;

public class Read_By_Id {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student_dao studentdao=new Student_dao();
		
		System.out.println("Enter the Id you want to read");
		int sid=sc.nextInt();
		studentdao.Read_By_Id(sid);
		
	}
}
