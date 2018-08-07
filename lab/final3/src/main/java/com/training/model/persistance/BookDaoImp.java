package com.training.model.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp implements BookDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Book> getAllBooks() {
		return em.createQuery("from book").getResultList();
	}

	@Override
	public Book getBookById(int bookId) {
		return em.find(Book.class, bookId);
	}

	@Override
	public Book addBook(Book book) {
		em.persist(book);
		em.flush();
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		return em.merge(book);
	}

	@Override
	public Book removeBook(int bookId) {
		Book book = em.find(Book.class, bookId);
		if (book != null)
			em.remove(bookId);
		return book;
	}
}