package labBook3.ex1.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory;
	private static EntityManager manager;

	static {
		factory = Persistence.createEntityManagerFactory("abcd");
		manager = factory.createEntityManager();
	}

	public static EntityManager getEntityManager() {
		return manager;
	}
}
