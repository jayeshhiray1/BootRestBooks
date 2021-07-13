package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Book;
@Service
public class FackServices {

	private static List<Book> list = new ArrayList<Book>();

	static {
		list.add(new Book(0, "Java", "Oracle"));
		list.add(new Book(111, "Python", "ABC"));
		list.add(new Book(110, "Flink", "Apache"));
		list.add(new Book(101, "Angular", "Google"));
		list.add(new Book(112, "Kafka", "Xyz"));
		list.add(new Book(114, "FullStack", "All"));
	}
	
	//get all books 
	public List<Book> getAllBooks() {
		
		return list;
		
	}
	
	//Get book by Id 
	
	public Book getBookById(int id){
		
		return list.stream().filter(e->e.getId()==id).findFirst().get();
	}
}
