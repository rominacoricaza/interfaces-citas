package pe.edu.ucsp.quipux.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnitPersistence {
	private String up;
	protected EntityManagerFactory factory;
	protected EntityManager em;
	
	public UnitPersistence() {
		up = "Quipux";
		factory = Persistence.createEntityManagerFactory(up, System.getProperties());
	}
	
	public EntityManager get(){
		em = factory.createEntityManager();
		return em;
	}
}
