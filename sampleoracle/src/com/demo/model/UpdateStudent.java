package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateStudent {
  public static void main(String[] args) {
	  EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("sampleoracle");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Student student =entitymanager.find(Student.class, 101);
		//before update
		
		System.out.println( student);
		student.setAge(25);
		entitymanager.getTransaction().commit();
		
		//after update
		
		System.out.println( student);
		
		entitymanager.close();
		emfactory.close();
		
	  
  }
}
