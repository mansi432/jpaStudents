package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateStudent {
	public static void main(String[] args)
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("sampleoracle");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Student student =new Student();
		student.setSid(103);
		student.setSname("mansi");
		student.setAge(21);
		student.setc_Class("A");
		
		Student student1= new Student(106,"raveena",22,"A");
		
		entitymanager.persist(student1);
		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}

}
