package Controller;

import Dao.Student_dao;

public class Delete_All {
	public static void main(String[] args) {
		
		Student_dao studentdao=new Student_dao();
		studentdao.Delete_all();
		System.out.println("All data has been deleted...!!!");
	}
}
