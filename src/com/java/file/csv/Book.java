package com.java.file.csv;

public class Book {
	private String bookName;
	private float price;
	private String author;

	public Book(String bookName, float price, String author) {
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", author=" + author + "]";
	}

}
