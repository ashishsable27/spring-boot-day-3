package com.example.book;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {

	public BookNotFoundException(Integer bookId) {
		super("Book Not found with Id:" + String.valueOf(bookId));
	}
}
