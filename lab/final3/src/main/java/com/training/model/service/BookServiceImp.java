package com.training.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.model.persistance.Book;
import com.training.model.persistance.BookDao;

@Service(value = "bs")
@Transactional
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao dao;

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		return dao.getBookById(bookId);
	}

	@Override
	public Book addBook(Book book) {
		return dao.addBook(book);
	}

	@Override
	public Book updateBook(Book book) {
		return dao.updateBook(book);
	}

	@Override
	public Book removeBook(int bookId) {
		return dao.removeBook(bookId);
	}

}
