package com.example.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.services.FackServices;

@RestController
public class BookController {

	@Autowired
	private FackServices fackServices;

	@GetMapping("/books")
	public List<Book> getBooks() {
//		Book book = new Book();
//		book.setId(0);
//		book.setTitle("Java Basics");
//		book.setAuther("XYZ");

		return this.fackServices.getAllBooks();
	}

	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {

		return this.fackServices.getBookById(id);

	}

}
