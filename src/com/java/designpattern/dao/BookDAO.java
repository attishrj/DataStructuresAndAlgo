package com.java.designpattern.dao;

import java.util.Collection;

public interface BookDAO {
	Collection<Book> findAllBooks();
	Book findBookByIsbn(Book book);
	void create(Book book);

}
