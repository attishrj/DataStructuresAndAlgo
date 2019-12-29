package com.java.file.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderInJava {
	public static void main(String[] args) {
		List<Book> books = readFromCSV("C:\\Users\\hi\\Desktop\\Book.txt");
		//C:\Users\hi\Desktop
		 for (Book b : books) {
	            System.out.println(b);
	        }
	}
	
	static List<Book> readFromCSV(String fileName)
	{
		List<Book> books=new ArrayList<>();
		Path path=Paths.get(fileName);
		try {
			BufferedReader reader=Files.newBufferedReader(path,StandardCharsets.US_ASCII);
			String line=reader.readLine();
			while (null != line) {
				String[] attributes = line.split(",");
				Book book=createBook(attributes);
				books.add(book);
				line = reader.readLine();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	private static Book createBook(String[] metaData) {
		String bookName=metaData[0];
		float price=Float.parseFloat(metaData[1]);
		String author=metaData[2];
		return new Book(bookName, price, author);
	}

}
