package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteStudent {
	 public static void main(String[] args) {
	 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("sampleoracle");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Student student = entitymanager.find( Student.class, 101 );
	      entitymanager.remove( student );
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );


}
}
