package com.doommap.test;

import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("doom-map").createEntityManager();
	}
	
}