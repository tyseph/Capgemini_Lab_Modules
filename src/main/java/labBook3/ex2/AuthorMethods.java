package labBook3.ex2;

import javax.persistence.EntityManager;

import labBook3.ex1.entity.JpaUtil;

public class AuthorMethods implements AuthorAbstract {

	private EntityManager em;

	public AuthorMethods() {
		em = JpaUtil.getEntityManager();
	}

	public Author addAuthor(Author author) {
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		return author;
	}
}
