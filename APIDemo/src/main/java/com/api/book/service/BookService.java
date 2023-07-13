package com.api.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.book.customexceptions.InvalidBookIdException;
import com.api.book.dto.Book;

@Service
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(1, "Ramayana", "Hrishi Valmki"));
		list.add(new Book(2, "Wings Of fire", "APJ Abdul Kalam"));
		list.add(new Book(3, "Adventures of Tom Sawyer", "Mark Twain"));
		list.add(new Book(4, "Pride and Prejudice", "Jane Austen"));
		list.add(new Book(5, "To Kill a Mockingbird", "Harper Lee"));
		list.add(new Book(6, "1984", "George Orwell"));
		list.add(new Book(7, "The Great Gatsby", "F. Scott Fitzgerald"));
		list.add(new Book(8, "Moby Dick", "Herman Melville"));
		list.add(new Book(9, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
		list.add(new Book(10, "The Catcher in the Rye", "J.D. Salinger"));
		list.add(new Book(11, "The Lord of the Rings", "J.R.R. Tolkien"));
		list.add(new Book(12, "Alice's Adventures in Wonderland", "Lewis Carroll"));
		list.add(new Book(13, "Crime and Punishment", "Fyodor Dostoevsky"));

	}

	// Fetch all books
	public List<Book> getAllBooks() {
		return list;
	}

	// Fetch single book
	public Book getBookById(int id) {
		try {
			for (Book b : list) {
				if (b.getId() == id) {
					return b;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Add book to list
	public void addBook(Book b) {
		System.out.println("Book In service layer");  
		list.add(b);
	}

	// delete book by Id
	public void deleteBook(int bid) {
		try {
			for (Book book : list) {
				if (book.getId() == bid) {
					list.remove(book);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	//Delete All books
	
	public void deleteAllBooks() {
		try {
			list.removeAll(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}

	//Update book with the given Id
	public void updateBook(Book book,int bookId) {
		
		try {
			boolean flag = false;
			
			for(Book b : list) {
			if(b.getId() == bookId) {
				Book bb = getBookById(bookId);
				bb.setAuthor(book.getAuthor());
				bb.setName(book.getName());
				flag = true;
			}
		}
			if(flag == false) {
				System.out.println("Id of Book is not Matched ...");
				throw new InvalidBookIdException("Id Not Found..");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println("Caught the exception");  
		}
		

	}

}
