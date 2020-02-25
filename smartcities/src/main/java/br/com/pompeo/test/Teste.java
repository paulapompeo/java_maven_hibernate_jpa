package br.com.pompeo.test;

import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {

		//criar um gerenciado de entidades -> nome do persistence unit
		Persistence.createEntityManagerFactory("smartcities").createEntityManager();
		
		
		
	}

}
