package com.training.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.persistance.Book;
import com.training.model.persistance.BookRepository;
import com.training.model.persistance.DataConfiguration;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DataConfiguration.class);

		BookRepository repository = context.getBean("bookRepository",
				BookRepository.class);
	
		repository.save(new Book("121A", "hav", "fdfd", 1200));
		System.out.println("saved...");

	}
}
