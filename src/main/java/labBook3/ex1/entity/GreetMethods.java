package labBook3.ex1.entity;

import javax.persistence.EntityManager;

import labBook3.ex1.Greet;

public class GreetMethods implements GreetAbstract {

	private EntityManager entityManager;

	public GreetMethods() {
		entityManager = JpaUtil.getEntityManager();
	}

	public Greet addMessage(Greet greet) {
		entityManager.getTransaction().begin();
		entityManager.persist(greet);
		entityManager.getTransaction().commit();
		return greet;
	}

	public Greet updateMessage(Greet greet) {
		entityManager.merge(greet);
		return greet;
	}

	public void deleteMessage(int id) {
		Greet greet = entityManager.find(Greet.class, id);
		entityManager.remove(greet);
	}

	public Greet findMessage(int id) {
		entityManager.getTransaction().begin();
		Greet greetData = entityManager.find(Greet.class, id);
		entityManager.getTransaction().commit();
		return greetData;
	}
}
