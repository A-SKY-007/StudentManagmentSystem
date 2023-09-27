package Controller;

import Dao.Student_dao;

public class Read_All {
	public static void main(String[] args) {
		
		Student_dao studentdao=new Student_dao();
		
		studentdao.Fetch_All();
		
		System.out.println("Data has beed fetched successfully!!!....");
	}
}
