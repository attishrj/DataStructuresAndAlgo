package com.java.designpattern.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryBookDao {

	private static Map<String,Book> bookstore=new HashMap<>();
	public Collection<Book> find()
	{
		return bookstore.values();
	}
	public Book find(Book book)
	{
		return bookstore.get(book.getIsbn());
	}
	
	public void createBook(Book book)
	{
		bookstore.put(book.getIsbn(), book);
	}
}
