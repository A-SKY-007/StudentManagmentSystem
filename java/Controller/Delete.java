package Controller;

import java.util.Scanner;

import Dao.Student_dao;

public class Delete {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Id you want to delete");
	int sid=sc.nextInt();
	
	Student_dao studentdao=new Student_dao();
	
	studentdao.Delete(sid);
	
	System.out.println(sid+" Data has been deleted.");

	}
}
