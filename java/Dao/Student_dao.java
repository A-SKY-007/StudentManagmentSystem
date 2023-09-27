package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Student_dto;

public class Student_dao {
	
	public void Insert(Student_dto studentdto) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(studentdto);
		entitytransaction.commit();
	}
	public void Read_By_Id( int sid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		  Student_dto studentdto=entityManager.find(Student_dto.class, sid);
		  System.out.println(studentdto.getSid()+" "+studentdto.getSname()+" "+studentdto.getSmob()+" "+studentdto.getSeid());
		
		
	}
	public void Fetch_All()
	{
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		
		Query querry=entitymanager.createQuery("select a from Student_dto a");
		
		List<Student_dto> list=querry.getResultList();
		
		for (Student_dto student_dto :list)
		{
			System.out.println(student_dto.getSid()+" "+student_dto.getSname()+" "+student_dto.getSmob()+" "+student_dto.getSeid());
			
		}
		
		
	}
	public void update(Student_dto studDto)
	{
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.merge(studDto);
		entitytransaction.commit();
		
		
	}
	public void Delete(int sid)
	{
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		
		Student_dto studentdto=entitymanager.find(Student_dto.class, sid);
		entitytransaction.begin();
		entitymanager.remove(studentdto);
		entitytransaction.commit();		
		
	}
	public void Delete_all()
	{
		
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		
		Query querry=entitymanager.createQuery("delete from Student_dto");
		entitytransaction.begin();
		querry.executeUpdate();
		entitytransaction.commit();
	}
}
