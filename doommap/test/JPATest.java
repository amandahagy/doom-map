package com.doommap.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPATest {

	public static void main(String[] args) {
        EntityManager em = null;
        try {

		em =  Persistence.
                createEntityManagerFactory("doom-map").
                createEntityManager();

        } catch (Exception e) {

		if (em != null && em.getTransaction().isActive()) {
		   em.getTransaction().rollback();
	     }
		e.printStackTrace();

        }

	   if (em != null) {
		em.close();
	   }
	   System.exit(0);
	}
}