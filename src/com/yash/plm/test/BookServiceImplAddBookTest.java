package com.yash.plm.test;

import com.yash.plm.exception.BookException;
import com.yash.plm.model.Book;
import com.yash.plm.service.BookService;
import com.yash.plm.serviceimpl.BookServiceImpl;

public class BookServiceImplAddBookTest {
	public static void main(String[] args) {
		BookService bookservice = new BookServiceImpl();
		Book book = new Book();
		book.setTitle("Java");
		book.setAuthor("Balaguruswami");
		book.setPrice(400);
		book.setPublisher("MaGraw Hill");
		book.setIsbn(1234l);
		try {
			bookservice.addBook(book);
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
}
